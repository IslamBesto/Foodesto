package com.example.saidi.foodesto.models;


import android.support.annotation.NonNull;

public class NutrimentQuality {
    private String mQualityTitle;
    private SeverityType severityType;

    public NutrimentQuality() {
    }

    public NutrimentQuality(@NonNull final String mQualityTitle, @NonNull final SeverityType severityType) {
        this.mQualityTitle = mQualityTitle;
        this.severityType = severityType;
    }

    public String getmQualityTitle() {
        return mQualityTitle;
    }

    public void setmQualityTitle(String mQualityTitle) {
        this.mQualityTitle = mQualityTitle;
    }

    public SeverityType getSeverityType() {
        return severityType;
    }

    public void setSeverityType(SeverityType severityType) {
        this.severityType = severityType;
    }
}
