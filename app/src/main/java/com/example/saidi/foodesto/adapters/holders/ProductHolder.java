package com.example.saidi.foodesto.adapters.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.database.models.models.DBProduct;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.product_image_view)
    protected ImageView mProductImage;
    @BindView(R.id.product_title)
    protected TextView mProductTitle;
    @BindView(R.id.product_subtitle)
    protected TextView mProductSubTitle;

    public ProductHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(@NonNull final DBProduct product) {
        mProductTitle.setText(product.getProductName());
        mProductSubTitle.setText(product.getBrands());
        Glide.with(mProductImage.getContext())
                .load(product.getImageThumbUrl())
                .apply(new RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background))
                .into(mProductImage);
    }
}
