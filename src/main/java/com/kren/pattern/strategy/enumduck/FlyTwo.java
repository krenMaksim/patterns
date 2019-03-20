package com.kren.pattern.strategy.enumduck;

class FlyTwo implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("flyTwo");

    }

}
