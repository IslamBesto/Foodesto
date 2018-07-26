package com.example.saidi.foodesto;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Toast;

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


    private static final String TAG = MainActivity.class.getName();
    private static final int DEFAULT_HOME_ITEM = R.id.home_statistics_nav_menu_item;

    @BindView(R.id.bottom_navigation_bar_fab)
    protected BottomNavigationWithFabView mBottomNavigationViewWithFab;

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
                        return true;
                    case R.id.home_purchace_nav_menu_item:
                        pushFragment(HomePurchaceFragment.newInstance());
                        return true;
                }
                return false;
            }
        });
        curvedBottomNavigationView.setSelectedItemId(DEFAULT_HOME_ITEM);
        NetworkManager.INSTANCE.getFoodestoServices().getProductDetails("737628064502.json").enqueue(new Callback<Foodesto>() {
            @Override
            public void onResponse(Call<Foodesto> call, Response<Foodesto> response) {
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                // mJson.setText(response.body().getCode());

            }

            @Override
            public void onFailure(Call<Foodesto> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });

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
