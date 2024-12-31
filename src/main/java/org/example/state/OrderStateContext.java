package org.example.state;

import org.example.model.Order;

public class OrderStateContext {

    private OrderState currentState;

    public OrderStateContext(OrderState initialState) {
        currentState = initialState;
    }

    public void setCurrentState(OrderState state) {
        currentState = state;
    }

    public void handleOrder(Order order) {
        currentState.handle(order);
    }

}
