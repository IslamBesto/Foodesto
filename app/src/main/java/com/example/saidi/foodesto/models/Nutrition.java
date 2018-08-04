
package com.example.saidi.foodesto.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Nutrition implements Serializable {

    @SerializedName("small")
    @Expose
    private Small small;
    @SerializedName("display")
    @Expose
    private Display display;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

}
