package com.example.saidi.foodesto.utils;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;

import com.example.saidi.foodesto.R;

public final class AdditivesUtils {


    public static Drawable getBackGround(@NonNull Context context, @Nullable final String impact) {
        switch (impact.toLowerCase()) {
            case "very toxic":
                return ContextCompat.getDrawable(context, R.drawable.bg_circle_red);
            case "toxic":
                return ContextCompat.getDrawable(context, R.drawable.bg_circle_pink);
            case "doubtful":
                return ContextCompat.getDrawable(context, R.drawable.bg_circle_yellow);
            case "do not abuse":
                return ContextCompat.getDrawable(context, R.drawable.bg_circle_yellow);
            case "no / low toxicity":
                return ContextCompat.getDrawable(context, R.drawable.bg_circle_green);
            default:
                return ContextCompat.getDrawable(context, R.drawable.bg_circle_grey);

        }
    }
}
