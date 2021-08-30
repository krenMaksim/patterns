package com.kren.pattern.decorator;

class Latte extends Coffee {
    private static final double PRICE = 0.5;
    private static final String NAME = Latte.class.getSimpleName();

    public Latte() {
        super(PRICE, NAME);
    }
}
