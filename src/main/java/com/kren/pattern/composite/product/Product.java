package com.kren.pattern.composite.product;

import com.kren.pattern.composite.order.OrderItem;

public abstract class Product implements OrderItem {
    private final int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
