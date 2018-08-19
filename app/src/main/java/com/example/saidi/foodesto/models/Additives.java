package com.example.saidi.foodesto.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by saidi on 19/08/2018.
 */

public class Additives {
    @SerializedName("additives")
    private List<Additive> additives = null;

    public List<Additive> getAdditives() {
        return additives;
    }

    public void setAdditives(List<Additive> additives) {
        this.additives = additives;
    }

}
