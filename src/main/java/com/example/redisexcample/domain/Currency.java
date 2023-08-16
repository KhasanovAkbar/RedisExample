package com.example.redisexcample.domain;

import java.io.Serializable;

public class Currency implements Serializable {
    //
    private String name;
    private Float ratio;

    public Currency(String name, Float ratio) {
        this.name = name;
        this.ratio = ratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getRatio() {
        return ratio;
    }

    public void setRatio(Float ratio) {
        this.ratio = ratio;
    }
}
