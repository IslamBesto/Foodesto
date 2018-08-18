package com.example.saidi.foodesto;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.saidi.foodesto.activities.BarCodeActivity;
import com.example.saidi.foodesto.common.activities.BaseActivity;
import com.example.saidi.foodesto.fragments.HomePurchacesFragment;
import com.example.saidi.foodesto.fragments.HomeStatisticsFragment;
import com.example.saidi.foodesto.fragments.ProductDetailsFragment;
import com.example.saidi.foodesto.interfaces.IHomeFragment;
import com.example.saidi.foodesto.models.Product;
import com.example.saidi.foodesto.views.BottomNavigationWithFabView;
import com.example.saidi.foodesto.views.CurvedBottomNavigationView;

import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements IHomeFragment {


    public static final String KEY_PRODUCT = "product";
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
                return selectFragment(item, curvedBottomNavigationView);
            }
        });
        MenuItem selectedItem =
                curvedBottomNavigationView.getMenu().getItem(0);
        selectFragment(selectedItem, curvedBottomNavigationView);
    }

    private boolean selectFragment(@NonNull MenuItem item, CurvedBottomNavigationView curvedBottomNavigationView) {
//        if (curvedBottomNavigationView.getSelectedItemId() == item.getItemId()) {
//            return false;
//        }
        clearBackStack();
        switch (item.getItemId()) {
            case R.id.home_statistics_nav_menu_item:
                // Home Fragment
                pushFragment(HomeStatisticsFragment.newInstance());
                return true;
            case R.id.home_scan_nav_menu_item:
                if (isPermissionGranted()) startBarCodeActivity();
                return true;
            case R.id.home_purchace_nav_menu_item:
                pushFragment(HomePurchacesFragment.newInstance());
                return true;
        }
        return false;
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
    public void onBackPressed() {
        final FragmentManager fragmentManager = getSupportFragmentManager();
        final int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (backStackEntryCount == 1) {
            CurvedBottomNavigationView curvedBottomNavigationView = mBottomNavigationViewWithFab.getCurvedBottomNavigationView();
            if (curvedBottomNavigationView.getSelectedItemId() == DEFAULT_HOME_ITEM) {
                finish();
                return;
            }
            final List<Fragment> fragments = fragmentManager.getFragments();
            if (fragments.get(backStackEntryCount
            ) instanceof IHomeFragment) {
                curvedBottomNavigationView.setSelectedItemId(DEFAULT_HOME_ITEM);
                return;
            }
        }
        super.onBackPressed();
    }

    @Override
    public boolean onNavigateUp() {
        // Pops Fragments in an Android way: Home is not BACK
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.getBackStackEntryCount() > 1) {
            for (int i = 0; i < supportFragmentManager.getBackStackEntryCount() - 1; ++i) {
                supportFragmentManager.popBackStack();
            }
            return true;
        }
        return false;
        // Otherwise: return super.onNavigateUp();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            pushFragment(ProductDetailsFragment.newInstance((Product) data.getSerializableExtra(KEY_PRODUCT)));
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
