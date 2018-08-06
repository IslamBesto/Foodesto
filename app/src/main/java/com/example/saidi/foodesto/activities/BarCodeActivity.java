package com.example.saidi.foodesto.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.models.Foodesto;
import com.example.saidi.foodesto.network.NetworkManager;
import com.example.saidi.foodesto.views.CameraView;
import com.example.saidi.foodesto.views.CodeBarDetectorView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetector;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BarCodeActivity extends AppCompatActivity {

    public static final String KEY_BAR_CODE = "bar_code";
    private static final String KEY_PRODUCT = "product";
    @BindView(R.id.container)
    protected FrameLayout mContainer;
    private CameraView camView;
    private CodeBarDetectorView overlay;
    private double overlayScale = -1;

    /**
     * Get facing back camera instance
     */
    public static Camera getCameraInstance() {
        int camId = -1;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i = 0; i < Camera.getNumberOfCameras(); ++i) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == Camera.CameraInfo.CAMERA_FACING_BACK) {
                camId = i;
                break;
            }
        }

        if (camId == -1) return null;

        Camera c = null;
        try {
            c = Camera.open(camId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Full Screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Fix orientation : portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Set layout
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        // Initialize Camera
        Camera cam = getCameraInstance();

        // Set-up preview screen
        if (cam != null) {
            // Create overlay view
            overlay = new CodeBarDetectorView(this);

            // Create barcode processor for ISBN
            CustomPreviewCallback camCallback = new CustomPreviewCallback(CameraView.PREVIEW_WIDTH, CameraView.PREVIEW_HEIGHT);
            camCallback.setBarcodeDetectedListener(new OnBarcodeListener() {
                @Override
                public void onIsbnDetected(FirebaseVisionBarcode barcode) {
                    overlay.setOverlay(fitOverlayRect(barcode.getBoundingBox()));
                    overlay.invalidate();
                }
            });

            // Create camera preview
            camView = new CameraView(this, cam);
            camView.setPreviewCallback(camCallback);

            // Add view to UI
            mContainer.addView(camView);
            mContainer.addView(overlay);
        }
    }

    protected int getLayoutId() {
        return R.layout.activity_bar_code;
    }

    /**
     * Calculate overlay scale factor
     */
    private Rect fitOverlayRect(Rect r) {
        if (overlayScale <= 0) {
            Camera.Size prevSize = camView.getPreviewSize();
            overlayScale = (double) overlay.getWidth() / (double) prevSize.height;
        }

        return new Rect((int) (r.left * overlayScale), (int) (r.top * overlayScale), (int) (r.right * overlayScale), (int) (r.bottom * overlayScale));
    }

    private interface OnBarcodeListener {
        void onIsbnDetected(FirebaseVisionBarcode barcode);
    }

    /**
     * Post-processor for preview image streams
     */
    private class CustomPreviewCallback implements Camera.PreviewCallback, OnSuccessListener<List<FirebaseVisionBarcode>>, OnFailureListener {

        private FirebaseVisionBarcodeDetectorOptions options;
        private FirebaseVisionBarcodeDetector detector;
        private FirebaseVisionImageMetadata metadata;

        private OnBarcodeListener mBarcodeDetectedListener = null;
        private int mImageWidth, mImageHeight;

        CustomPreviewCallback(int imageWidth, int imageHeight) {
            mImageWidth = imageWidth;
            mImageHeight = imageHeight;

            options = new FirebaseVisionBarcodeDetectorOptions.Builder()
                    .setBarcodeFormats(FirebaseVisionBarcode.FORMAT_EAN_13)
                    .build();

            detector = FirebaseVision.getInstance().getVisionBarcodeDetector(options);

            metadata = new FirebaseVisionImageMetadata.Builder()
                    .setFormat(ImageFormat.NV21)
                    .setWidth(mImageWidth)
                    .setHeight(mImageHeight)
                    .setRotation(FirebaseVisionImageMetadata.ROTATION_90)
                    .build();
        }

        public void setBarcodeDetectedListener(OnBarcodeListener mBarcodeDetectedListener) {
            this.mBarcodeDetectedListener = mBarcodeDetectedListener;
        }

        @Override
        public void onPreviewFrame(byte[] data, Camera camera) {
            try {
                detector.detectInImage(FirebaseVisionImage.fromByteArray(data, metadata))
                        .addOnSuccessListener(this)
                        .addOnFailureListener(this);
            } catch (Exception e) {
                Log.d("CameraView", "parse error");
            }
        }

        @Override
        public void onSuccess(List<FirebaseVisionBarcode> barcodes) {
            // Task completed successfully
            for (FirebaseVisionBarcode barcode : barcodes) {

                int valueType = barcode.getValueType();
                if (valueType == FirebaseVisionBarcode.TYPE_PRODUCT) {
                    mBarcodeDetectedListener.onIsbnDetected(barcode);
                    NetworkManager.INSTANCE.getFoodestoServices().getProductDetails(barcodes.get(0).getRawValue() + ".json").enqueue(new Callback<Foodesto>() {
                        @Override
                        public void onResponse(@NonNull Call<Foodesto> call, @NonNull Response<Foodesto> response) {
                            Intent BackIntent = new Intent();
                            Foodesto body = response.body();
                            if (body != null) {
                                BackIntent.putExtra(KEY_PRODUCT, body.getProduct());
                                setResult(RESULT_OK, BackIntent);
                                finish();
                            }

                        }

                        @Override
                        public void onFailure(@NonNull Call<Foodesto> call, @NonNull Throwable t) {

                        }
                    });
                    return;
                }
            }
        }

        @Override
        public void onFailure(@NonNull Exception e) {
            // Task failed with an exception
            Log.i("Barcode", "read fail");
        }
    }
}
