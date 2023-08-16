package com.example.redisexcample.service;

import com.example.redisexcample.domain.Product;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    //
    String hashKey = "productList";
    String fieldKey = "products";
    @Resource(name = "redisTemplate")
    private HashOperations<String, String, List<Product>> hashOperations;

    @Override
    public void putProducts(List<Product> products) {
        //
        hashOperations.put(hashKey, fieldKey, products);
    }

    @Override
    public List<Product> getProducts() {
        //
        return hashOperations.get(hashKey, fieldKey);
    }

    @Override
    public void clearRedis() {
        hashOperations.delete(hashKey, fieldKey);
    }


}
