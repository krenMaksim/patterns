package com.kren.pattern.strategy.enumduck;

class QuackOne implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("quakOne");
    }
}
