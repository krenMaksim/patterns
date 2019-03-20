package com.kren.pattern.command.stock;

public class Stock {
    private final String name;
    private final int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("buy" + this);
    }

    public void sell() {
        System.out.println("sell" + this);
    }

    @Override
    public String toString() {
        return "Stock [name=" + name + ", quantity=" + quantity + "]";
    }
}
