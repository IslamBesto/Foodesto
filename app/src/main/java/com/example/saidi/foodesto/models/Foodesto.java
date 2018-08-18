
package com.example.saidi.foodesto.models;

import com.google.gson.annotations.SerializedName;

public class Foodesto {

    @SerializedName("product")
    private Product product;
    @SerializedName("code")
    private String code;
    @SerializedName("status_verbose")
    private String statusVerbose;
    @SerializedName("status")
    private Integer status;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatusVerbose() {
        return statusVerbose;
    }

    public void setStatusVerbose(String statusVerbose) {
        this.statusVerbose = statusVerbose;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
