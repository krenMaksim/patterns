package com.kren.pattern.strategy.enumduck;

class QuackThree implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("quakThree");
    }
}
