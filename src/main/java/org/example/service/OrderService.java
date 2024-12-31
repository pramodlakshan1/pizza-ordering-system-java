package org.example.service;

import org.example.model.*;
import org.example.pattern.OrderStatusSubject;
import org.example.pattern.OrderStatusNotification;

public class OrderService {
    public static void main(String[] args) {
        Order order = new Order("123", null, "Placed", "Delivery");
        OrderStatusSubject orderStatusSubject = new OrderStatusSubject(order);


        orderStatusSubject.addObserver(new OrderStatusNotification());


        orderStatusSubject.setOrderStatus("In Preparation");
        orderStatusSubject.setOrderStatus("Out for Delivery");
    }
}
