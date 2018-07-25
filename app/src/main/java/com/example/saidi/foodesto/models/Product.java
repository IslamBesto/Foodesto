
package com.example.saidi.foodesto.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("image_front_thumb_url")
    @Expose
    private String imageFrontThumbUrl;
    @SerializedName("informers_tags")
    @Expose
    private List<String> informersTags = null;
    @SerializedName("countries")
    @Expose
    private String countries;
    @SerializedName("photographers")
    @Expose
    private List<String> photographers = null;
    @SerializedName("languages_tags")
    @Expose
    private List<String> languagesTags = null;
    @SerializedName("countries_hierarchy")
    @Expose
    private List<String> countriesHierarchy = null;
    @SerializedName("nutrition_score_debug")
    @Expose
    private String nutritionScoreDebug;
    @SerializedName("nutrition_grades_tags")
    @Expose
    private List<String> nutritionGradesTags = null;
    @SerializedName("generic_name")
    @Expose
    private String genericName;
    @SerializedName("amino_acids_tags")
    @Expose
    private List<Object> aminoAcidsTags = null;
    @SerializedName("no_nutrition_data")
    @Expose
    private String noNutritionData;
    @SerializedName("created_t")
    @Expose
    private Integer createdT;
    @SerializedName("labels_tags")
    @Expose
    private List<String> labelsTags = null;
    @SerializedName("minerals_prev_tags")
    @Expose
    private List<Object> mineralsPrevTags = null;
    @SerializedName("nutrition_score_warning_no_fruits_vegetables_nuts")
    @Expose
    private Integer nutritionScoreWarningNoFruitsVegetablesNuts;
    @SerializedName("serving_quantity")
    @Expose
    private Integer servingQuantity;
    @SerializedName("interface_version_modified")
    @Expose
    private String interfaceVersionModified;
    @SerializedName("selected_images")
    @Expose
    private SelectedImages selectedImages;
    @SerializedName("additives_debug_tags")
    @Expose
    private List<Object> additivesDebugTags = null;
    @SerializedName("image_front_small_url")
    @Expose
    private String imageFrontSmallUrl;
    @SerializedName("allergens_hierarchy")
    @Expose
    private List<Object> allergensHierarchy = null;
    @SerializedName("new_additives_n")
    @Expose
    private Integer newAdditivesN;
    @SerializedName("ingredients_text_with_allergens")
    @Expose
    private String ingredientsTextWithAllergens;
    @SerializedName("additives_prev_original_tags")
    @Expose
    private List<String> additivesPrevOriginalTags = null;
    @SerializedName("nutriments")
    @Expose
    private Nutriments nutriments;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("image_ingredients_url")
    @Expose
    private String imageIngredientsUrl;
    @SerializedName("additives_tags_n")
    @Expose
    private Object additivesTagsN;
    @SerializedName("additives_old_n")
    @Expose
    private Integer additivesOldN;
    @SerializedName("nutrition_data")
    @Expose
    private String nutritionData;
    @SerializedName("ingredients_from_or_that_may_be_from_palm_oil_n")
    @Expose
    private Integer ingredientsFromOrThatMayBeFromPalmOilN;
    @SerializedName("_keywords")
    @Expose
    private List<String> keywords = null;
    @SerializedName("image_nutrition_thumb_url")
    @Expose
    private String imageNutritionThumbUrl;
    @SerializedName("max_imgid")
    @Expose
    private String maxImgid;
    @SerializedName("traces_debug_tags")
    @Expose
    private List<Object> tracesDebugTags = null;
    @SerializedName("product_name_en_debug_tags")
    @Expose
    private List<Object> productNameEnDebugTags = null;
    @SerializedName("languages_codes")
    @Expose
    private LanguagesCodes languagesCodes;
    @SerializedName("purchase_places_tags")
    @Expose
    private List<Object> purchasePlacesTags = null;
    @SerializedName("emb_codes")
    @Expose
    private String embCodes;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("image_small_url")
    @Expose
    private String imageSmallUrl;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("interface_version_created")
    @Expose
    private String interfaceVersionCreated;
    @SerializedName("traces")
    @Expose
    private String traces;
    @SerializedName("nucleotides_tags")
    @Expose
    private List<Object> nucleotidesTags = null;
    @SerializedName("misc_tags")
    @Expose
    private List<String> miscTags = null;
    @SerializedName("categories_tags")
    @Expose
    private List<String> categoriesTags = null;
    @SerializedName("categories_hierarchy")
    @Expose
    private List<String> categoriesHierarchy = null;
    @SerializedName("categories_prev_tags")
    @Expose
    private List<String> categoriesPrevTags = null;
    @SerializedName("complete")
    @Expose
    private Integer complete;
    @SerializedName("pnns_groups_2_tags")
    @Expose
    private List<String> pnnsGroups2Tags = null;
    @SerializedName("additives_prev_n")
    @Expose
    private Integer additivesPrevN;
    @SerializedName("sortkey")
    @Expose
    private Integer sortkey;
    @SerializedName("last_image_t")
    @Expose
    private Integer lastImageT;
    @SerializedName("allergens_tags")
    @Expose
    private List<Object> allergensTags = null;
    @SerializedName("traces_tags")
    @Expose
    private List<String> tracesTags = null;
    @SerializedName("serving_size")
    @Expose
    private String servingSize;
    @SerializedName("image_front_url")
    @Expose
    private String imageFrontUrl;
    @SerializedName("ingredients_text_en")
    @Expose
    private String ingredientsTextEn;
    @SerializedName("additives_n")
    @Expose
    private Integer additivesN;
    @SerializedName("sources")
    @Expose
    private List<Source> sources = null;
    @SerializedName("additives_original_tags")
    @Expose
    private List<String> additivesOriginalTags = null;
    @SerializedName("last_editor")
    @Expose
    private String lastEditor;
    @SerializedName("completed_t")
    @Expose
    private Integer completedT;
    @SerializedName("ingredients_text_debug")
    @Expose
    private String ingredientsTextDebug;
    @SerializedName("countries_tags")
    @Expose
    private List<String> countriesTags = null;
    @SerializedName("additives_prev_tags")
    @Expose
    private List<String> additivesPrevTags = null;
    @SerializedName("packaging")
    @Expose
    private String packaging;
    @SerializedName("additives_tags")
    @Expose
    private List<String> additivesTags = null;
    @SerializedName("informers")
    @Expose
    private List<String> informers = null;
    @SerializedName("ingredients_n_tags")
    @Expose
    private List<String> ingredientsNTags = null;
    @SerializedName("purchase_places_debug_tags")
    @Expose
    private List<Object> purchasePlacesDebugTags = null;
    @SerializedName("brands_debug_tags")
    @Expose
    private List<Object> brandsDebugTags = null;
    @SerializedName("last_modified_t")
    @Expose
    private Integer lastModifiedT;
    @SerializedName("nucleotides_prev_tags")
    @Expose
    private List<Object> nucleotidesPrevTags = null;
    @SerializedName("labels_hierarchy")
    @Expose
    private List<String> labelsHierarchy = null;
    @SerializedName("last_edit_dates_tags")
    @Expose
    private List<String> lastEditDatesTags = null;
    @SerializedName("lang_debug_tags")
    @Expose
    private List<Object> langDebugTags = null;
    @SerializedName("ingredients")
    @Expose
    private List<Ingredient> ingredients = null;
    @SerializedName("stores_debug_tags")
    @Expose
    private List<Object> storesDebugTags = null;
    @SerializedName("ingredients_that_may_be_from_palm_oil_n")
    @Expose
    private Integer ingredientsThatMayBeFromPalmOilN;
    @SerializedName("ingredients_text_with_allergens_en")
    @Expose
    private String ingredientsTextWithAllergensEn;
    @SerializedName("nutrition_data_per_debug_tags")
    @Expose
    private List<Object> nutritionDataPerDebugTags = null;
    @SerializedName("nutrition_data_per")
    @Expose
    private String nutritionDataPer;
    @SerializedName("correctors")
    @Expose
    private List<String> correctors = null;
    @SerializedName("expiration_date")
    @Expose
    private String expirationDate;
    @SerializedName("brands_tags")
    @Expose
    private List<String> brandsTags = null;
    @SerializedName("ingredients_debug")
    @Expose
    private List<String> ingredientsDebug = null;
    @SerializedName("pnns_groups_1_tags")
    @Expose
    private List<String> pnnsGroups1Tags = null;
    @SerializedName("lc")
    @Expose
    private String lc;
    @SerializedName("cities_tags")
    @Expose
    private List<Object> citiesTags = null;
    @SerializedName("labels_debug_tags")
    @Expose
    private List<Object> labelsDebugTags = null;
    @SerializedName("allergens")
    @Expose
    private String allergens;
    @SerializedName("quantity_debug_tags")
    @Expose
    private List<Object> quantityDebugTags = null;
    @SerializedName("image_nutrition_small_url")
    @Expose
    private String imageNutritionSmallUrl;
    @SerializedName("emb_codes_20141016")
    @Expose
    private String embCodes20141016;
    @SerializedName("states")
    @Expose
    private String states;
    @SerializedName("amino_acids_prev_tags")
    @Expose
    private List<Object> aminoAcidsPrevTags = null;
    @SerializedName("nutrition_data_prepared_per_debug_tags")
    @Expose
    private List<Object> nutritionDataPreparedPerDebugTags = null;
    @SerializedName("additives_prev")
    @Expose
    private String additivesPrev;
    @SerializedName("emb_codes_tags")
    @Expose
    private List<Object> embCodesTags = null;
    @SerializedName("editors")
    @Expose
    private List<String> editors = null;
    @SerializedName("languages_hierarchy")
    @Expose
    private List<String> languagesHierarchy = null;
    @SerializedName("ingredients_tags")
    @Expose
    private List<String> ingredientsTags = null;
    @SerializedName("ingredients_that_may_be_from_palm_oil_tags")
    @Expose
    private List<Object> ingredientsThatMayBeFromPalmOilTags = null;
    @SerializedName("idd")
    @Expose
    private String idd;
    @SerializedName("expiration_date_debug_tags")
    @Expose
    private List<Object> expirationDateDebugTags = null;
    @SerializedName("categories_prev_hierarchy")
    @Expose
    private List<String> categoriesPrevHierarchy = null;
    @SerializedName("pnns_groups_1")
    @Expose
    private String pnnsGroups1;
    @SerializedName("codes_tags")
    @Expose
    private List<String> codesTags = null;
    @SerializedName("product_name_en")
    @Expose
    private String productNameEn;
    @SerializedName("pnns_groups_2")
    @Expose
    private String pnnsGroups2;
    @SerializedName("packaging_tags")
    @Expose
    private List<String> packagingTags = null;
    @SerializedName("traces_hierarchy")
    @Expose
    private List<String> tracesHierarchy = null;
    @SerializedName("labels_prev_tags")
    @Expose
    private List<String> labelsPrevTags = null;
    @SerializedName("product_quantity")
    @Expose
    private Integer productQuantity;
    @SerializedName("editors_tags")
    @Expose
    private List<String> editorsTags = null;
    @SerializedName("image_thumb_url")
    @Expose
    private String imageThumbUrl;
    @SerializedName("nutrition_data_prepared")
    @Expose
    private String nutritionDataPrepared;
    @SerializedName("labels")
    @Expose
    private String labels;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("last_modified_by")
    @Expose
    private String lastModifiedBy;
    @SerializedName("origins")
    @Expose
    private String origins;
    @SerializedName("checkers")
    @Expose
    private List<Object> checkers = null;
    @SerializedName("purchase_places")
    @Expose
    private String purchasePlaces;
    @SerializedName("image_nutrition_url")
    @Expose
    private String imageNutritionUrl;
    @SerializedName("ingredients_ids_debug")
    @Expose
    private List<String> ingredientsIdsDebug = null;
    @SerializedName("minerals_tags")
    @Expose
    private List<Object> mineralsTags = null;
    @SerializedName("stores_tags")
    @Expose
    private List<Object> storesTags = null;
    @SerializedName("categories_debug_tags")
    @Expose
    private List<Object> categoriesDebugTags = null;
    @SerializedName("stores")
    @Expose
    private String stores;
    @SerializedName("checkers_tags")
    @Expose
    private List<Object> checkersTags = null;
    @SerializedName("categories")
    @Expose
    private String categories;
    @SerializedName("vitamins_tags")
    @Expose
    private List<Object> vitaminsTags = null;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("vitamins_prev_tags")
    @Expose
    private List<Object> vitaminsPrevTags = null;
    @SerializedName("countries_debug_tags")
    @Expose
    private List<Object> countriesDebugTags = null;
    @SerializedName("unknown_ingredients_n")
    @Expose
    private Integer unknownIngredientsN;
    @SerializedName("correctors_tags")
    @Expose
    private List<String> correctorsTags = null;
    @SerializedName("generic_name_en_debug_tags")
    @Expose
    private List<Object> genericNameEnDebugTags = null;
    @SerializedName("ingredients_text_en_debug_tags")
    @Expose
    private List<Object> ingredientsTextEnDebugTags = null;
    @SerializedName("emb_codes_orig")
    @Expose
    private String embCodesOrig;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("photographers_tags")
    @Expose
    private List<String> photographersTags = null;
    @SerializedName("ingredients_text")
    @Expose
    private String ingredientsText;
    @Expose
    private List<String> statesTags = null;
    @SerializedName("unknown_nutrients_tags")
    @Expose
    private List<Object> unknownNutrientsTags = null;
    @SerializedName("emb_codes_debug_tags")
    @Expose
    private List<Object> embCodesDebugTags = null;
    @SerializedName("serving_size_debug_tags")
    @Expose
    private List<Object> servingSizeDebugTags = null;
    @SerializedName("rev")
    @Expose
    private Integer rev;
    @SerializedName("languages")
    @Expose
    private Languages languages;
    @SerializedName("unique_scans_n")
    @Expose
    private Integer uniqueScansN;
    @SerializedName("update_key")
    @Expose
    private String updateKey;
    @SerializedName("entry_dates_tags")
    @Expose
    private List<String> entryDatesTags = null;
    @SerializedName("quality_tags")
    @Expose
    private List<String> qualityTags = null;
    @SerializedName("generic_name_en")
    @Expose
    private String genericNameEn;
    @SerializedName("image_ingredients_small_url")
    @Expose
    private String imageIngredientsSmallUrl;
    @SerializedName("brands")
    @Expose
    private String brands;
    @SerializedName("link_debug_tags")
    @Expose
    private List<Object> linkDebugTags = null;
    @SerializedName("nutrient_levels_tags")
    @Expose
    private List<String> nutrientLevelsTags = null;
    @SerializedName("ingredients_n")
    @Expose
    private String ingredientsN;
    @SerializedName("nutrition_grades")
    @Expose
    private String nutritionGrades;
    @SerializedName("states_hierarchy")
    @Expose
    private List<String> statesHierarchy = null;
    @SerializedName("origins_debug_tags")
    @Expose
    private List<Object> originsDebugTags = null;
    @SerializedName("additives")
    @Expose
    private String additives;
    @SerializedName("origins_tags")
    @Expose
    private List<String> originsTags = null;
    @SerializedName("nutrition_data_prepared_per")
    @Expose
    private String nutritionDataPreparedPer;
    @SerializedName("additives_old_tags")
    @Expose
    private List<String> additivesOldTags = null;
    @SerializedName("fruits-vegetables-nuts_100g_estimate")
    @Expose
    private Integer fruitsVegetablesNuts100gEstimate;
    @SerializedName("manufacturing_places_tags")
    @Expose
    private List<Object> manufacturingPlacesTags = null;
    @SerializedName("ingredients_from_palm_oil_n")
    @Expose
    private Integer ingredientsFromPalmOilN;
    @SerializedName("manufacturing_places")
    @Expose
    private String manufacturingPlaces;
    @SerializedName("image_ingredients_thumb_url")
    @Expose
    private String imageIngredientsThumbUrl;
    @SerializedName("ingredients_hierarchy")
    @Expose
    private List<String> ingredientsHierarchy = null;
    @SerializedName("nutrition_grade_fr")
    @Expose
    private String nutritionGradeFr;
    @SerializedName("nutrient_levels")
    @Expose
    private NutrientLevels nutrientLevels;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("labels_prev_hierarchy")
    @Expose
    private List<String> labelsPrevHierarchy = null;
    @SerializedName("last_image_dates_tags")
    @Expose
    private List<String> lastImageDatesTags = null;
    @SerializedName("ingredients_from_palm_oil_tags")
    @Expose
    private List<Object> ingredientsFromPalmOilTags = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("debug_param_sorted_langs")
    @Expose
    private List<String> debugParamSortedLangs = null;
    @SerializedName("scans_n")
    @Expose
    private Integer scansN;
    @SerializedName("manufacturing_places_debug_tags")
    @Expose
    private List<Object> manufacturingPlacesDebugTags = null;
    @SerializedName("packaging_debug_tags")
    @Expose
    private List<Object> packagingDebugTags = null;

    public String getImageFrontThumbUrl() {
        return imageFrontThumbUrl;
    }

    public void setImageFrontThumbUrl(String imageFrontThumbUrl) {
        this.imageFrontThumbUrl = imageFrontThumbUrl;
    }

    public List<String> getInformersTags() {
        return informersTags;
    }

    public void setInformersTags(List<String> informersTags) {
        this.informersTags = informersTags;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public List<String> getPhotographers() {
        return photographers;
    }

    public void setPhotographers(List<String> photographers) {
        this.photographers = photographers;
    }

    public List<String> getLanguagesTags() {
        return languagesTags;
    }

    public void setLanguagesTags(List<String> languagesTags) {
        this.languagesTags = languagesTags;
    }

    public List<String> getCountriesHierarchy() {
        return countriesHierarchy;
    }

    public void setCountriesHierarchy(List<String> countriesHierarchy) {
        this.countriesHierarchy = countriesHierarchy;
    }

    public String getNutritionScoreDebug() {
        return nutritionScoreDebug;
    }

    public void setNutritionScoreDebug(String nutritionScoreDebug) {
        this.nutritionScoreDebug = nutritionScoreDebug;
    }

    public List<String> getNutritionGradesTags() {
        return nutritionGradesTags;
    }

    public void setNutritionGradesTags(List<String> nutritionGradesTags) {
        this.nutritionGradesTags = nutritionGradesTags;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public List<Object> getAminoAcidsTags() {
        return aminoAcidsTags;
    }

    public void setAminoAcidsTags(List<Object> aminoAcidsTags) {
        this.aminoAcidsTags = aminoAcidsTags;
    }

    public String getNoNutritionData() {
        return noNutritionData;
    }

    public void setNoNutritionData(String noNutritionData) {
        this.noNutritionData = noNutritionData;
    }

    public Integer getCreatedT() {
        return createdT;
    }

    public void setCreatedT(Integer createdT) {
        this.createdT = createdT;
    }

    public List<String> getLabelsTags() {
        return labelsTags;
    }

    public void setLabelsTags(List<String> labelsTags) {
        this.labelsTags = labelsTags;
    }

    public List<Object> getMineralsPrevTags() {
        return mineralsPrevTags;
    }

    public void setMineralsPrevTags(List<Object> mineralsPrevTags) {
        this.mineralsPrevTags = mineralsPrevTags;
    }

    public Integer getNutritionScoreWarningNoFruitsVegetablesNuts() {
        return nutritionScoreWarningNoFruitsVegetablesNuts;
    }

    public void setNutritionScoreWarningNoFruitsVegetablesNuts(Integer nutritionScoreWarningNoFruitsVegetablesNuts) {
        this.nutritionScoreWarningNoFruitsVegetablesNuts = nutritionScoreWarningNoFruitsVegetablesNuts;
    }

    public Integer getServingQuantity() {
        return servingQuantity;
    }

    public void setServingQuantity(Integer servingQuantity) {
        this.servingQuantity = servingQuantity;
    }

    public String getInterfaceVersionModified() {
        return interfaceVersionModified;
    }

    public void setInterfaceVersionModified(String interfaceVersionModified) {
        this.interfaceVersionModified = interfaceVersionModified;
    }

    public SelectedImages getSelectedImages() {
        return selectedImages;
    }

    public void setSelectedImages(SelectedImages selectedImages) {
        this.selectedImages = selectedImages;
    }

    public List<Object> getAdditivesDebugTags() {
        return additivesDebugTags;
    }

    public void setAdditivesDebugTags(List<Object> additivesDebugTags) {
        this.additivesDebugTags = additivesDebugTags;
    }

    public String getImageFrontSmallUrl() {
        return imageFrontSmallUrl;
    }

    public void setImageFrontSmallUrl(String imageFrontSmallUrl) {
        this.imageFrontSmallUrl = imageFrontSmallUrl;
    }

    public List<Object> getAllergensHierarchy() {
        return allergensHierarchy;
    }

    public void setAllergensHierarchy(List<Object> allergensHierarchy) {
        this.allergensHierarchy = allergensHierarchy;
    }

    public Integer getNewAdditivesN() {
        return newAdditivesN;
    }

    public void setNewAdditivesN(Integer newAdditivesN) {
        this.newAdditivesN = newAdditivesN;
    }

    public String getIngredientsTextWithAllergens() {
        return ingredientsTextWithAllergens;
    }

    public void setIngredientsTextWithAllergens(String ingredientsTextWithAllergens) {
        this.ingredientsTextWithAllergens = ingredientsTextWithAllergens;
    }

    public List<String> getAdditivesPrevOriginalTags() {
        return additivesPrevOriginalTags;
    }

    public void setAdditivesPrevOriginalTags(List<String> additivesPrevOriginalTags) {
        this.additivesPrevOriginalTags = additivesPrevOriginalTags;
    }

    public Nutriments getNutriments() {
        return nutriments;
    }

    public void setNutriments(Nutriments nutriments) {
        this.nutriments = nutriments;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImageIngredientsUrl() {
        return imageIngredientsUrl;
    }

    public void setImageIngredientsUrl(String imageIngredientsUrl) {
        this.imageIngredientsUrl = imageIngredientsUrl;
    }

    public Object getAdditivesTagsN() {
        return additivesTagsN;
    }

    public void setAdditivesTagsN(Object additivesTagsN) {
        this.additivesTagsN = additivesTagsN;
    }

    public Integer getAdditivesOldN() {
        return additivesOldN;
    }

    public void setAdditivesOldN(Integer additivesOldN) {
        this.additivesOldN = additivesOldN;
    }

    public String getNutritionData() {
        return nutritionData;
    }

    public void setNutritionData(String nutritionData) {
        this.nutritionData = nutritionData;
    }

    public Integer getIngredientsFromOrThatMayBeFromPalmOilN() {
        return ingredientsFromOrThatMayBeFromPalmOilN;
    }

    public void setIngredientsFromOrThatMayBeFromPalmOilN(Integer ingredientsFromOrThatMayBeFromPalmOilN) {
        this.ingredientsFromOrThatMayBeFromPalmOilN = ingredientsFromOrThatMayBeFromPalmOilN;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getImageNutritionThumbUrl() {
        return imageNutritionThumbUrl;
    }

    public void setImageNutritionThumbUrl(String imageNutritionThumbUrl) {
        this.imageNutritionThumbUrl = imageNutritionThumbUrl;
    }

    public String getMaxImgid() {
        return maxImgid;
    }

    public void setMaxImgid(String maxImgid) {
        this.maxImgid = maxImgid;
    }

    public List<Object> getTracesDebugTags() {
        return tracesDebugTags;
    }

    public void setTracesDebugTags(List<Object> tracesDebugTags) {
        this.tracesDebugTags = tracesDebugTags;
    }

    public List<Object> getProductNameEnDebugTags() {
        return productNameEnDebugTags;
    }

    public void setProductNameEnDebugTags(List<Object> productNameEnDebugTags) {
        this.productNameEnDebugTags = productNameEnDebugTags;
    }

    public LanguagesCodes getLanguagesCodes() {
        return languagesCodes;
    }

    public void setLanguagesCodes(LanguagesCodes languagesCodes) {
        this.languagesCodes = languagesCodes;
    }

    public List<Object> getPurchasePlacesTags() {
        return purchasePlacesTags;
    }

    public void setPurchasePlacesTags(List<Object> purchasePlacesTags) {
        this.purchasePlacesTags = purchasePlacesTags;
    }

    public String getEmbCodes() {
        return embCodes;
    }

    public void setEmbCodes(String embCodes) {
        this.embCodes = embCodes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getInterfaceVersionCreated() {
        return interfaceVersionCreated;
    }

    public void setInterfaceVersionCreated(String interfaceVersionCreated) {
        this.interfaceVersionCreated = interfaceVersionCreated;
    }

    public String getTraces() {
        return traces;
    }

    public void setTraces(String traces) {
        this.traces = traces;
    }

    public List<Object> getNucleotidesTags() {
        return nucleotidesTags;
    }

    public void setNucleotidesTags(List<Object> nucleotidesTags) {
        this.nucleotidesTags = nucleotidesTags;
    }

    public List<String> getMiscTags() {
        return miscTags;
    }

    public void setMiscTags(List<String> miscTags) {
        this.miscTags = miscTags;
    }

    public List<String> getCategoriesTags() {
        return categoriesTags;
    }

    public void setCategoriesTags(List<String> categoriesTags) {
        this.categoriesTags = categoriesTags;
    }

    public List<String> getCategoriesHierarchy() {
        return categoriesHierarchy;
    }

    public void setCategoriesHierarchy(List<String> categoriesHierarchy) {
        this.categoriesHierarchy = categoriesHierarchy;
    }

    public List<String> getCategoriesPrevTags() {
        return categoriesPrevTags;
    }

    public void setCategoriesPrevTags(List<String> categoriesPrevTags) {
        this.categoriesPrevTags = categoriesPrevTags;
    }

    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public List<String> getPnnsGroups2Tags() {
        return pnnsGroups2Tags;
    }

    public void setPnnsGroups2Tags(List<String> pnnsGroups2Tags) {
        this.pnnsGroups2Tags = pnnsGroups2Tags;
    }

    public Integer getAdditivesPrevN() {
        return additivesPrevN;
    }

    public void setAdditivesPrevN(Integer additivesPrevN) {
        this.additivesPrevN = additivesPrevN;
    }

    public Integer getSortkey() {
        return sortkey;
    }

    public void setSortkey(Integer sortkey) {
        this.sortkey = sortkey;
    }

    public Integer getLastImageT() {
        return lastImageT;
    }

    public void setLastImageT(Integer lastImageT) {
        this.lastImageT = lastImageT;
    }

    public List<Object> getAllergensTags() {
        return allergensTags;
    }

    public void setAllergensTags(List<Object> allergensTags) {
        this.allergensTags = allergensTags;
    }

    public List<String> getTracesTags() {
        return tracesTags;
    }

    public void setTracesTags(List<String> tracesTags) {
        this.tracesTags = tracesTags;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public String getImageFrontUrl() {
        return imageFrontUrl;
    }

    public void setImageFrontUrl(String imageFrontUrl) {
        this.imageFrontUrl = imageFrontUrl;
    }

    public String getIngredientsTextEn() {
        return ingredientsTextEn;
    }

    public void setIngredientsTextEn(String ingredientsTextEn) {
        this.ingredientsTextEn = ingredientsTextEn;
    }

    public Integer getAdditivesN() {
        return additivesN;
    }

    public void setAdditivesN(Integer additivesN) {
        this.additivesN = additivesN;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<String> getAdditivesOriginalTags() {
        return additivesOriginalTags;
    }

    public void setAdditivesOriginalTags(List<String> additivesOriginalTags) {
        this.additivesOriginalTags = additivesOriginalTags;
    }

    public String getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor;
    }

    public Integer getCompletedT() {
        return completedT;
    }

    public void setCompletedT(Integer completedT) {
        this.completedT = completedT;
    }

    public String getIngredientsTextDebug() {
        return ingredientsTextDebug;
    }

    public void setIngredientsTextDebug(String ingredientsTextDebug) {
        this.ingredientsTextDebug = ingredientsTextDebug;
    }

    public List<String> getCountriesTags() {
        return countriesTags;
    }

    public void setCountriesTags(List<String> countriesTags) {
        this.countriesTags = countriesTags;
    }

    public List<String> getAdditivesPrevTags() {
        return additivesPrevTags;
    }

    public void setAdditivesPrevTags(List<String> additivesPrevTags) {
        this.additivesPrevTags = additivesPrevTags;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public List<String> getAdditivesTags() {
        return additivesTags;
    }

    public void setAdditivesTags(List<String> additivesTags) {
        this.additivesTags = additivesTags;
    }

    public List<String> getInformers() {
        return informers;
    }

    public void setInformers(List<String> informers) {
        this.informers = informers;
    }

    public List<String> getIngredientsNTags() {
        return ingredientsNTags;
    }

    public void setIngredientsNTags(List<String> ingredientsNTags) {
        this.ingredientsNTags = ingredientsNTags;
    }

    public List<Object> getPurchasePlacesDebugTags() {
        return purchasePlacesDebugTags;
    }

    public void setPurchasePlacesDebugTags(List<Object> purchasePlacesDebugTags) {
        this.purchasePlacesDebugTags = purchasePlacesDebugTags;
    }

    public List<Object> getBrandsDebugTags() {
        return brandsDebugTags;
    }

    public void setBrandsDebugTags(List<Object> brandsDebugTags) {
        this.brandsDebugTags = brandsDebugTags;
    }

    public Integer getLastModifiedT() {
        return lastModifiedT;
    }

    public void setLastModifiedT(Integer lastModifiedT) {
        this.lastModifiedT = lastModifiedT;
    }

    public List<Object> getNucleotidesPrevTags() {
        return nucleotidesPrevTags;
    }

    public void setNucleotidesPrevTags(List<Object> nucleotidesPrevTags) {
        this.nucleotidesPrevTags = nucleotidesPrevTags;
    }

    public List<String> getLabelsHierarchy() {
        return labelsHierarchy;
    }

    public void setLabelsHierarchy(List<String> labelsHierarchy) {
        this.labelsHierarchy = labelsHierarchy;
    }

    public List<String> getLastEditDatesTags() {
        return lastEditDatesTags;
    }

    public void setLastEditDatesTags(List<String> lastEditDatesTags) {
        this.lastEditDatesTags = lastEditDatesTags;
    }

    public List<Object> getLangDebugTags() {
        return langDebugTags;
    }

    public void setLangDebugTags(List<Object> langDebugTags) {
        this.langDebugTags = langDebugTags;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Object> getStoresDebugTags() {
        return storesDebugTags;
    }

    public void setStoresDebugTags(List<Object> storesDebugTags) {
        this.storesDebugTags = storesDebugTags;
    }

    public Integer getIngredientsThatMayBeFromPalmOilN() {
        return ingredientsThatMayBeFromPalmOilN;
    }

    public void setIngredientsThatMayBeFromPalmOilN(Integer ingredientsThatMayBeFromPalmOilN) {
        this.ingredientsThatMayBeFromPalmOilN = ingredientsThatMayBeFromPalmOilN;
    }

    public String getIngredientsTextWithAllergensEn() {
        return ingredientsTextWithAllergensEn;
    }

    public void setIngredientsTextWithAllergensEn(String ingredientsTextWithAllergensEn) {
        this.ingredientsTextWithAllergensEn = ingredientsTextWithAllergensEn;
    }

    public List<Object> getNutritionDataPerDebugTags() {
        return nutritionDataPerDebugTags;
    }

    public void setNutritionDataPerDebugTags(List<Object> nutritionDataPerDebugTags) {
        this.nutritionDataPerDebugTags = nutritionDataPerDebugTags;
    }

    public String getNutritionDataPer() {
        return nutritionDataPer;
    }

    public void setNutritionDataPer(String nutritionDataPer) {
        this.nutritionDataPer = nutritionDataPer;
    }

    public List<String> getCorrectors() {
        return correctors;
    }

    public void setCorrectors(List<String> correctors) {
        this.correctors = correctors;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<String> getBrandsTags() {
        return brandsTags;
    }

    public void setBrandsTags(List<String> brandsTags) {
        this.brandsTags = brandsTags;
    }

    public List<String> getIngredientsDebug() {
        return ingredientsDebug;
    }

    public void setIngredientsDebug(List<String> ingredientsDebug) {
        this.ingredientsDebug = ingredientsDebug;
    }

    public List<String> getPnnsGroups1Tags() {
        return pnnsGroups1Tags;
    }

    public void setPnnsGroups1Tags(List<String> pnnsGroups1Tags) {
        this.pnnsGroups1Tags = pnnsGroups1Tags;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public List<Object> getCitiesTags() {
        return citiesTags;
    }

    public void setCitiesTags(List<Object> citiesTags) {
        this.citiesTags = citiesTags;
    }

    public List<Object> getLabelsDebugTags() {
        return labelsDebugTags;
    }

    public void setLabelsDebugTags(List<Object> labelsDebugTags) {
        this.labelsDebugTags = labelsDebugTags;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public List<Object> getQuantityDebugTags() {
        return quantityDebugTags;
    }

    public void setQuantityDebugTags(List<Object> quantityDebugTags) {
        this.quantityDebugTags = quantityDebugTags;
    }

    public String getImageNutritionSmallUrl() {
        return imageNutritionSmallUrl;
    }

    public void setImageNutritionSmallUrl(String imageNutritionSmallUrl) {
        this.imageNutritionSmallUrl = imageNutritionSmallUrl;
    }

    public String getEmbCodes20141016() {
        return embCodes20141016;
    }

    public void setEmbCodes20141016(String embCodes20141016) {
        this.embCodes20141016 = embCodes20141016;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public List<Object> getAminoAcidsPrevTags() {
        return aminoAcidsPrevTags;
    }

    public void setAminoAcidsPrevTags(List<Object> aminoAcidsPrevTags) {
        this.aminoAcidsPrevTags = aminoAcidsPrevTags;
    }

    public List<Object> getNutritionDataPreparedPerDebugTags() {
        return nutritionDataPreparedPerDebugTags;
    }

    public void setNutritionDataPreparedPerDebugTags(List<Object> nutritionDataPreparedPerDebugTags) {
        this.nutritionDataPreparedPerDebugTags = nutritionDataPreparedPerDebugTags;
    }

    public String getAdditivesPrev() {
        return additivesPrev;
    }

    public void setAdditivesPrev(String additivesPrev) {
        this.additivesPrev = additivesPrev;
    }

    public List<Object> getEmbCodesTags() {
        return embCodesTags;
    }

    public void setEmbCodesTags(List<Object> embCodesTags) {
        this.embCodesTags = embCodesTags;
    }

    public List<String> getEditors() {
        return editors;
    }

    public void setEditors(List<String> editors) {
        this.editors = editors;
    }

    public List<String> getLanguagesHierarchy() {
        return languagesHierarchy;
    }

    public void setLanguagesHierarchy(List<String> languagesHierarchy) {
        this.languagesHierarchy = languagesHierarchy;
    }

    public List<String> getIngredientsTags() {
        return ingredientsTags;
    }

    public void setIngredientsTags(List<String> ingredientsTags) {
        this.ingredientsTags = ingredientsTags;
    }

    public List<Object> getIngredientsThatMayBeFromPalmOilTags() {
        return ingredientsThatMayBeFromPalmOilTags;
    }

    public void setIngredientsThatMayBeFromPalmOilTags(List<Object> ingredientsThatMayBeFromPalmOilTags) {
        this.ingredientsThatMayBeFromPalmOilTags = ingredientsThatMayBeFromPalmOilTags;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public List<Object> getExpirationDateDebugTags() {
        return expirationDateDebugTags;
    }

    public void setExpirationDateDebugTags(List<Object> expirationDateDebugTags) {
        this.expirationDateDebugTags = expirationDateDebugTags;
    }

    public List<String> getCategoriesPrevHierarchy() {
        return categoriesPrevHierarchy;
    }

    public void setCategoriesPrevHierarchy(List<String> categoriesPrevHierarchy) {
        this.categoriesPrevHierarchy = categoriesPrevHierarchy;
    }

    public String getPnnsGroups1() {
        return pnnsGroups1;
    }

    public void setPnnsGroups1(String pnnsGroups1) {
        this.pnnsGroups1 = pnnsGroups1;
    }

    public List<String> getCodesTags() {
        return codesTags;
    }

    public void setCodesTags(List<String> codesTags) {
        this.codesTags = codesTags;
    }

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
    }

    public String getPnnsGroups2() {
        return pnnsGroups2;
    }

    public void setPnnsGroups2(String pnnsGroups2) {
        this.pnnsGroups2 = pnnsGroups2;
    }

    public List<String> getPackagingTags() {
        return packagingTags;
    }

    public void setPackagingTags(List<String> packagingTags) {
        this.packagingTags = packagingTags;
    }

    public List<String> getTracesHierarchy() {
        return tracesHierarchy;
    }

    public void setTracesHierarchy(List<String> tracesHierarchy) {
        this.tracesHierarchy = tracesHierarchy;
    }

    public List<String> getLabelsPrevTags() {
        return labelsPrevTags;
    }

    public void setLabelsPrevTags(List<String> labelsPrevTags) {
        this.labelsPrevTags = labelsPrevTags;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public List<String> getEditorsTags() {
        return editorsTags;
    }

    public void setEditorsTags(List<String> editorsTags) {
        this.editorsTags = editorsTags;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public void setImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    public String getNutritionDataPrepared() {
        return nutritionDataPrepared;
    }

    public void setNutritionDataPrepared(String nutritionDataPrepared) {
        this.nutritionDataPrepared = nutritionDataPrepared;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getOrigins() {
        return origins;
    }

    public void setOrigins(String origins) {
        this.origins = origins;
    }

    public List<Object> getCheckers() {
        return checkers;
    }

    public void setCheckers(List<Object> checkers) {
        this.checkers = checkers;
    }

    public String getPurchasePlaces() {
        return purchasePlaces;
    }

    public void setPurchasePlaces(String purchasePlaces) {
        this.purchasePlaces = purchasePlaces;
    }

    public String getImageNutritionUrl() {
        return imageNutritionUrl;
    }

    public void setImageNutritionUrl(String imageNutritionUrl) {
        this.imageNutritionUrl = imageNutritionUrl;
    }

    public List<String> getIngredientsIdsDebug() {
        return ingredientsIdsDebug;
    }

    public void setIngredientsIdsDebug(List<String> ingredientsIdsDebug) {
        this.ingredientsIdsDebug = ingredientsIdsDebug;
    }

    public List<Object> getMineralsTags() {
        return mineralsTags;
    }

    public void setMineralsTags(List<Object> mineralsTags) {
        this.mineralsTags = mineralsTags;
    }

    public List<Object> getStoresTags() {
        return storesTags;
    }

    public void setStoresTags(List<Object> storesTags) {
        this.storesTags = storesTags;
    }

    public List<Object> getCategoriesDebugTags() {
        return categoriesDebugTags;
    }

    public void setCategoriesDebugTags(List<Object> categoriesDebugTags) {
        this.categoriesDebugTags = categoriesDebugTags;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public List<Object> getCheckersTags() {
        return checkersTags;
    }

    public void setCheckersTags(List<Object> checkersTags) {
        this.checkersTags = checkersTags;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public List<Object> getVitaminsTags() {
        return vitaminsTags;
    }

    public void setVitaminsTags(List<Object> vitaminsTags) {
        this.vitaminsTags = vitaminsTags;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<Object> getVitaminsPrevTags() {
        return vitaminsPrevTags;
    }

    public void setVitaminsPrevTags(List<Object> vitaminsPrevTags) {
        this.vitaminsPrevTags = vitaminsPrevTags;
    }

    public List<Object> getCountriesDebugTags() {
        return countriesDebugTags;
    }

    public void setCountriesDebugTags(List<Object> countriesDebugTags) {
        this.countriesDebugTags = countriesDebugTags;
    }

    public Integer getUnknownIngredientsN() {
        return unknownIngredientsN;
    }

    public void setUnknownIngredientsN(Integer unknownIngredientsN) {
        this.unknownIngredientsN = unknownIngredientsN;
    }

    public List<String> getCorrectorsTags() {
        return correctorsTags;
    }

    public void setCorrectorsTags(List<String> correctorsTags) {
        this.correctorsTags = correctorsTags;
    }

    public List<Object> getGenericNameEnDebugTags() {
        return genericNameEnDebugTags;
    }

    public void setGenericNameEnDebugTags(List<Object> genericNameEnDebugTags) {
        this.genericNameEnDebugTags = genericNameEnDebugTags;
    }

    public List<Object> getIngredientsTextEnDebugTags() {
        return ingredientsTextEnDebugTags;
    }

    public void setIngredientsTextEnDebugTags(List<Object> ingredientsTextEnDebugTags) {
        this.ingredientsTextEnDebugTags = ingredientsTextEnDebugTags;
    }

    public String getEmbCodesOrig() {
        return embCodesOrig;
    }

    public void setEmbCodesOrig(String embCodesOrig) {
        this.embCodesOrig = embCodesOrig;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<String> getPhotographersTags() {
        return photographersTags;
    }

    public void setPhotographersTags(List<String> photographersTags) {
        this.photographersTags = photographersTags;
    }

    public String getIngredientsText() {
        return ingredientsText;
    }

    public void setIngredientsText(String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    public List<String> getStatesTags() {
        return statesTags;
    }

    public void setStatesTags(List<String> statesTags) {
        this.statesTags = statesTags;
    }

    public List<Object> getUnknownNutrientsTags() {
        return unknownNutrientsTags;
    }

    public void setUnknownNutrientsTags(List<Object> unknownNutrientsTags) {
        this.unknownNutrientsTags = unknownNutrientsTags;
    }

    public List<Object> getEmbCodesDebugTags() {
        return embCodesDebugTags;
    }

    public void setEmbCodesDebugTags(List<Object> embCodesDebugTags) {
        this.embCodesDebugTags = embCodesDebugTags;
    }

    public List<Object> getServingSizeDebugTags() {
        return servingSizeDebugTags;
    }

    public void setServingSizeDebugTags(List<Object> servingSizeDebugTags) {
        this.servingSizeDebugTags = servingSizeDebugTags;
    }

    public Integer getRev() {
        return rev;
    }

    public void setRev(Integer rev) {
        this.rev = rev;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Integer getUniqueScansN() {
        return uniqueScansN;
    }

    public void setUniqueScansN(Integer uniqueScansN) {
        this.uniqueScansN = uniqueScansN;
    }

    public String getUpdateKey() {
        return updateKey;
    }

    public void setUpdateKey(String updateKey) {
        this.updateKey = updateKey;
    }

    public List<String> getEntryDatesTags() {
        return entryDatesTags;
    }

    public void setEntryDatesTags(List<String> entryDatesTags) {
        this.entryDatesTags = entryDatesTags;
    }

    public List<String> getQualityTags() {
        return qualityTags;
    }

    public void setQualityTags(List<String> qualityTags) {
        this.qualityTags = qualityTags;
    }

    public String getGenericNameEn() {
        return genericNameEn;
    }

    public void setGenericNameEn(String genericNameEn) {
        this.genericNameEn = genericNameEn;
    }

    public String getImageIngredientsSmallUrl() {
        return imageIngredientsSmallUrl;
    }

    public void setImageIngredientsSmallUrl(String imageIngredientsSmallUrl) {
        this.imageIngredientsSmallUrl = imageIngredientsSmallUrl;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public List<Object> getLinkDebugTags() {
        return linkDebugTags;
    }

    public void setLinkDebugTags(List<Object> linkDebugTags) {
        this.linkDebugTags = linkDebugTags;
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

    public List<String> getStatesHierarchy() {
        return statesHierarchy;
    }

    public void setStatesHierarchy(List<String> statesHierarchy) {
        this.statesHierarchy = statesHierarchy;
    }

    public List<Object> getOriginsDebugTags() {
        return originsDebugTags;
    }

    public void setOriginsDebugTags(List<Object> originsDebugTags) {
        this.originsDebugTags = originsDebugTags;
    }

    public String getAdditives() {
        return additives;
    }

    public void setAdditives(String additives) {
        this.additives = additives;
    }

    public List<String> getOriginsTags() {
        return originsTags;
    }

    public void setOriginsTags(List<String> originsTags) {
        this.originsTags = originsTags;
    }

    public String getNutritionDataPreparedPer() {
        return nutritionDataPreparedPer;
    }

    public void setNutritionDataPreparedPer(String nutritionDataPreparedPer) {
        this.nutritionDataPreparedPer = nutritionDataPreparedPer;
    }

    public List<String> getAdditivesOldTags() {
        return additivesOldTags;
    }

    public void setAdditivesOldTags(List<String> additivesOldTags) {
        this.additivesOldTags = additivesOldTags;
    }

    public Integer getFruitsVegetablesNuts100gEstimate() {
        return fruitsVegetablesNuts100gEstimate;
    }

    public void setFruitsVegetablesNuts100gEstimate(Integer fruitsVegetablesNuts100gEstimate) {
        this.fruitsVegetablesNuts100gEstimate = fruitsVegetablesNuts100gEstimate;
    }

    public List<Object> getManufacturingPlacesTags() {
        return manufacturingPlacesTags;
    }

    public void setManufacturingPlacesTags(List<Object> manufacturingPlacesTags) {
        this.manufacturingPlacesTags = manufacturingPlacesTags;
    }

    public Integer getIngredientsFromPalmOilN() {
        return ingredientsFromPalmOilN;
    }

    public void setIngredientsFromPalmOilN(Integer ingredientsFromPalmOilN) {
        this.ingredientsFromPalmOilN = ingredientsFromPalmOilN;
    }

    public String getManufacturingPlaces() {
        return manufacturingPlaces;
    }

    public void setManufacturingPlaces(String manufacturingPlaces) {
        this.manufacturingPlaces = manufacturingPlaces;
    }

    public String getImageIngredientsThumbUrl() {
        return imageIngredientsThumbUrl;
    }

    public void setImageIngredientsThumbUrl(String imageIngredientsThumbUrl) {
        this.imageIngredientsThumbUrl = imageIngredientsThumbUrl;
    }

    public List<String> getIngredientsHierarchy() {
        return ingredientsHierarchy;
    }

    public void setIngredientsHierarchy(List<String> ingredientsHierarchy) {
        this.ingredientsHierarchy = ingredientsHierarchy;
    }

    public String getNutritionGradeFr() {
        return nutritionGradeFr;
    }

    public void setNutritionGradeFr(String nutritionGradeFr) {
        this.nutritionGradeFr = nutritionGradeFr;
    }

    public NutrientLevels getNutrientLevels() {
        return nutrientLevels;
    }

    public void setNutrientLevels(NutrientLevels nutrientLevels) {
        this.nutrientLevels = nutrientLevels;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<String> getLabelsPrevHierarchy() {
        return labelsPrevHierarchy;
    }

    public void setLabelsPrevHierarchy(List<String> labelsPrevHierarchy) {
        this.labelsPrevHierarchy = labelsPrevHierarchy;
    }

    public List<String> getLastImageDatesTags() {
        return lastImageDatesTags;
    }

    public void setLastImageDatesTags(List<String> lastImageDatesTags) {
        this.lastImageDatesTags = lastImageDatesTags;
    }

    public List<Object> getIngredientsFromPalmOilTags() {
        return ingredientsFromPalmOilTags;
    }

    public void setIngredientsFromPalmOilTags(List<Object> ingredientsFromPalmOilTags) {
        this.ingredientsFromPalmOilTags = ingredientsFromPalmOilTags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getDebugParamSortedLangs() {
        return debugParamSortedLangs;
    }

    public void setDebugParamSortedLangs(List<String> debugParamSortedLangs) {
        this.debugParamSortedLangs = debugParamSortedLangs;
    }

    public Integer getScansN() {
        return scansN;
    }

    public void setScansN(Integer scansN) {
        this.scansN = scansN;
    }

    public List<Object> getManufacturingPlacesDebugTags() {
        return manufacturingPlacesDebugTags;
    }

    public void setManufacturingPlacesDebugTags(List<Object> manufacturingPlacesDebugTags) {
        this.manufacturingPlacesDebugTags = manufacturingPlacesDebugTags;
    }

    public List<Object> getPackagingDebugTags() {
        return packagingDebugTags;
    }

    public void setPackagingDebugTags(List<Object> packagingDebugTags) {
        this.packagingDebugTags = packagingDebugTags;
    }

}
