package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;

import butterknife.BindView;

public class HomePurchaceFragment extends BaseFragment {

    public static final String EXTRA_BAR_CODE_NUMBER = "bar_code_number";

    @BindView(R.id.textView2)
    protected TextView mBarCodeTextView;

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
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        String barCode;
        if (bundle != null) {
            barCode = bundle.getString(EXTRA_BAR_CODE_NUMBER);
            mBarCodeTextView.setText(barCode);
        }

    }


}
