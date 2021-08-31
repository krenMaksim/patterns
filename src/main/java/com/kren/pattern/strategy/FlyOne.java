package com.kren.pattern.strategy;

class FlyOne implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("flyONe");
    }
}
