package com.example.redisexcample.domain;

import java.util.List;

public class Category {
    //
    private String code;
    private transient List<CategoryInfo> categoryInfos;
    private transient List<Product> products;

}
