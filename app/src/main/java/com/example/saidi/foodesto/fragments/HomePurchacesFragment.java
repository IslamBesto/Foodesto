package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.BaseFragment;
import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.interfaces.IHomeFragment;


public class HomePurchacesFragment extends BaseFragment implements IHomeFragment {
    public static BaseFragment newInstance() {
        return new HomePurchacesFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_purchaces;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
