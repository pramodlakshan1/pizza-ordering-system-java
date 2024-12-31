package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class UserProfile {
    private String userId;
    private Map<String, Pizza> favorites;  // A map of pizza names to pizza objects

    public UserProfile(String userId) {
        this.userId = userId;
        this.favorites = new HashMap<>();
    }

    public void addFavorite(String pizzaName, Pizza pizza) {
        favorites.put(pizzaName, pizza);
    }

    public Pizza getFavorite(String pizzaName) {
        return favorites.get(pizzaName);
    }

    public void removeFavorite(String pizzaName) {
        favorites.remove(pizzaName);
    }

    public Map<String, Pizza> getFavorites() {
        return favorites;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "UserProfile [userId=" + userId + ", favorites=" + favorites + "]";
    }
}
