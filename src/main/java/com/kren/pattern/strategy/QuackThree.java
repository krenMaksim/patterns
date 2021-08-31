package com.kren.pattern.strategy;

class QuackThree implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("quakThree");
    }
}
