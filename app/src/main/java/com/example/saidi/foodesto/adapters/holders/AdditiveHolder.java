package com.example.saidi.foodesto.adapters.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.models.Additive;
import com.example.saidi.foodesto.utils.AdditivesUtils;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AdditiveHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.additive_code)
    protected TextView mAdditiveCode;
    @BindView(R.id.additive_name)
    protected TextView mAdditiveName;
    @BindView(R.id.additive_impact)
    protected TextView mAdditiveImpact;
    @BindView(R.id.additive_impact_color)
    protected TextView mAdditiveImpatColor;

    public AdditiveHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(@NonNull final Additive additive) {
        mAdditiveCode.setText(additive.getCode());
        mAdditiveName.setText(additive.getName());
        mAdditiveImpact.setText(additive.getImpact());
        mAdditiveImpatColor.setBackground(AdditivesUtils.getBackGround(itemView.getContext(), additive.getImpact()));
    }
}
