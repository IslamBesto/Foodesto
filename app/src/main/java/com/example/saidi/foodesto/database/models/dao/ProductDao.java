package com.example.saidi.foodesto.database.models.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.saidi.foodesto.database.models.DBProduct;

import java.util.List;

@Dao
public interface ProductDao {

    @Nullable
    @Query("SELECT * FROM Product WHERE Id IS NULL")
    List<DBProduct> getProducts();

    @Nullable
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(@NonNull DBProduct dbProduct);
}
