package com.kren.pattern.strategy.enumduck;

public enum DuckContext implements Duck {
    DUCK_ONE(new QuackOne(), new FlyThree()),

    DUCK_TWO(new QuackThree(), new FlyTwo()),

    DUCK_THREE(new QuackThree(), new FlyThree());

    private QuackStrategy quack;
    private FlyStrategy fly;

    private DuckContext(QuackStrategy quack, FlyStrategy fly) {
        this.quack = quack;
        this.fly = fly;
    }

    @Override
    public void quack() {
        quack.quack();
    }

    @Override
    public void fly() {
        fly.fly();
    }
}
