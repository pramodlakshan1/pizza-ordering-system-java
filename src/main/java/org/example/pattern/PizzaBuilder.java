package org.example.pattern;

import org.example.model.Pizza;

import java.util.List;

public class PizzaBuilder {
    private String name;
    private String crust;
    private String sauce;
    private List<String> toppings;
    private String cheese;

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public Pizza build() {
        return new Pizza(name, crust, sauce, toppings, cheese);
    }
}
