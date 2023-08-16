package com.example.redisexcample.domain;

import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("Product")
public class Product  extends DomainEntity {
    //
    private Float price;
    private boolean isSpecial;

     private transient Currency currency;
    private transient Category category;
    private transient Merchant merchant;
    private List<File> images;
    private List<Tag> tags;
    private  List<User> usersWhoLiked;
    private  List<ProductInfo> productInfos;

    public Product(String id){
        //
        super(id);
    }

    public Product(Float price, boolean isSpecial, Currency currency, Category category, Merchant merchant, List<File> images, List<Tag> tags, List<User> usersWhoLiked, List<ProductInfo> productInfos) {
        this.price = price;
        this.isSpecial = isSpecial;
        this.currency = currency;
        this.category = category;
        this.merchant = merchant;
        this.images = images;
        this.tags = tags;
        this.usersWhoLiked = usersWhoLiked;
        this.productInfos = productInfos;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public List<File> getImages() {
        return images;
    }

    public void setImages(List<File> images) {
        this.images = images;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<User> getUsersWhoLiked() {
        return usersWhoLiked;
    }

    public void setUsersWhoLiked(List<User> usersWhoLiked) {
        this.usersWhoLiked = usersWhoLiked;
    }

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }
}
