package com.example.redisexcample.service;

import com.example.redisexcample.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    //

    @Autowired
    private  RedisTemplate<String, Product> redisTemplate;



    @Override
    public void putProduct(Product product) {
        //
        redisTemplate.opsForValue().set("product", product);
    }

    @Override
    public Product getProduct() {
        //
        Product product = redisTemplate.opsForValue().get("product");
        assert product != null;
        return product;
    }

    @Override
    public void putProducts(List<Product> products) {
        //
//        redisTemplate.opsForValue().set("products", products);
    }

    @Override
    public List<Product> getProducts() {
        //
        List<Product> products = (List<Product>) redisTemplate.opsForValue().get("products");
        assert products != null;
        return products;
//        return null;
    }
}
