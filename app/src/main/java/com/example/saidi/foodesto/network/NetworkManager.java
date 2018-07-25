package com.example.saidi.foodesto.network;

import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by saidi on 25/07/2018.
 */

public enum NetworkManager {
    INSTANCE;

    private static final String TAG = NetworkManager.class.getName();
    private static final int HTTP_TIMEOUT = 60;

    private FoodestoServices mFoodestoServices;

    NetworkManager() {
        final GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(
                new GsonBuilder()
                        .setDateFormat(NetworkConstant.DATE_FORMAT)
                        .setLenient()
                        .create());
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(HTTP_TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(HTTP_TIMEOUT, TimeUnit.SECONDS)
                .build();

        mFoodestoServices = new Retrofit.Builder()
                .baseUrl(NetworkConstant.FOODESTO_BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .client(okHttpClient)
                .build().create(FoodestoServices.class);
    }

    public FoodestoServices getFoodestoServices() {
        return mFoodestoServices;
    }

}
