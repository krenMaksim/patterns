package com.kren.pattern.strategy.enumduck.main;

import com.kren.pattern.strategy.enumduck.Duck;
import com.kren.pattern.strategy.enumduck.DuckContext;

public class DuckMain {

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
