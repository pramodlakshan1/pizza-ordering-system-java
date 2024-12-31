package org.example.state;

import org.example.model.Order;

public class OutForDeliveryState  implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Order " + order.getOrderId() + " is out for delivery.");
        order.setStatus("Delivered");
    }
}
