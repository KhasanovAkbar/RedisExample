package com.example.redisexcample.domain;

import java.io.Serializable;

public class ProductInfo implements Serializable {
    //
    private String name;
    private String description;
    private transient LanguageCode languageCode;
    private transient Product product;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductInfo(String name, String description, LanguageCode languageCode, Product product) {
        this.name = name;
        this.description = description;
        this.languageCode = languageCode;
        this.product = product;
    }
}
