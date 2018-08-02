package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.models.Foodesto;
import com.example.saidi.foodesto.models.NutrimentType;
import com.example.saidi.foodesto.models.Nutriments;
import com.example.saidi.foodesto.models.Product;
import com.example.saidi.foodesto.network.NetworkManager;
import com.example.saidi.foodesto.utils.NutrimentsUtils;
import com.example.saidi.foodesto.views.ProductPropertieView;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePurchaceFragment extends BaseFragment {

    public static final String EXTRA_BAR_CODE_NUMBER = "bar_code_number";

    @BindView(R.id.product_image_view)
    protected ImageView mProductImage;
    @BindView(R.id.product_title)
    protected TextView mProductTitle;
    @BindView(R.id.product_subtitle)
    protected TextView mProductSubtitle;
    @BindView(R.id.product_properties_container)
    protected LinearLayout mProductPropertiesContainer;
    private String mBarCode;

    public HomePurchaceFragment() {
    }

    public static BaseFragment newInstance(@Nullable final String barCodeNumber) {
        HomePurchaceFragment homePurchaceFragment = new HomePurchaceFragment();
        final Bundle bundle = new Bundle();
        bundle.putString(EXTRA_BAR_CODE_NUMBER, barCodeNumber);
        homePurchaceFragment.setArguments(bundle);
        return homePurchaceFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_purchace;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mBarCode = bundle.getString(EXTRA_BAR_CODE_NUMBER);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NetworkManager.INSTANCE.getFoodestoServices().getProductDetails(mBarCode + ".json").enqueue(new Callback<Foodesto>() {
            @Override
            public void onResponse(@NonNull Call<Foodesto> call, @NonNull Response<Foodesto> response) {
                Product product = response.body().getProduct();
                mProductTitle.setText(product.getProductName());
                mProductSubtitle.setText(product.getBrands());
                Glide.with(mProductImage.getContext())
                        .load(product.getImageThumbUrl())
                        .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background))
                        .into(mProductImage);
                Nutriments nutriments = product.getNutriments();
                String quantity = nutriments.getSalt();
                if (!quantity.isEmpty()) {
                    //TODO : add helper to calculate value quality of product
                    ProductPropertieView productPropertieView = new ProductPropertieView(getContext());
                    productPropertieView.bind(NutrimentType.SALT, quantity, NutrimentsUtils.getSaltQualiity(quantity));
                    mProductPropertiesContainer.addView(productPropertieView);
                }
                if (!nutriments.getFat().isEmpty()) {
                    ProductPropertieView productPropertieView = new ProductPropertieView(getContext());
                    productPropertieView.bind(NutrimentType.FAT, nutriments.getFat(), "Faible");
                    mProductPropertiesContainer.addView(productPropertieView);
                }

            }

            @Override
            public void onFailure(@NonNull Call<Foodesto> call, @NonNull Throwable t) {
                Toast.makeText(getContext(), "Failed " + t.getCause(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
