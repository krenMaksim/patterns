package com.kren.pattern.decorator;

abstract class Coffee {

    private final double price;
    private final String discription;

    Coffee(double price, String discription) {
        this.price = price;
        this.discription = discription;
    }

    Coffee(Coffee coffee, double additionalPrice, String addtionalDdiscription) {
        this.price = coffee.price + additionalPrice;
        this.discription = coffee.discription + "_" + addtionalDdiscription;
    }

    @Override
    final public String toString() {
        return discription + ": " + price + "$";
    }
}
