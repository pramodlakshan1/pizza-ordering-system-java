package org.example.model;

public class Feedback {
    private String orderId;
    private String customerId;
    private String comment;
    private int rating;  // Rating from 1 to 5

    public Feedback(String orderId, String customerId, String comment, int rating) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.comment = comment;
        this.rating = rating;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Feedback [orderId=" + orderId + ", customerId=" + customerId + ", comment=" + comment + ", rating=" + rating + "]";
    }

}
