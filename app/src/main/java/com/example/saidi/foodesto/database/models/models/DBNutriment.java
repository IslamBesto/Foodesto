package com.example.saidi.foodesto.database.models.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Nutriment")
public class DBNutriment {

    @PrimaryKey
    @ColumnInfo(name = "Id")
    @NonNull
    private Long id;
    @ColumnInfo(name = "Sugar")
    private String sugars;
    @ColumnInfo(name = "Fiber100g")
    private String fiber100g;
    @ColumnInfo(name = "NutritionScoreUk")
    private Integer nutritionScoreUk;
    @ColumnInfo(name = "Fat100g")
    private String fat100g;
    @ColumnInfo(name = "Salt")
    private String salt;
    @ColumnInfo(name = "FiberValue")
    private String fiberValue;
    @ColumnInfo(name = "ProteinsValue")
    private String proteinsValue;
    @ColumnInfo(name = "SaltValue")
    private String saltValue;
    @ColumnInfo(name = "Energy")
    private String energy;
    @ColumnInfo(name = "Fat")
    private String fat;
    @ColumnInfo(name = "Fiber")
    private String fiber;
    @ColumnInfo(name = "FatValue")
    private String fatValue;
    @ColumnInfo(name = "Carbohydrates")
    private String carbohydrates;
    @ColumnInfo(name = "Energyvalue")
    private String energyValue;
    @ColumnInfo(name = "SugarsValue")
    private String sugarsValue;
    @ColumnInfo(name = "Salt100g")
    private String salt100g;
    @ColumnInfo(name = "Energy100g")
    private String energy100g;
    @ColumnInfo(name = "Proteins")
    private String proteins;
    @ColumnInfo(name = "NutritionScoreFr")
    private Integer nutritionScoreFr;

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public String getSugars() {
        return sugars;
    }

    public void setSugars(String sugars) {
        this.sugars = sugars;
    }

    public String getFiber100g() {
        return fiber100g;
    }

    public void setFiber100g(String fiber100g) {
        this.fiber100g = fiber100g;
    }

    public Integer getNutritionScoreUk() {
        return nutritionScoreUk;
    }

    public void setNutritionScoreUk(Integer nutritionScoreUk) {
        this.nutritionScoreUk = nutritionScoreUk;
    }

    public String getFat100g() {
        return fat100g;
    }

    public void setFat100g(String fat100g) {
        this.fat100g = fat100g;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFiberValue() {
        return fiberValue;
    }

    public void setFiberValue(String fiberValue) {
        this.fiberValue = fiberValue;
    }

    public String getProteinsValue() {
        return proteinsValue;
    }

    public void setProteinsValue(String proteinsValue) {
        this.proteinsValue = proteinsValue;
    }

    public String getSaltValue() {
        return saltValue;
    }

    public void setSaltValue(String saltValue) {
        this.saltValue = saltValue;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getFiber() {
        return fiber;
    }

    public void setFiber(String fiber) {
        this.fiber = fiber;
    }

    public String getFatValue() {
        return fatValue;
    }

    public void setFatValue(String fatValue) {
        this.fatValue = fatValue;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(String energyValue) {
        this.energyValue = energyValue;
    }

    public String getSugarsValue() {
        return sugarsValue;
    }

    public void setSugarsValue(String sugarsValue) {
        this.sugarsValue = sugarsValue;
    }

    public String getSalt100g() {
        return salt100g;
    }

    public void setSalt100g(String salt100g) {
        this.salt100g = salt100g;
    }

    public String getEnergy100g() {
        return energy100g;
    }

    public void setEnergy100g(String energy100g) {
        this.energy100g = energy100g;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public Integer getNutritionScoreFr() {
        return nutritionScoreFr;
    }

    public void setNutritionScoreFr(Integer nutritionScoreFr) {
        this.nutritionScoreFr = nutritionScoreFr;
    }
}
