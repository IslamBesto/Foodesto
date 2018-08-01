package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.models.Foodesto;
import com.example.saidi.foodesto.network.NetworkManager;

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
        Toast.makeText(getContext(), mBarCode + "", Toast.LENGTH_SHORT).show();
        NetworkManager.INSTANCE.getFoodestoServices().getProductDetails(mBarCode + ".json").enqueue(new Callback<Foodesto>() {
            @Override
            public void onResponse(@NonNull Call<Foodesto> call, @NonNull Response<Foodesto> response) {
                mProductTitle.setText(response.body().toString());
            }

            @Override
            public void onFailure(@NonNull Call<Foodesto> call, @NonNull Throwable t) {
                Toast.makeText(getContext(), "Failed " + t.getCause(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
