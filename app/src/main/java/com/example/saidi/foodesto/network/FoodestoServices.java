package com.example.saidi.foodesto.network;

import com.example.saidi.foodesto.models.Foodesto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by saidi on 25/07/2018.
 */

public interface FoodestoServices {
    @GET("product/{id}")
    Call<Foodesto> getProductDetails(@Path("id") String bareCode);
}
