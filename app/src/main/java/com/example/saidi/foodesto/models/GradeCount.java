package com.example.saidi.foodesto.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.support.annotation.Nullable;

@Entity
public class GradeCount {
    @ColumnInfo(name = "count")
    @Nullable
    private int count;
    @ColumnInfo(name = "NutritionGrades")
    @Nullable
    private String NutritionGrades;

    public GradeCount(@Nullable final int count, @Nullable final String NutritionGrades) {
        this.count = count;
        this.NutritionGrades = NutritionGrades;
    }

    @Nullable
    public int getCount() {
        return count;
    }

    public void setCount(@Nullable int count) {
        this.count = count;
    }

    @Nullable
    public String getNutritionGrades() {
        return NutritionGrades;
    }

    public void setNutritionGrades(@Nullable String nutritionGrades) {
        this.NutritionGrades = nutritionGrades;
    }
}
