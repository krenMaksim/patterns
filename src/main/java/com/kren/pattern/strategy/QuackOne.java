package com.kren.pattern.strategy;

class QuackOne implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("quakOne");
    }
}
