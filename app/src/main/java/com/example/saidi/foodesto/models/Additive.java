package com.example.saidi.foodesto.models;

import com.google.gson.annotations.SerializedName;


public class Additive {

    @SerializedName("code")
    private String code;
    @SerializedName("name")
    private String name;
    @SerializedName("impact")
    private String impact;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

}
