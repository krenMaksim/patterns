package com.kren.pattern.rev26072023.composite;

import java.util.List;

class Main {
    
    /*
        For example, imagine that you have two types of objects: Products and Boxes.
        A Box can contain several Products as well as a number of smaller Boxes.
        These little Boxes can also hold some Products or even smaller Boxes, and so on.

        Say you decide to create an ordering system that uses these classes.
        Orders could contain simple products without any wrapping,
        as well as boxes stuffed with products...and other boxes. 
        How would you determine the total price of such an order?
    */

    public static void main(String[] args) {
        Product pen = new Product(2);
        Product usb = new Product(5);
        Product tv = new Product(500);
        Product laptop = new Product(1_000);
        Product car = new Product(10_000);

        Box boxOne = new Box(List.of(pen, pen));
        Box boxTwo = new Box(List.of(pen, usb));
        Box boxThree = new Box(List.of(boxOne), List.of(pen, usb));

        Order orderOne = new Order(List.of(car));
        Order orderTwo = new Order(List.of(boxOne, boxTwo));
        Order orderThree = new Order(List.of(tv, laptop, boxThree));

        System.out.println("orderOne price " + orderOne.calculatePrice());
        System.out.println("orderTwo price " + orderTwo.calculatePrice());
        System.out.println("orderThree price " + orderThree.calculatePrice());
    }

    static class Product implements Item {

        private final int price;

        public Product(int price) {
            this.price = price;
        }

        @Override
        public int calculatePrice() {
            return price;
        }

    }

    static class Box implements Item {

        private final List<Box> boxes;
        private final List<Product> products;

        public Box(List<Product> products) {
            this(List.of(), products);
        }

        public Box(List<Box> boxes, List<Product> products) {
            this.boxes = boxes;
            this.products = products;
        }

        @Override
        public int calculatePrice() {
            return Item.calculateTotalPrice(boxes) + Item.calculateTotalPrice(products);
        }

    }

    static class Order {

        private final List<Item> items;

        public Order(List<Item> items) {
            this.items = items;
        }

        public int calculatePrice() {
            return Item.calculateTotalPrice(items);
        }
    }

    static interface Item {

        int calculatePrice();

        static <T extends Item> int calculateTotalPrice(List<T> items) {
            return items.stream()
                .mapToInt(Item::calculatePrice)
                .sum();
        }
    }

}
