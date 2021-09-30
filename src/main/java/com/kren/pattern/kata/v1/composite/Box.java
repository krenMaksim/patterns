package com.kren.pattern.kata.v1.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Box implements Order {

    private final List<Order> products;
    private final List<Order> boxes;

    public Box() {
        products = new ArrayList<>();
        boxes = new ArrayList<>();
    }

    public void addBox(Box b) {
        boxes.add(b);
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public int getPrice() {
        return Stream.concat(products.stream(), boxes.stream())
                     .mapToInt(Order::getPrice)
                     .sum();
    }
}
