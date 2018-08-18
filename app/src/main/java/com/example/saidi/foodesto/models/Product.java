
package com.example.saidi.foodesto.models;

import android.support.annotation.Nullable;

import com.example.saidi.foodesto.interfaces.IProduct;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable, IProduct {
    @SerializedName("image_front_thumb_url")
    private String imageFrontThumbUrl;
    @SerializedName("countries")
    private String countries;
    @SerializedName("serving_quantity")
    private String servingQuantity;
    @SerializedName("allergens_hierarchy")
    private List<Object> allergensHierarchy = null;
    @SerializedName("nutriments")
    @Nullable
    private Nutriments nutriments;
    @SerializedName("code")

    private String code;
    @SerializedName("_keywords")

    private List<String> keywords = null;
    @SerializedName("image_small_url")

    private String imageSmallUrl;
    @SerializedName("categories_hierarchy")

    private List<String> categoriesHierarchy = null;
    @SerializedName("additives_prev_n")

    private String additivesPrevN;
    @SerializedName("image_front_url")

    private String imageFrontUrl;
    @SerializedName("additives_n")

    private String additivesN;
    @SerializedName("additives_original_tags")

    private List<String> additivesOriginalTags = null;
    @SerializedName("additives_prev_tags")

    private List<String> additivesPrevTags = null;
    @SerializedName("additives_tags")

    private List<String> additivesTags = null;
    @SerializedName("ingredients_that_may_be_from_palm_oil_n")

    private String ingredientsThatMayBeFromPalmOilN;
    @SerializedName("nutrition_data_per")

    private String nutritionDataPer;
    @SerializedName("additives_prev")

    private String additivesPrev;
    @SerializedName("product_name_en")

    private String productNameEn;
    @SerializedName("product_quantity")

    private String productQuantity;
    @SerializedName("image_thumb_url")

    private String imageThumbUrl;

    @SerializedName("stores")

    private String stores;
    @SerializedName("categories")

    private String categories;
    @SerializedName("unknown_ingredients_n")

    private String unknownIngredientsN;
    @SerializedName("quantity")

    private String quantity;
    @SerializedName("ingredients_text")

    private String ingredientsText;
    @SerializedName("brands")

    private String brands;
    @SerializedName("nutrient_levels_tags")

    private List<String> nutrientLevelsTags = null;
    @SerializedName("ingredients_n")

    private String ingredientsN;
    @SerializedName("nutrition_grades")

    private String nutritionGrades;
    @SerializedName("additives")

    private String additives;
    @SerializedName("additives_old_tags")

    private List<String> additivesOldTags = null;
    @SerializedName("ingredients_from_palm_oil_n")

    private String ingredientsFromPalmOilN;
    @SerializedName("product_name")

    private String productName;

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

    // TODO : delete comments
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<Object> getAllergensHierarchy() {
        return allergensHierarchy;
    }

    public void setAllergensHierarchy(List<Object> allergensHierarchy) {
        this.allergensHierarchy = allergensHierarchy;
    }

    public Nutriments getNutriments() {
        return nutriments;
    }

    public void setNutriments(Nutriments nutriments) {
        this.nutriments = nutriments;
    }

    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    public List<String> getCategoriesHierarchy() {
        return categoriesHierarchy;
    }

    public void setCategoriesHierarchy(List<String> categoriesHierarchy) {
        this.categoriesHierarchy = categoriesHierarchy;
    }

    public String getAdditivesPrevN() {
        return additivesPrevN;
    }

    public void setAdditivesPrevN(String additivesPrevN) {
        this.additivesPrevN = additivesPrevN;
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

    public List<String> getAdditivesOriginalTags() {
        return additivesOriginalTags;
    }

    public void setAdditivesOriginalTags(List<String> additivesOriginalTags) {
        this.additivesOriginalTags = additivesOriginalTags;
    }

    public List<String> getAdditivesPrevTags() {
        return additivesPrevTags;
    }

    public void setAdditivesPrevTags(List<String> additivesPrevTags) {
        this.additivesPrevTags = additivesPrevTags;
    }

    public List<String> getAdditivesTags() {
        return additivesTags;
    }

    public void setAdditivesTags(List<String> additivesTags) {
        this.additivesTags = additivesTags;
    }


    public String getNutritionDataPer() {
        return nutritionDataPer;
    }

    public void setNutritionDataPer(String nutritionDataPer) {
        this.nutritionDataPer = nutritionDataPer;
    }

    public String getAdditivesPrev() {
        return additivesPrev;
    }

    public void setAdditivesPrev(String additivesPrev) {
        this.additivesPrev = additivesPrev;
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

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getUnknownIngredientsN() {
        return unknownIngredientsN;
    }

    public void setUnknownIngredientsN(String unknownIngredientsN) {
        this.unknownIngredientsN = unknownIngredientsN;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getIngredientsText() {
        return ingredientsText;
    }

    public void setIngredientsText(String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public List<String> getNutrientLevelsTags() {
        return nutrientLevelsTags;
    }

    public void setNutrientLevelsTags(List<String> nutrientLevelsTags) {
        this.nutrientLevelsTags = nutrientLevelsTags;
    }

    public String getIngredientsN() {
        return ingredientsN;
    }

    public void setIngredientsN(String ingredientsN) {
        this.ingredientsN = ingredientsN;
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

    public List<String> getAdditivesOldTags() {
        return additivesOldTags;
    }

    public void setAdditivesOldTags(List<String> additivesOldTags) {
        this.additivesOldTags = additivesOldTags;
    }

    public String getIngredientsFromPalmOilN() {
        return ingredientsFromPalmOilN;
    }

    public void setIngredientsFromPalmOilN(String ingredientsFromPalmOilN) {
        this.ingredientsFromPalmOilN = ingredientsFromPalmOilN;
    }

    public String getIngredientsThatMayBeFromPalmOilN() {
        return ingredientsThatMayBeFromPalmOilN;
    }

    public void setIngredientsThatMayBeFromPalmOilN(String ingredientsThatMayBeFromPalmOilN) {
        this.ingredientsThatMayBeFromPalmOilN = ingredientsThatMayBeFromPalmOilN;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
