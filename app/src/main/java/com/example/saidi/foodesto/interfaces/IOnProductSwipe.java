package com.example.saidi.foodesto.interfaces;


import com.example.saidi.foodesto.database.models.models.DBProduct;

public interface IOnProductSwipe {
    void onProductSwipe(DBProduct dbProduct, int position);
}
