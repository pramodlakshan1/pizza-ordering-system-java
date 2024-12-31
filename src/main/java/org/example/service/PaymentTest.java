package org.example.service;

import java.util.Scanner;

public class PaymentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pizzaPrice = 19.99;


        System.out.println("Enter your card details:");
        System.out.print("Card Number: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Card Holder Name: ");
        String cardHolder = scanner.nextLine();

        System.out.print("Expiry Date (MM/YYYY): ");
        String expiryDate = scanner.nextLine();

        System.out.print("CVV: ");
        String cvv = scanner.nextLine();


        boolean paymentSuccess = PaymentService.processPayment(cardNumber,
                cardHolder, expiryDate, cvv, pizzaPrice);
        if (paymentSuccess) {
            System.out.println("Payment successful!");
            LoyaltyProgramService.addPoints(10);
        } else {
            System.out.println("Payment failed!");
        }

        LoyaltyProgramService.applyDiscount();
    }
}
