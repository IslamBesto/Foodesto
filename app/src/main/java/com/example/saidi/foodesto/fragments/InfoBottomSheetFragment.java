package com.example.saidi.foodesto.fragments;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.R;

/**
 * Created by saidi on 08/08/2018.
 */

public class InfoBottomSheetFragment extends BottomSheetDialogFragment {
    public InfoBottomSheetFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.view_bottom_sheet_info, container, false);
    }
}
