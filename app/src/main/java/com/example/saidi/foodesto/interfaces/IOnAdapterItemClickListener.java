package com.example.saidi.foodesto.interfaces;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

public interface IOnAdapterItemClickListener<T> {
    void onAdapterItemClickListener(@Nullable RecyclerView.ViewHolder viewHolder, @NonNull T item);
}
