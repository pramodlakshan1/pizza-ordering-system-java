package org.example.service;

import org.example.model.Pizza;
import org.example.model.UserProfile;

import java.util.List;

public class UserProfileService {

    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("user1");


        Pizza pizza1 = new Pizza("Custom Pizza 1", "Thin Crust", "Tomato",
                List.of("Pepperoni", "Olives"), "Mozzarella");
        userProfile.addFavorite(pizza1.getName(), pizza1);


        Pizza favoritePizza = userProfile.getFavorite("Custom Pizza 1");
        System.out.println("Favorite Pizza: " + favoritePizza);


        userProfile.removeFavorite("Custom Pizza 1");
        System.out.println("Favorites after removal: " + userProfile.getFavorites());
    }

}
