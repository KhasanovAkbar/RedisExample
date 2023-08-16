package com.example.redisexcample.domain;

import java.util.List;

public class Role {
    //
    private String name;
    private transient List<User> users;
    private transient List<Permission> permissions;
}
