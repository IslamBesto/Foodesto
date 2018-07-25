package com.example.saidi.foodesto;

import android.os.Bundle;
import android.widget.Toast;

import com.example.saidi.foodesto.common.activities.BaseActivity;
import com.example.saidi.foodesto.models.Foodesto;
import com.example.saidi.foodesto.network.NetworkManager;
import com.example.saidi.foodesto.views.BottomNavigationWithFabView;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {


    private static final String TAG = MainActivity.class.getName();

    @BindView(R.id.bottom_navigation_bar_fab)
    protected BottomNavigationWithFabView mBottomNavigationViewWithFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBottomNavigationViewWithFab.addMenuItem(getString(R.string.home_statistics_label),
                R.drawable.ic_bar_chart, R.id.home_nav_menu_item);
        mBottomNavigationViewWithFab.addMenuItemWithoutIcon(getString(R.string.home_scan_label),
                R.id.catalogue_nav_menu_item);
        mBottomNavigationViewWithFab.addMenuItem(getString(R.string.home_cart_purchase),
                R.drawable.ic_shopping_basket, R.id.project_nav_menu_item);
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
}
