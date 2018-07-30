package com.example.saidi.foodesto.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * This code is taken from an example found on github
 * You can find it on this link : https://github.com/ML4Mobile/MLKitBarcodeAndroid
 */

public class CodeBarDetectorView extends View {

    private Rect mRect;

    public CodeBarDetectorView(Context c) {
        super(c);
    }

    public void setOverlay(Rect rect) {
        mRect = rect;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (mRect != null) {
            @SuppressLint("DrawAllocation")
            Paint mPaint = new Paint();
            mPaint.setColor(Color.GREEN);
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setStrokeWidth(4.5f);
            canvas.drawRect(mRect, mPaint);
        }
    }
}
