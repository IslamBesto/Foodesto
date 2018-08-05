package com.example.saidi.foodesto.database.models;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.example.saidi.foodesto.database.models.models.DBNutriment;

import java.util.List;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "Product",
        foreignKeys = @ForeignKey(entity = DBNutriment.class, parentColumns = "Id", childColumns = "NutrimentId", onDelete = CASCADE),
        indices = {@Index("ProjectId")})

public class DBProduct {

    @PrimaryKey
    @ColumnInfo(name = "Id")
    @NonNull
    private Long id;
    @ColumnInfo(name = "NutrimentId")
    private Long nutrimentID;
    @ColumnInfo(name = "ImageFrontThumbUrl")
    private String imageFrontThumbUrl;
    @ColumnInfo(name = "Countries")
    private String countries;
    @ColumnInfo(name = "ServingQuantity")
    private String servingQuantity;
    @ColumnInfo(name = "Keywords")
    private List<String> keywords = null;
    @ColumnInfo(name = "ImageSmalUrl")
    private String imageSmallUrl;
    @ColumnInfo(name = "ImageFrontUrl")
    private String imageFrontUrl;
    @ColumnInfo(name = "AdditivesN")
    private String additivesN;
    @ColumnInfo(name = "NutritionDataPer")
    private String nutritionDataPer;
    @ColumnInfo(name = "ProductNameEn")
    private String productNameEn;
    @ColumnInfo(name = "ProductQuantity")
    private String productQuantity;
    @ColumnInfo(name = "ImageThumbUrl")
    private String imageThumbUrl;
    @ColumnInfo(name = "Stores")
    private String stores;
    @ColumnInfo(name = "Brands")
    private String brands;
    @ColumnInfo(name = "NutritionGrades")
    private String nutritionGrades;
    @ColumnInfo(name = "Additives")
    private String additives;
    @ColumnInfo(name = "ProductName")
    private String productName;

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public String getImageFrontThumbUrl() {
        return imageFrontThumbUrl;
    }

    public void setImageFrontThumbUrl(String imageFrontThumbUrl) {
        this.imageFrontThumbUrl = imageFrontThumbUrl;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getServingQuantity() {
        return servingQuantity;
    }

    public void setServingQuantity(String servingQuantity) {
        this.servingQuantity = servingQuantity;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    public String getImageFrontUrl() {
        return imageFrontUrl;
    }

    public void setImageFrontUrl(String imageFrontUrl) {
        this.imageFrontUrl = imageFrontUrl;
    }

    public String getAdditivesN() {
        return additivesN;
    }

    public void setAdditivesN(String additivesN) {
        this.additivesN = additivesN;
    }

    public String getNutritionDataPer() {
        return nutritionDataPer;
    }

    public void setNutritionDataPer(String nutritionDataPer) {
        this.nutritionDataPer = nutritionDataPer;
    }

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public void setImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getNutritionGrades() {
        return nutritionGrades;
    }

    public void setNutritionGrades(String nutritionGrades) {
        this.nutritionGrades = nutritionGrades;
    }

    public String getAdditives() {
        return additives;
    }

    public void setAdditives(String additives) {
        this.additives = additives;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
