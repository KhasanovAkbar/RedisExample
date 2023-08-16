package com.example.redisexcample.cache;

import com.example.redisexcample.domain.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class ProductJsonSerializer implements RedisSerializer<Product> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] serialize(Product product) throws SerializationException {
        try {
            return objectMapper.writeValueAsBytes(product);
        } catch (Exception e) {
            throw new SerializationException("Error serializing Product", e);
        }
    }

    @Override
    public Product deserialize(byte[] bytes) throws SerializationException {

        if (bytes == null) {
            return null;
        }
        try {
            return objectMapper.readValue(bytes, Product.class);
        } catch (Exception e) {
            throw new SerializationException("Error deserializing Product", e);
        }
    }
}

