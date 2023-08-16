package com.example.redisexcample.store;

import com.example.redisexcample.domain.Product;
import com.example.redisexcample.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductStoreImpl implements ProductStore {
    //
    private final ProductService productService;

    public ProductStoreImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void addProducts(List<Product> products) {
        //
        productService.putProducts(products);
    }

    @Override
    public List<Product> getProducts() {
        //
        return productService.getProducts();
    }

    @Override
    public void deleteDb() {
        productService.clearRedis();
    }

}
