package com.example.redisexcample.domain;

import java.io.Serializable;
import java.util.List;

public class Merchant implements Serializable {
    //
    private MerchantStatus status;
    private String logoId;                  //FileId on FileService
    private String phoneNumber;
    private String address;
    private transient List<Tag> tags;
    private transient List<Product> products;
    private transient List<MerchantInfo> merchantInfos;

    public Merchant(MerchantStatus status, String logoId, String phoneNumber, String address, List<Tag> tags, List<Product> products, List<MerchantInfo> merchantInfos) {
        this.status = status;
        this.logoId = logoId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.tags = tags;
        this.products = products;
        this.merchantInfos = merchantInfos;
    }

    public MerchantStatus getStatus() {
        return status;
    }

    public void setStatus(MerchantStatus status) {
        this.status = status;
    }

    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<MerchantInfo> getMerchantInfos() {
        return merchantInfos;
    }

    public void setMerchantInfos(List<MerchantInfo> merchantInfos) {
        this.merchantInfos = merchantInfos;
    }
}
