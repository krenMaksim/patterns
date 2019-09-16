package com.kren.pattern.composite.order;

public class Order {
    private final Box orderBox;

    public Order(Box orderBox) {
        this.orderBox = orderBox;
    }

    public int getOrderPrice() {
        return orderBox.getPrice();
    }
}
