package org.example.pattern;

import org.example.model.Order;



public class OrderStatusNotification implements OrderStatusObserver {


    @Override
    public void update(Order order) {
        System.out.println("Order ID: " + order.getOrderId() + " is now: " + order.getStatus());

    }
}
