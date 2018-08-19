package com.example.saidi.foodesto.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saidi.foodesto.R;
import com.example.saidi.foodesto.adapters.holders.AdditiveHolder;
import com.example.saidi.foodesto.models.Additive;

import java.util.List;

public class AdditivesAdapter extends RecyclerView.Adapter<AdditiveHolder> {
    private List<Additive> mAdditives;

    public AdditivesAdapter(List<Additive> mAdditives) {
        this.mAdditives = mAdditives;
    }

    @NonNull
    @Override
    public AdditiveHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_additive_item, parent, false);
        return new AdditiveHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdditiveHolder holder, int position) {
        Additive additive = mAdditives.get(position);
        if (additive != null) {
            holder.bind(additive);
        }
    }

    @Override
    public int getItemCount() {
        return mAdditives.size();
    }
}
