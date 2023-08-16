package com.example.redisexcample.domain;

import java.util.List;

public class Merchant {
    //
    private MerchantStatus status;
    private String logoId;                  //FileId on FileService
    private String phoneNumber;
    private String address;
    private transient List<Tag> tags;
    private transient List<Product> products;
    private transient List<MerchantInfo> merchantInfos;
}
