package com.example.redisexcample.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    //
    private String username;
    private String fullName;
    private String password;
    private String plUserId;
    private UserStatus status;
    private transient Role role;
    private transient List<Product> favouriteProducts;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlUserId() {
        return plUserId;
    }

    public void setPlUserId(String plUserId) {
        this.plUserId = plUserId;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Product> getFavouriteProducts() {
        return favouriteProducts;
    }

    public void setFavouriteProducts(List<Product> favouriteProducts) {
        this.favouriteProducts = favouriteProducts;
    }

    public User(String username, String fullName, String password, String plUserId, UserStatus status, Role role, List<Product> favouriteProducts) {
        this.username = username;
        this.fullName = fullName;
        this.password = password;
        this.plUserId = plUserId;
        this.status = status;
        this.role = role;
        this.favouriteProducts = favouriteProducts;
    }
}
