package com.example.redisexcample.store;

import com.example.redisexcample.domain.Product;

import java.util.List;

public interface ProductStore {
    //
    void addProduct(Product product);
    Product getProduct();
    void addProducts(List<Product> products);
    List<Product> getProducts();
}
