package com.example.redisexcample.domain;

import java.io.Serializable;

public class Tag implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
