package com.example.saidi.foodesto.database.models.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.saidi.foodesto.database.models.models.DBProduct;

import java.util.List;

@Dao
public interface ProductDao {

    @Nullable
    @Query("SELECT * FROM Product")
    List<DBProduct> getProducts();

    @Nullable
    @Query("SELECT Id FROM Product ORDER BY ID DESC LIMIT 1")
    Long getLastProductAdded();

    @Nullable
    @Query("SELECT count(*) FROM Product WHERE NutritionGrades = 'e'")
    Long getGradeECount();

    @Nullable
    @Query("SELECT count(*) FROM Product WHERE NutritionGrades = 'd'")
    Long getGradeDCount();

    @Nullable
    @Query("SELECT count(*) FROM Product WHERE NutritionGrades = 'c'")
    Long getGradeCCount();

    @Nullable
    @Query("SELECT count(*) FROM Product WHERE NutritionGrades = 'b'")
    Long getGradeBCount();

    @Nullable
    @Query("SELECT count(*) FROM Product WHERE NutritionGrades = 'a'")
    Long getGradeACount();

    @Nullable
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(@NonNull DBProduct dbProduct);

    @Nullable
    @Delete
    void delete(@NonNull DBProduct dbProduct);
}
