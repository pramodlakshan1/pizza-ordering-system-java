package org.example.model;

import java.util.List;

public class Order {
    private String orderId;
    private List<Pizza> pizzas;
    private String status;
    private String deliveryType;
    public Order(String orderId, List<Pizza> pizzas, String status, String deliveryType) {
        this.orderId = orderId;
        this.pizzas = pizzas;
        this.status = status;
        this.deliveryType = deliveryType;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", pizzas=" + pizzas + ", status=" + status + ", deliveryType=" + deliveryType + "]";
    }
}
