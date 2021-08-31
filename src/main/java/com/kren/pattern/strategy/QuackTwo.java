package com.kren.pattern.strategy;

class QuackTwo implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("quakTwo");
    }
}
