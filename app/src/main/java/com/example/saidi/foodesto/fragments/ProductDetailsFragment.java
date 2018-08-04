package com.example.saidi.foodesto.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.models.NutrimentQuality;
import com.example.saidi.foodesto.models.NutrimentType;
import com.example.saidi.foodesto.models.Nutriments;
import com.example.saidi.foodesto.models.Product;
import com.example.saidi.foodesto.models.SeverityType;
import com.example.saidi.foodesto.utils.NutrimentsUtils;
import com.example.saidi.foodesto.utils.StringUtils;
import com.example.saidi.foodesto.views.ProductPropertieView;

import butterknife.BindView;

public class ProductDetailsFragment extends BaseFragment {

    public static final String EXTRA_PODUCT = "bar_code_number";

    @BindView(R.id.product_image_view)
    protected ImageView mProductImage;
    @BindView(R.id.product_title)
    protected TextView mProductTitle;
    @BindView(R.id.product_subtitle)
    protected TextView mProductSubtitle;
    @BindView(R.id.product_properties_container)
    protected LinearLayout mProductPropertiesContainer;
    @BindView(R.id.product_additives_container)
    protected LinearLayout mProductAdditivesContainer;
    private Product mProduct;

    private Context mContext;
    private String nutritionDataPer;

    public ProductDetailsFragment() {
    }

    public static BaseFragment newInstance(@Nullable final Product product) {
        ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
        final Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_PODUCT, product);
        productDetailsFragment.setArguments(bundle);
        return productDetailsFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_product_detail;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
        Bundle bundle = getArguments();
        if (bundle != null) {
            mProduct = (Product) bundle.getSerializable(EXTRA_PODUCT);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (mProduct != null) {
            mProductTitle.setText(mProduct.getProductName());
            mProductSubtitle.setText(mProduct.getBrands());
            Glide.with(mProductImage.getContext())
                    .load(mProduct.getImageThumbUrl())
                    .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background))
                    .into(mProductImage);
            Nutriments nutriments = mProduct.getNutriments();
            if (nutriments != null) {
                String salt = nutriments.getSalt();
                nutritionDataPer = mProduct.getNutritionDataPer();

                for (String s : mProduct.getKeywords()) {
                    if (s.toLowerCase().equals("bio") || s.toLowerCase().equals("biologique") || s.toLowerCase().equals("biologic")) {
                        ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
                        productPropertieView.bind(NutrimentType.BIO, "", "", SeverityType.GOOD);
                        mProductPropertiesContainer.addView(productPropertieView);
                    }
                }

                if (!StringUtils.isNullOrEmpty(salt)) {
                    buildAndAddView(salt, NutrimentType.SALT);
                }
                String fat = nutriments.getFat();
                if (!StringUtils.isNullOrEmpty(fat)) {
                    buildAndAddView(fat, NutrimentType.FAT);
                }
                String proteins = nutriments.getProteins();
                if (!StringUtils.isNullOrEmpty(proteins)) {
                    buildAndAddView(proteins, NutrimentType.PROTEINS);
                }

                String sugars = nutriments.getSugars();
                if (!StringUtils.isNullOrEmpty(sugars)) {
                    buildAndAddView(sugars, NutrimentType.SUGAR);
                }

                String energy = nutriments.getEnergyValue();
                if (!StringUtils.isNullOrEmpty(energy)) {
                    buildAndAddView(energy, NutrimentType.ENERGIE);
                }

                if (!StringUtils.isNullOrEmpty(nutriments.getFiber())) {
                    buildAndAddView(nutriments.getFiber(), NutrimentType.FIBER);
                }

                String additivesN = mProduct.getAdditivesN();

                if (!StringUtils.isNullOrEmpty(additivesN) && Integer.parseInt(additivesN) > 0) {
                    ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
                    productPropertieView.bind(NutrimentType.ADDITIVE, additivesN, "", SeverityType.BAD);
                    mProductAdditivesContainer.addView(productPropertieView);
                } else {
                    mProductAdditivesContainer.setVisibility(View.GONE);
                }
            } else {
                mProductPropertiesContainer.setVisibility(View.GONE);
                //TODO : Handle error
            }

        }

    }

    private void buildAndAddView(@NonNull final String propertie, @NonNull final NutrimentType nutrimentType) {
        ProductPropertieView productPropertieView = new ProductPropertieView(mContext);
        NutrimentQuality propertieQuality = NutrimentsUtils.getPropertieQuality(propertie, nutritionDataPer, nutrimentType);
        productPropertieView.bind(nutrimentType, propertie, propertieQuality.getmQualityTitle(), propertieQuality.getSeverityType());
        mProductPropertiesContainer.addView(productPropertieView);
    }


}
