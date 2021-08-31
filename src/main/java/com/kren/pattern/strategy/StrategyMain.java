package com.kren.pattern.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Duck duck = DuckContext.DUCK_ONE;
        duck.quack();
        duck.fly();

        duck = DuckContext.DUCK_TWO;
        duck.quack();
        duck.fly();

        duck = DuckContext.DUCK_THREE;
        duck.quack();
        duck.fly();
    }
}
