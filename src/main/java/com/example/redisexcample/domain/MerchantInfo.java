package com.example.redisexcample.domain;

import java.io.Serializable;

public class MerchantInfo implements Serializable {
    //
    private String name;
    private transient LanguageCode languageCode;
    private transient Merchant merchant;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }
}
