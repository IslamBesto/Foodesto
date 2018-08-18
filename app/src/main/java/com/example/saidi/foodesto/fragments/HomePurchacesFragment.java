package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.adapters.ProductsAdapter;
import com.example.saidi.foodesto.adapters.holders.ProductHolder;
import com.example.saidi.foodesto.database.models.DatabaseFacade;
import com.example.saidi.foodesto.database.models.models.DBProduct;
import com.example.saidi.foodesto.interfaces.IHomeFragment;
import com.example.saidi.foodesto.interfaces.IOnAdapterItemClickListener;
import com.example.saidi.foodesto.utils.RecyclerItemTouchHelper;

import java.util.List;

import butterknife.BindView;


public class HomePurchacesFragment extends BaseFragment implements IHomeFragment, RecyclerItemTouchHelper.RecyclerItemTouchHelperListener {
    @BindView(R.id.products_purchaced_list)
    protected RecyclerView mProductsRv;

    private List<DBProduct> mDbProducts;
    private ProductsAdapter mProductsAdapter;

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
        getBaseActivity().getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getBaseActivity().getSupportActionBar().setTitle(getString(R.string.home_cart_purchase));
        mProductsRv.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mProductsRv.setLayoutManager(
                layoutManager);
        mProductsRv.setNestedScrollingEnabled(false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mProductsRv.getContext(),
                LinearLayoutManager.VERTICAL);
        mProductsRv.addItemDecoration(dividerItemDecoration);
        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT, this);
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(mProductsRv);


        DatabaseFacade.INSTANCE.getProducts(new DatabaseFacade.DatabaseCallback<List<DBProduct>>() {
            @Override
            public void databaseCallback(@Nullable final List<DBProduct> result) {
                mDbProducts = result;
                if (result != null) {
                    mProductsAdapter = new ProductsAdapter(result, new IOnAdapterItemClickListener<DBProduct>() {
                        @Override
                        public void onAdapterItemClickListener(@Nullable RecyclerView.ViewHolder viewHolder, @NonNull DBProduct dbProduct) {
                            //Toast.makeText(getContext(), "Open details", Toast.LENGTH_SHORT).show();
                            getMainActivity().pushFragment(ProductDetailsFragment.newInstance(dbProduct));
                        }
                    });
                }
                mProductsRv.setAdapter(mProductsAdapter);
            }
        });

    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position) {
        if (viewHolder instanceof ProductHolder) {
            // get the removed item name to display it in snack bar
            DBProduct dbProductToRemove = mDbProducts.get(viewHolder.getAdapterPosition());
            String name = dbProductToRemove.getProductName();

            // backup of removed item for undo purpose
            final DBProduct deletedItem = dbProductToRemove;
            final int deletedIndex = viewHolder.getAdapterPosition();

            // remove the item from recycler view
            mProductsAdapter.removeItem(viewHolder.getAdapterPosition());

            // showing snack bar with Undo option
            // TODO : add strings
            Snackbar snackbar = Snackbar
                    .make(mProductsRv, name + " removed from cart!", Snackbar.LENGTH_LONG);
            snackbar.setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // undo is selected, restore the deleted item
                    mProductsAdapter.restoreItem(deletedItem, deletedIndex);
                }
            });
            snackbar.setActionTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimaryDark));
            snackbar.show();
            DatabaseFacade.INSTANCE.deleteProduct(dbProductToRemove);
        }
    }
}
