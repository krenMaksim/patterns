package com.kren.pattern.strategy;

class FlyTwo implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("flyTwo");
    }
}
