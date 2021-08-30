package com.kren.pattern.decorator;

class WithMilk extends Coffee {
    private static final double PRICE = 0.1;
    private static final String NAME = WithMilk.class.getSimpleName();

    public WithMilk(Coffee coffee) {
        super(coffee, PRICE, NAME);
    }
}
