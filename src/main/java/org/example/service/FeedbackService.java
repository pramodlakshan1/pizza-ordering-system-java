package org.example.service;

import java.util.List;
import java.util.ArrayList;
import org.example.model.Feedback;

public class FeedbackService {
    private List<Feedback> feedbackList = new ArrayList<>();

    public void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
        System.out.println("Feedback added: " + feedback);
    }

    public void displayFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            System.out.println("Feedback for orders:");
            for (Feedback feedback : feedbackList) {
                System.out.println(feedback);
            }
        }
    }

    public static void main(String[] args) {
        FeedbackService feedbackService = new FeedbackService();


        feedbackService.addFeedback(new Feedback("123", "user1", "Great pizza! Very tasty.", 5));
        feedbackService.addFeedback(new Feedback("124", "user2", "Delivery was late, but pizza was good.", 3));


        feedbackService.displayFeedback();
    }

}
