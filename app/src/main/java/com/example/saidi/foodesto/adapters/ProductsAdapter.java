package com.example.saidi.foodesto.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.adapters.holders.ProductHolder;
import com.example.saidi.foodesto.database.models.models.DBProduct;
import com.example.saidi.foodesto.interfaces.IOnAdapterItemClickListener;

import java.util.List;


public class ProductsAdapter extends RecyclerView.Adapter<ProductHolder> {

    private final List<DBProduct> mDbProducts;
    private final IOnAdapterItemClickListener<DBProduct> mListener;

    public ProductsAdapter(@NonNull final List<DBProduct> dbProducts, @Nullable IOnAdapterItemClickListener<DBProduct> listener) {
        mListener = listener;
        mDbProducts = dbProducts;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_product_item, parent, false);
        final ProductHolder productHolder = new ProductHolder(view);
        productHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assert mListener != null;
                mListener.onAdapterItemClickListener(productHolder, mDbProducts.get(productHolder.getAdapterPosition()));
            }
        });
        return productHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        holder.bind(mDbProducts.get(position));
    }

    @Override
    public int getItemCount() {
        return mDbProducts.size();
    }

    public void removeItem(int position) {
        mDbProducts.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreItem(DBProduct dbProduct, int position) {
        mDbProducts.add(position, dbProduct);
        notifyItemInserted(position);
    }
}
