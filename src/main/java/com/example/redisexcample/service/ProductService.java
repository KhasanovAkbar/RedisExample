package com.example.redisexcample.service;

import com.example.redisexcample.domain.Product;

import java.util.List;

public interface ProductService {

    void putProduct(Product product);

    Product getProduct();

    void putProducts(List<Product> products);

    List<Product> getProducts();
}
