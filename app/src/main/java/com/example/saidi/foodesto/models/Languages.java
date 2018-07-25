
package com.example.saidi.foodesto.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Languages {

    @SerializedName("en:english")
    @Expose
    private Integer enEnglish;

    public Integer getEnEnglish() {
        return enEnglish;
    }

    public void setEnEnglish(Integer enEnglish) {
        this.enEnglish = enEnglish;
    }

}
