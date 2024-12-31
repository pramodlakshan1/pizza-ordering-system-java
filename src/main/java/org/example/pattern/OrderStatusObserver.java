package org.example.pattern;

import org.example.model.Order;

public interface OrderStatusObserver {
    void update(Order order);
}
