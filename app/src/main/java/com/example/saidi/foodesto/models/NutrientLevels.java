
package com.example.saidi.foodesto.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NutrientLevels {

    @SerializedName("sugars")
    @Expose
    private String sugars;
    @SerializedName("saturated-fat")
    @Expose
    private String saturatedFat;
    @SerializedName("salt")
    @Expose
    private String salt;
    @SerializedName("fat")
    @Expose
    private String fat;

    public String getSugars() {
        return sugars;
    }

    public void setSugars(String sugars) {
        this.sugars = sugars;
    }

    public String getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(String saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

}
