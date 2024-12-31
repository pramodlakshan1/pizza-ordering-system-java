package org.example.state;

import org.example.model.Order;

public class PlacedState  implements OrderState{


    @Override
    public void handle(Order order) {
        System.out.println("Order " + order.getOrderId() + " is placed.");
        order.setStatus("In Preparation");
    }
}
