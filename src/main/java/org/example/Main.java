package org.example;

import org.example.model.Feedback;
import org.example.service.FeedbackService;
import org.example.service.SeasonalSpecialService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        SeasonalSpecialService specialService = new SeasonalSpecialService();
        FeedbackService feedbackService = new FeedbackService();

        while (true) {
            System.out.println("Welcome to the Pizza Shop!");
            System.out.println("1. Place Order");
            System.out.println("2. Check Seasonal Specials");
            System.out.println("3. Add Feedback");
            System.out.println("4. View Feedback");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.println("Placing a new order...");


                    System.out.println("Choose crust type: ");
                    System.out.println("1. Thin Crust");
                    System.out.println("2. Thick Crust");
                    System.out.println("3. Stuffed Crust");
                    System.out.print("Enter your choice: ");
                    int crustChoice = scanner.nextInt();
                    scanner.nextLine();

                    String crust = switch (crustChoice) {
                        case 1 -> "Thin Crust";
                        case 2 -> "Thick Crust";
                        case 3 -> "Stuffed Crust";
                        default -> {
                            System.out.println("Invalid choice. Defaulting to Thin Crust.");
                            yield "Thin Crust";
                        }
                    };

                    System.out.println("Choose sauce type: ");
                    System.out.println("1. Tomato Sauce");
                    System.out.println("2. Barbecue Sauce");
                    System.out.println("3. Alfredo Sauce");
                    System.out.print("Enter your choice: ");
                    int sauceChoice = scanner.nextInt();
                    scanner.nextLine();

                    String sauce = switch (sauceChoice) {
                        case 1 -> "Tomato Sauce";
                        case 2 -> "Barbecue Sauce";
                        case 3 -> "Alfredo Sauce";
                        default -> {
                            System.out.println("Invalid choice. Defaulting to Tomato Sauce.");
                            yield "Tomato Sauce";
                        }
                    };

                    System.out.println("Enter number of toppings (up to 3): ");
                    int numToppings = Math.min(scanner.nextInt(), 3);
                    scanner.nextLine();

                    String[] toppings = new String[numToppings];
                    for (int i = 0; i < numToppings; i++) {
                        System.out.print("Enter topping " + (i + 1) + ": ");
                        toppings[i] = scanner.nextLine();
                    }

                    System.out.println("Choose cheese type: ");
                    System.out.println("1. Mozzarella");
                    System.out.println("2. Cheddar");
                    System.out.println("3. Parmesan");
                    System.out.print("Enter your choice: ");
                    int cheeseChoice = scanner.nextInt();
                    scanner.nextLine();

                    String cheese;
                    switch (cheeseChoice) {
                        case 1: cheese = "Mozzarella"; break;
                        case 2: cheese = "Cheddar"; break;
                        case 3: cheese = "Parmesan"; break;
                        default:
                            System.out.println("Invalid choice. Defaulting to Mozzarella.");
                            cheese = "Mozzarella";
                    }


                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Choose order type: ");
                    System.out.println("1. Pickup");
                    System.out.println("2. Delivery");
                    System.out.print("Enter your choice: ");
                    int orderTypeChoice = scanner.nextInt();
                    scanner.nextLine();

                    String orderType = (orderTypeChoice == 2) ? "Delivery" : "Pickup";


                    System.out.println("Order Summary:");
                    System.out.println("Crust: " + crust);
                    System.out.println("Sauce: " + sauce);
                    System.out.println("Toppings: " + String.join(", ", toppings));
                    System.out.println("Cheese: " + cheese);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Order Type: " + orderType);

                    System.out.println("Confirm order? (yes/no): ");
                    String confirm = scanner.nextLine();

                    if (confirm.equalsIgnoreCase("yes")) {
                        System.out.println("Order placed successfully!");

                    } else {
                        System.out.println("Order canceled.");
                    }
                    break;

                case 2:

                    specialService.checkAndApplySpecials();
                    break;
                case 3:

                    System.out.print("Enter order ID: ");
                    String orderId = scanner.nextLine();
                    System.out.print("Enter your rating (1-5): ");
                    int rating = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter your comment: ");
                    String comment = scanner.nextLine();
                    Feedback feedback = new Feedback(orderId, "user1", comment, rating);
                    feedbackService.addFeedback(feedback);
                    break;
                case 4:

                    feedbackService.displayFeedback();
                    break;
                case 5:

                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
