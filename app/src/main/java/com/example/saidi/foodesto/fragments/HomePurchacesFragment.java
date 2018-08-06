package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.adapters.ProductsAdapter;
import com.example.saidi.foodesto.database.models.DatabaseFacade;
import com.example.saidi.foodesto.database.models.models.DBProduct;
import com.example.saidi.foodesto.interfaces.IHomeFragment;
import com.example.saidi.foodesto.interfaces.IOnAdapterItemClickListener;

import java.util.List;

import butterknife.BindView;


public class HomePurchacesFragment extends BaseFragment implements IHomeFragment {
    @BindView(R.id.products_purchaced_list)
    protected RecyclerView mProductsRv;

    private List<DBProduct> mDbProducts;

    public static BaseFragment newInstance() {
        return new HomePurchacesFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_purchaces;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mProductsRv.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mProductsRv.setLayoutManager(
                layoutManager);
        mProductsRv.setNestedScrollingEnabled(false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mProductsRv.getContext(),
                layoutManager.VERTICAL);
        mProductsRv.addItemDecoration(dividerItemDecoration);
        DatabaseFacade.INSTANCE.getProducts(new DatabaseFacade.DatabaseCallback<List<DBProduct>>() {
            @Override
            public void databaseCallback(@Nullable final List<DBProduct> result) {
                ProductsAdapter productsAdapter = new ProductsAdapter(result, new IOnAdapterItemClickListener<DBProduct>() {
                    @Override
                    public void onAdapterItemClickListener(@Nullable RecyclerView.ViewHolder viewHolder, @NonNull DBProduct dbProduct) {
                        //Toast.makeText(getContext(), "Open details", Toast.LENGTH_SHORT).show();
                        getMainActivity().pushFragment(ProductDetailsFragment.newInstance(dbProduct));
                    }
                });
                mProductsRv.setAdapter(productsAdapter);
            }
        });

    }
}
