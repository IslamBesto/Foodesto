package com.example.saidi.foodesto;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.saidi.foodesto.activities.BarCodeActivity;
import com.example.saidi.foodesto.common.activities.BaseActivity;
import com.example.saidi.foodesto.fragments.HomePurchaceFragment;
import com.example.saidi.foodesto.fragments.HomeStatisticsFragment;
import com.example.saidi.foodesto.models.Foodesto;
import com.example.saidi.foodesto.network.NetworkManager;
import com.example.saidi.foodesto.views.BottomNavigationWithFabView;
import com.example.saidi.foodesto.views.CurvedBottomNavigationView;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {


    public static final String KEY_BAR_CODE = "bar_code";
    private static final String TAG = MainActivity.class.getName();
    private static final int DEFAULT_HOME_ITEM = R.id.home_statistics_nav_menu_item;
    @BindView(R.id.bottom_navigation_bar_fab)
    protected BottomNavigationWithFabView mBottomNavigationViewWithFab;
    // Permission List
    private String[] REQUEST_PERMISSIONS = new String[]{android.Manifest.permission.CAMERA};
    // Permission Request Code
    private int RESULT_PERMISSIONS = 0x9000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBottomNavigationViewWithFab.addMenuItem(getString(R.string.home_statistics_label),
                R.drawable.ic_bar_chart, R.id.home_statistics_nav_menu_item);
        mBottomNavigationViewWithFab.addMenuItemWithoutIcon(getString(R.string.home_scan_label),
                R.id.home_scan_nav_menu_item);
        mBottomNavigationViewWithFab.addMenuItem(getString(R.string.home_cart_purchase),
                R.drawable.ic_shopping_basket, R.id.home_purchace_nav_menu_item);
        final CurvedBottomNavigationView curvedBottomNavigationView = mBottomNavigationViewWithFab.getCurvedBottomNavigationView();
        curvedBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (curvedBottomNavigationView.getSelectedItemId() == item.getItemId()) {
                    return false;
                }
                clearBackStack();
                switch (item.getItemId()) {
                    case R.id.home_statistics_nav_menu_item:
                        // Home Fragment
                        pushFragment(HomeStatisticsFragment.newInstance());
                        return true;
                    case R.id.home_scan_nav_menu_item:
                        // pushFragment(HomeDocumentsFragment.newInstance());
                        if (isPermissionGranted()) startBarCodeActivity();
                        return true;
                    case R.id.home_purchace_nav_menu_item:
                        pushFragment(HomePurchaceFragment.newInstance(null));
                        return true;
                }
                return false;
            }
        });
        curvedBottomNavigationView.setSelectedItemId(DEFAULT_HOME_ITEM);
        NetworkManager.INSTANCE.getFoodestoServices().getProductDetails("737628064502.json").enqueue(new Callback<Foodesto>() {
            @Override
            public void onResponse(@NonNull Call<Foodesto> call, @NonNull Response<Foodesto> response) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                // mJson.setText(response.body().getCode());

            }

            @Override
            public void onFailure(@NonNull Call<Foodesto> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }

    /**
     * Request permission and check
     */
    private boolean isPermissionGranted() {
        int sdkVersion = Build.VERSION.SDK_INT;
        if (sdkVersion >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(MainActivity.this, REQUEST_PERMISSIONS, RESULT_PERMISSIONS);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    /**
     * Go to camera preview
     */
    private void startBarCodeActivity() {
        startActivityForResult(new Intent(this, BarCodeActivity.class), 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            pushFragment(HomePurchaceFragment.newInstance(data.getStringExtra(KEY_BAR_CODE)));
            mBottomNavigationViewWithFab.getCurvedBottomNavigationView().getMenu().findItem(R.id.home_purchace_nav_menu_item).setChecked(true);
        }
    }

    /**
     * Post-process for granted permissions
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        if (RESULT_PERMISSIONS == requestCode) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted
                startBarCodeActivity();
            } else {
                // Rejected
                Toast.makeText(this, "Error permission", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public void pushFragment(final BaseFragment fragment) {
        pushFragment(fragment, true);
    }

    public void pushFragment(final BaseFragment fragment, final boolean addToBackstack) {
        replaceFragment(R.id.fragment_container_layout, fragment, addToBackstack);
    }

}
