package com.example.redisexcample.rest;

import com.example.redisexcample.domain.Product;
import com.example.redisexcample.store.ProductStore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    //
    private final ProductStore productStore;

    public ProductController(ProductStore productStore) {
        this.productStore = productStore;
    }

    @PostMapping("/saveList")
    public ResponseEntity<?> addProducts(@RequestBody List<Product> products) {
        //
        productStore.addProducts(products);
        return new ResponseEntity<>(
                "List saved",
                HttpStatus.OK
        );
    }

    @GetMapping("/getList")
    public ResponseEntity<?> getProducts() {
        //
        List<Product> products = productStore.getProducts();
        return new ResponseEntity<>(
                products,
                HttpStatus.OK
        );
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteProducts() {
        //
        productStore.deleteDb();
        return new ResponseEntity<>(
                "Redis deleted",
                HttpStatus.OK
        );
    }
}
