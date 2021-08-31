package com.kren.pattern.composite.order;

import com.kren.pattern.composite.product.Product;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Box implements OrderItem {
    
    public static Box newInstance(Collection<Box> nestedBoxes, Collection<Product> products) {
        return new Box(nestedBoxes, products);
    }

    public static Box newInstanceHasOnlyBoxes(Collection<Box> nestedBoxes) {
        return new Box(nestedBoxes, Collections.emptyList());
    }

    public static Box newInstanceHasOnlyProducts(Collection<Product> products) {
        return new Box(Collections.emptyList(), products);
    }

    private final Collection<Box> boxes;
    private final Collection<Product> products;

    private Box(Collection<Box> boxes, Collection<Product> products) {
        this.boxes = boxes;
        this.products = products;
    }

    @Override
    public int getPrice() {
        Stream<OrderItem> items = getOrderItems();
        return items.mapToInt(OrderItem::getPrice).sum();
    }

    private Stream<OrderItem> getOrderItems() {
        return Stream.concat(boxes.stream(), products.stream());
    }
}
