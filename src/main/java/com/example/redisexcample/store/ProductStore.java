package com.example.redisexcample.store;

import com.example.redisexcample.domain.Product;

import java.util.List;

public interface ProductStore {
    //
    void addProducts(List<Product> products);
    List<Product> getProducts();

    void deleteDb();
}
