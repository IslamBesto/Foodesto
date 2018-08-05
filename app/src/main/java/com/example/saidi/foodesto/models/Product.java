
package com.example.saidi.foodesto.models;

import android.support.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    @SerializedName("image_front_thumb_url")
    private String imageFrontThumbUrl;
    //    @SerializedName("informers_tags")
//    @Expose
//    private List<String> informersTags = null;
    @SerializedName("countries")
    private String countries;
    //    @SerializedName("photographers")
//    @Expose
//    private List<String> photographers = null;
//    @SerializedName("languages_tags")
//    @Expose
//    private List<String> languagesTags = null;
//    @SerializedName("countries_hierarchy")
//    @Expose
//    private List<String> countriesHierarchy = null;
//    @SerializedName("nutrition_score_debug")
//    @Expose
//    private String nutritionScoreDebug;
//    @SerializedName("nutrition_grades_tags")
//    @Expose
//    private List<String> nutritionGradesTags = null;
//    @SerializedName("generic_name")
//    @Expose
//    private String genericName;
//    @SerializedName("amino_acids_tags")
//    @Expose
//    private List<Object> aminoAcidsTags = null;
//    @SerializedName("no_nutrition_data")
//    @Expose
//    private String noNutritionData;
//    @SerializedName("created_t")
//    @Expose
//    private String createdT;
//    @SerializedName("labels_tags")
//    @Expose
//    private List<String> labelsTags = null;
//    @SerializedName("minerals_prev_tags")
//    @Expose
//    private List<Object> mineralsPrevTags = null;
//    @SerializedName("nutrition_score_warning_no_fruits_vegetables_nuts")
//    @Expose
//    private String nutritionScoreWarningNoFruitsVegetablesNuts;
    @SerializedName("serving_quantity")
    private String servingQuantity;
    //    @SerializedName("interface_version_modified")
//    @Expose
//    private String interfaceVersionModified;
//    @SerializedName("selected_images")
//    @Expose
//    private SelectedImages selectedImages;
//    @SerializedName("additives_debug_tags")
//    @Expose
//    private List<Object> additivesDebugTags = null;
//    @SerializedName("image_front_small_url")
//    @Expose
//    private String imageFrontSmallUrl;
    @SerializedName("allergens_hierarchy")
    private List<Object> allergensHierarchy = null;
    //    @SerializedName("new_additives_n")
//    @Expose
//    private String newAdditivesN;
//    @SerializedName("ingredients_text_with_allergens")
//    @Expose
//    private String ingredientsTextWithAllergens;
//    @SerializedName("additives_prev_original_tags")
//    @Expose
//    private List<String> additivesPrevOriginalTags = null;
    @SerializedName("nutriments")
    @Nullable
    private Nutriments nutriments;
    //    @SerializedName("code")
//    @Expose
//    private String code;
//    @SerializedName("image_ingredients_url")
//    @Expose
//    private String imageIngredientsUrl;
//    @SerializedName("additives_tags_n")
//    @Expose
//    private Object additivesTagsN;
//    @SerializedName("additives_old_n")
//    @Expose
//    private String additivesOldN;
//    @SerializedName("nutrition_data")
//    @Expose
//    private String nutritionData;
//    @SerializedName("ingredients_from_or_that_may_be_from_palm_oil_n")
//    @Expose
//    private String ingredientsFromOrThatMayBeFromPalmOilN;
    @SerializedName("_keywords")
    @Expose
    private List<String> keywords = null;
    //    @SerializedName("image_nutrition_thumb_url")
//    @Expose
//    private String imageNutritionThumbUrl;
//    @SerializedName("max_imgid")
//    @Expose
//    private String maxImgid;
//    @SerializedName("traces_debug_tags")
//    @Expose
//    private List<Object> tracesDebugTags = null;
//    @SerializedName("product_name_en_debug_tags")
//    @Expose
//    private List<Object> productNameEnDebugTags = null;
//    @SerializedName("languages_codes")
//    @Expose
//    private LanguagesCodes languagesCodes;
//    @SerializedName("purchase_places_tags")
//    @Expose
//    private List<Object> purchasePlacesTags = null;
//    @SerializedName("emb_codes")
//    @Expose
//    private String embCodes;
//    @SerializedName("image_url")
//    @Expose
//    private String imageUrl;
    @SerializedName("image_small_url")
    @Expose
    private String imageSmallUrl;
    //    @SerializedName("creator")
//    @Expose
//    private String creator;
//    @SerializedName("interface_version_created")
//    @Expose
//    private String interfaceVersionCreated;
//    @SerializedName("traces")
//    @Expose
//    private String traces;
//    @SerializedName("nucleotides_tags")
//    @Expose
//    private List<Object> nucleotidesTags = null;
//    @SerializedName("misc_tags")
//    @Expose
//    private List<String> miscTags = null;
//    @SerializedName("categories_tags")
//    @Expose
//    private List<String> categoriesTags = null;
    @SerializedName("categories_hierarchy")
    @Expose
    private List<String> categoriesHierarchy = null;
    //  @SerializedName("categories_prev_tags")
//    @Expose
//    private List<String> categoriesPrevTags = null;
//    @SerializedName("complete")
//    @Expose
//    private String complete;
//    @SerializedName("pnns_groups_2_tags")
//    @Expose
//    private List<String> pnnsGroups2Tags = null;
    @SerializedName("additives_prev_n")
    @Expose
    private String additivesPrevN;
    //    @SerializedName("sortkey")
//    @Expose
//    private String sortkey;
//    @SerializedName("last_image_t")
//    @Expose
//    private String lastImageT;
//    @SerializedName("allergens_tags")
//    @Expose
//    private List<Object> allergensTags = null;
//    @SerializedName("traces_tags")
//    @Expose
//    private List<String> tracesTags = null;
//    @SerializedName("serving_size")
//    @Expose
//    private String servingSize;
    @SerializedName("image_front_url")
    @Expose
    private String imageFrontUrl;
    //    @SerializedName("ingredients_text_en")
//    @Expose
//    private String ingredientsTextEn;
    @SerializedName("additives_n")
    @Expose
    private String additivesN;
    //    @SerializedName("sources")
//    @Expose
//    private List<Source> sources = null;
    @SerializedName("additives_original_tags")
    @Expose
    private List<String> additivesOriginalTags = null;
    //    @SerializedName("last_editor")
//    @Expose
//    private String lastEditor;
//    @SerializedName("completed_t")
//    @Expose
//    private String completedT;
//    @SerializedName("ingredients_text_debug")
//    @Expose
//    private String ingredientsTextDebug;
//    @SerializedName("countries_tags")
//    @Expose
//    private List<String> countriesTags = null;
    @SerializedName("additives_prev_tags")
    @Expose
    private List<String> additivesPrevTags = null;
    //    @SerializedName("packaging")
//    @Expose
//    private String packaging;
    @SerializedName("additives_tags")
    @Expose
    private List<String> additivesTags = null;
    //    @SerializedName("informers")
//    @Expose
//    private List<String> informers = null;
//    @SerializedName("ingredients_n_tags")
//    @Expose
//    private List<String> ingredientsNTags = null;
//    @SerializedName("purchase_places_debug_tags")
//    @Expose
//    private List<Object> purchasePlacesDebugTags = null;
//    @SerializedName("brands_debug_tags")
//    @Expose
//    private List<Object> brandsDebugTags = null;
//    @SerializedName("last_modified_t")
//    @Expose
//    private String lastModifiedT;
//    @SerializedName("nucleotides_prev_tags")
//    @Expose
//    private List<Object> nucleotidesPrevTags = null;
//    @SerializedName("labels_hierarchy")
//    @Expose
//    private List<String> labelsHierarchy = null;
//    @SerializedName("last_edit_dates_tags")
//    @Expose
//    private List<String> lastEditDatesTags = null;
//    @SerializedName("lang_debug_tags")
//    @Expose
//    private List<Object> langDebugTags = null;
    @SerializedName("ingredients")
    @Expose
    private List<Ingredient> ingredients = null;
    //    @SerializedName("stores_debug_tags")
//    @Expose
//    private List<Object> storesDebugTags = null;
//    @SerializedName("ingredients_that_may_be_from_palm_oil_n")
//    @Expose
//    private String ingredientsThatMayBeFromPalmOilN;
//    @SerializedName("ingredients_text_with_allergens_en")
//    @Expose
//    private String ingredientsTextWithAllergensEn;
//    @SerializedName("nutrition_data_per_debug_tags")
//    @Expose
//    private List<Object> nutritionDataPerDebugTags = null;
    @SerializedName("nutrition_data_per")
    @Expose
    private String nutritionDataPer;
    //    @SerializedName("correctors")
//    @Expose
//    private List<String> correctors = null;
//    @SerializedName("expiration_date")
//    @Expose
//    private String expirationDate;
//    @SerializedName("brands_tags")
//    @Expose
//    private List<String> brandsTags = null;
//    @SerializedName("ingredients_debug")
//    @Expose
//    private List<String> ingredientsDebug = null;
//    @SerializedName("pnns_groups_1_tags")
//    @Expose
//    private List<String> pnnsGroups1Tags = null;
//    @SerializedName("lc")
//    @Expose
//    private String lc;
//    @SerializedName("cities_tags")
//    @Expose
//    private List<Object> citiesTags = null;
//    @SerializedName("labels_debug_tags")
//    @Expose
//    private List<Object> labelsDebugTags = null;
//    @SerializedName("allergens")
//    @Expose
//    private String allergens;
//    @SerializedName("quantity_debug_tags")
//    @Expose
//    private List<Object> quantityDebugTags = null;
//    @SerializedName("image_nutrition_small_url")
//    @Expose
//    private String imageNutritionSmallUrl;
//    @SerializedName("emb_codes_20141016")
//    @Expose
//    private String embCodes20141016;
//    @SerializedName("states")
//    @Expose
//    private String states;
//    @SerializedName("amino_acids_prev_tags")
//    @Expose
//    private List<Object> aminoAcidsPrevTags = null;
//    @SerializedName("nutrition_data_prepared_per_debug_tags")
//    @Expose
//    private List<Object> nutritionDataPreparedPerDebugTags = null;
    @SerializedName("additives_prev")
    @Expose
    private String additivesPrev;
    //    @SerializedName("emb_codes_tags")
//    @Expose
//    private List<Object> embCodesTags = null;
//    @SerializedName("editors")
//    @Expose
//    private List<String> editors = null;
//    @SerializedName("languages_hierarchy")
//    @Expose
//    private List<String> languagesHierarchy = null;
//    @SerializedName("ingredients_tags")
//    @Expose
//    private List<String> ingredientsTags = null;
//    @SerializedName("ingredients_that_may_be_from_palm_oil_tags")
//    @Expose
//    private List<Object> ingredientsThatMayBeFromPalmOilTags = null;
//    @SerializedName("idd")
//    @Expose
//    private String idd;
//    @SerializedName("expiration_date_debug_tags")
//    @Expose
//    private List<Object> expirationDateDebugTags = null;
//    @SerializedName("categories_prev_hierarchy")
//    @Expose
//    private List<String> categoriesPrevHierarchy = null;
//    @SerializedName("pnns_groups_1")
//    @Expose
//    private String pnnsGroups1;
//    @SerializedName("codes_tags")
//    @Expose
//    private List<String> codesTags = null;
    @SerializedName("product_name_en")
    @Expose
    private String productNameEn;
    //    @SerializedName("pnns_groups_2")
//    @Expose
//    private String pnnsGroups2;
//    @SerializedName("packaging_tags")
//    @Expose
//    private List<String> packagingTags = null;
//    @SerializedName("traces_hierarchy")
//    @Expose
//    private List<String> tracesHierarchy = null;
//    @SerializedName("labels_prev_tags")
//    @Expose
//    private List<String> labelsPrevTags = null;
    @SerializedName("product_quantity")
    @Expose
    private String productQuantity;
    //    @SerializedName("editors_tags")
//    @Expose
//    private List<String> editorsTags = null;
    @SerializedName("image_thumb_url")
    @Expose
    private String imageThumbUrl;
    //    @SerializedName("nutrition_data_prepared")
//    @Expose
//    private String nutritionDataPrepared;
//    @SerializedName("labels")
//    @Expose
//    private String labels;
//    @SerializedName("link")
//    @Expose
//    private String link;
//    @SerializedName("last_modified_by")
//    @Expose
//    private String lastModifiedBy;
//    @SerializedName("origins")
//    @Expose
//    private String origins;
//    @SerializedName("checkers")
//    @Expose
//    private List<Object> checkers = null;
//    @SerializedName("purchase_places")
//    @Expose
//    private String purchasePlaces;
//    @SerializedName("image_nutrition_url")
//    @Expose
//    private String imageNutritionUrl;
//    @SerializedName("ingredients_ids_debug")
//    @Expose
//    private List<String> ingredientsIdsDebug = null;
//    @SerializedName("minerals_tags")
//    @Expose
//    private List<Object> mineralsTags = null;
//    @SerializedName("stores_tags")
//    @Expose
//    private List<Object> storesTags = null;
//    @SerializedName("categories_debug_tags")
//    @Expose
//    private List<Object> categoriesDebugTags = null;
    @SerializedName("stores")
    @Expose
    private String stores;
    //    @SerializedName("checkers_tags")
//    @Expose
//    private List<Object> checkersTags = null;
    @SerializedName("categories")
    @Expose
    private String categories;
    //    @SerializedName("vitamins_tags")
//    @Expose
//    private List<Object> vitaminsTags = null;
//    @SerializedName("lang")
//    @Expose
//    private String lang;
//    @SerializedName("vitamins_prev_tags")
//    @Expose
//    private List<Object> vitaminsPrevTags = null;
//    @SerializedName("countries_debug_tags")
//    @Expose
//    private List<Object> countriesDebugTags = null;
    @SerializedName("unknown_ingredients_n")
    @Expose
    private String unknownIngredientsN;
    //    @SerializedName("correctors_tags")
//    @Expose
//    private List<String> correctorsTags = null;
//    @SerializedName("generic_name_en_debug_tags")
//    @Expose
//    private List<Object> genericNameEnDebugTags = null;
//    @SerializedName("ingredients_text_en_debug_tags")
//    @Expose
//    private List<Object> ingredientsTextEnDebugTags = null;
//    @SerializedName("emb_codes_orig")
//    @Expose
//    private String embCodesOrig;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    //    @SerializedName("photographers_tags")
//    @Expose
//    private List<String> photographersTags = null;
    @SerializedName("ingredients_text")
    @Expose
    private String ingredientsText;
    //    @Expose
//    private List<String> statesTags = null;
//    @SerializedName("unknown_nutrients_tags")
//    @Expose
//    private List<Object> unknownNutrientsTags = null;
//    @SerializedName("emb_codes_debug_tags")
//    @Expose
//    private List<Object> embCodesDebugTags = null;
//    @SerializedName("serving_size_debug_tags")
//    @Expose
//    private List<Object> servingSizeDebugTags = null;
//    @SerializedName("rev")
//    @Expose
//    private String rev;
//    @SerializedName("languages")
//    @Expose
//    private Languages languages;
//    @SerializedName("unique_scans_n")
//    @Expose
//    private String uniqueScansN;
//    @SerializedName("update_key")
//    @Expose
//    private String updateKey;
//    @SerializedName("entry_dates_tags")
//    @Expose
//    private List<String> entryDatesTags = null;
//    @SerializedName("quality_tags")
//    @Expose
//    private List<String> qualityTags = null;
//    @SerializedName("generic_name_en")
//    @Expose
//    private String genericNameEn;
//    @SerializedName("image_ingredients_small_url")
//    @Expose
//    private String imageIngredientsSmallUrl;
    @SerializedName("brands")
    @Expose
    private String brands;
    //    @SerializedName("link_debug_tags")
//    @Expose
//    private List<Object> linkDebugTags = null;
    @SerializedName("nutrient_levels_tags")
    @Expose
    private List<String> nutrientLevelsTags = null;
    @SerializedName("ingredients_n")
    @Expose
    private String ingredientsN;
    @SerializedName("nutrition_grades")
    @Expose
    private String nutritionGrades;
    //    @SerializedName("states_hierarchy")
//    @Expose
//    private List<String> statesHierarchy = null;
//    @SerializedName("origins_debug_tags")
//    @Expose
//    private List<Object> originsDebugTags = null;
    @SerializedName("additives")
    @Expose
    private String additives;
    //    @SerializedName("origins_tags")
//    @Expose
//    private List<String> originsTags = null;
//    @SerializedName("nutrition_data_prepared_per")
//    @Expose
//    private String nutritionDataPreparedPer;
    @SerializedName("additives_old_tags")
    @Expose
    private List<String> additivesOldTags = null;
    //    @SerializedName("fruits-vegetables-nuts_100g_estimate")
//    @Expose
//    private String fruitsVegetablesNuts100gEstimate;
//    @SerializedName("manufacturing_places_tags")
//    @Expose
//    private List<Object> manufacturingPlacesTags = null;
    @SerializedName("ingredients_from_palm_oil_n")
    @Expose
    private String ingredientsFromPalmOilN;
    //    @SerializedName("manufacturing_places")
//    @Expose
//    private String manufacturingPlaces;
//    @SerializedName("image_ingredients_thumb_url")
//    @Expose
//    private String imageIngredientsThumbUrl;
//    @SerializedName("ingredients_hierarchy")
//    @Expose
//    private List<String> ingredientsHierarchy = null;
//    @SerializedName("nutrition_grade_fr")
//    @Expose
//    private String nutritionGradeFr;
//    @SerializedName("nutrient_levels")
//    @Expose
//    private NutrientLevels nutrientLevels;
    @SerializedName("product_name")
    @Expose
    private String productName;
//    @SerializedName("labels_prev_hierarchy")
//    @Expose
//    private List<String> labelsPrevHierarchy = null;
//    @SerializedName("last_image_dates_tags")
//    @Expose
//    private List<String> lastImageDatesTags = null;
//    @SerializedName("ingredients_from_palm_oil_tags")
//    @Expose
//    private List<Object> ingredientsFromPalmOilTags = null;
//    @SerializedName("id")
//    @Expose
//    private String id;
//    @SerializedName("debug_param_sorted_langs")
//    @Expose
//    private List<String> debugParamSortedLangs = null;
//    @SerializedName("scans_n")
//    @Expose
//    private String scansN;
//    @SerializedName("manufacturing_places_debug_tags")
//    @Expose
//    private List<Object> manufacturingPlacesDebugTags = null;
//    @SerializedName("packaging_debug_tags")
//    @Expose
//    private List<Object> packagingDebugTags = null;
//

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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
