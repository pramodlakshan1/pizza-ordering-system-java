package org.example.pattern;



import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusSubject {
    private List<OrderStatusObserver> observers = new ArrayList<>();
    private Order order;

    public OrderStatusSubject(Order order) {
        this.order = order;
    }

    public void addObserver(OrderStatusObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderStatusObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderStatusObserver observer : observers) {
            observer.update(order);
        }
    }

    public void setOrderStatus(String status) {
        order.setStatus(status);
        notifyObservers();  // Notify all observers when status changes
    }
}
