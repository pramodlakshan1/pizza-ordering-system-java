package org.example.state;

import org.example.model.Order;

public class InPresentationState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Order " + order.getOrderId() + " is being prepared.");
        order.setStatus("Out for Delivery");
    }
}
