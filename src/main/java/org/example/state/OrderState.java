package org.example.state;

import org.example.model.Order;

public interface OrderState {
    void handle(Order order);
}
