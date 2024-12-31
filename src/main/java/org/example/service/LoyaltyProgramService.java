package org.example.service;

public class LoyaltyProgramService {

    private static int loyaltyPoints = 0;

    public static void addPoints(int points) {
        loyaltyPoints += points;
        System.out.println("Loyalty points added: " + points);
    }

    public static int getPoints() {
        return loyaltyPoints;
    }

    public static void applyDiscount() {
        if (loyaltyPoints >= 100) {
            System.out.println("You have enough points for a discount!");
        } else {
            System.out.println("Not enough points for a discount.");
        }
    }
}
