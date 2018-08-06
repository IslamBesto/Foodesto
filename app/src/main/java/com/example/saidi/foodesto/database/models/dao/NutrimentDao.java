package com.example.saidi.foodesto.database.models.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.saidi.foodesto.database.models.models.DBNutriment;

import java.util.List;

@Dao
public interface NutrimentDao {

    @Insert
    void insert(@NonNull DBNutriment dbNutriment);

    @Nullable
    @Query("SELECT * FROM Nutriment WHERE Id NOT NULL")
    List<DBNutriment> getNutriment();

    @Nullable
    @Query("SELECT * FROM Nutriment WHERE Id=:id")
    DBNutriment getNutrimentById(@NonNull Long id);

    @Nullable
    @Query("SELECT Id FROM Nutriment ORDER BY ID DESC LIMIT 1")
    Long getLastNutrimentAdded();
}
