package org.example.model;

import java.util.List;

public class Pizza {
    private String name;
    private String crust;
    private String sauce;
    private List<String> toppings;
    private String cheese;


    public Pizza(String name, String crust, String sauce, List<String> toppings, String cheese) {
        this.name = name;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.cheese = cheese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pizza [name=" + name + ", crust=" + crust + ", sauce=" + sauce + ", toppings=" + toppings + ", cheese=" + cheese + "]";
    }
}
