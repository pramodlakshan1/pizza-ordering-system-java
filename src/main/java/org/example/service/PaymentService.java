package org.example.service;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {


    private static final Map<String, CardDetails> dummyCards = new HashMap<>();

    static {

        dummyCards.put("4111111111111111", new CardDetails("M H A P L Gunawardhana", "12/2025",
                "123", 5000.0));
        dummyCards.put("5500000000000004", new CardDetails("J kK D Saman", "06/2024",
                "456", 10000.0));
        dummyCards.put("340000000000009", new CardDetails("D H J Appuhami", "08/2026",
                "789", 3000.0));
    }

    public static boolean processPayment(String cardNumber, String cardHolder, String expiryDate, String cvv,
                                         double amount) {

        if (!dummyCards.containsKey(cardNumber)) {
            System.out.println("Card not found.");
            return false;
        }


        CardDetails cardDetails = dummyCards.get(cardNumber);
        if (!cardDetails.getCardHolder().equalsIgnoreCase(cardHolder) ||
                !cardDetails.getExpiryDate().equals(expiryDate) ||
                !cardDetails.getCvv().equals(cvv)) {
            System.out.println("Invalid card details.");
            return false;
        }


        if (cardDetails.getBalance() < amount) {
            System.out.println("Insufficient balance.");
            return false;
        }


        cardDetails.setBalance(cardDetails.getBalance() - amount);
        System.out.println("Payment of " + amount + " processed successfully for " + cardHolder);
        return true;
    }


    private static class CardDetails {
        private String cardHolder;
        private String expiryDate;
        private String cvv;
        private double balance;

        public CardDetails(String cardHolder, String expiryDate, String cvv, double balance) {
            this.cardHolder = cardHolder;
            this.expiryDate = expiryDate;
            this.cvv = cvv;
            this.balance = balance;
        }

        public String getCardHolder() {
            return cardHolder;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public String getCvv() {
            return cvv;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
}

