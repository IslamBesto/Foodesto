package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;

/**
 * Created by saidi on 26/07/2018.
 */

public class HomePurchaceFragment extends BaseFragment {
    public static BaseFragment newInstance() {
        return new HomePurchaceFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_purchace;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
