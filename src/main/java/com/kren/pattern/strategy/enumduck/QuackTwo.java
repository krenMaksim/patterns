package com.kren.pattern.strategy.enumduck;

class QuackTwo implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("quakTwo");
    }
}
