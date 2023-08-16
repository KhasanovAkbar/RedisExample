package com.example.redisexcample.domain;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {
    //
    private String code;
    private transient List<CategoryInfo> categoryInfos;
    private transient List<Product> products;

    public Category(String code, List<CategoryInfo> categoryInfos, List<Product> products) {
        this.code = code;
        this.categoryInfos = categoryInfos;
        this.products = products;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<CategoryInfo> getCategoryInfos() {
        return categoryInfos;
    }

    public void setCategoryInfos(List<CategoryInfo> categoryInfos) {
        this.categoryInfos = categoryInfos;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
