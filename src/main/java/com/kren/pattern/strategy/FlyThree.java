package com.kren.pattern.strategy;

class FlyThree implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("flyTwo");
    }
}
