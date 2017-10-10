package com.spring.practice.model;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private LocalDateTime date;
    private OrderDetails orderDetails;

    public Order() {
    }

    public Order(int id, LocalDateTime date, OrderDetails orderDetails) {
        this.id = id;
        this.date = date;
        this.orderDetails = orderDetails;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }
}
