package com.example.saidi.foodesto.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.adapters.holders.ProductHolder;
import com.example.saidi.foodesto.database.models.models.DBProduct;

import java.util.List;


public class ProductsAdapter extends RecyclerView.Adapter<ProductHolder> {

    private List<DBProduct> dbProducts;

    public ProductsAdapter(List<DBProduct> dbProducts) {
        this.dbProducts = dbProducts;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_product_item, parent, false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        holder.bind(dbProducts.get(position));
    }

    @Override
    public int getItemCount() {
        return dbProducts.size();
    }
}
