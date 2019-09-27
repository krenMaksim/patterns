package com.kren.pattern.mediator.solution;

import com.kren.pattern.mediator.FanOptions;

public class Fan implements FanOptions {
    private boolean on;
    private final Mediator mediator;

    public Fan(Mediator mediator) {
        this.on = false;
        this.mediator = mediator;
    }

    @Override
    public void off() {
        System.out.println("Fan has been off");
        on = false;
        mediator.supplierOff();
    }

    @Override
    public void on() {
        System.out.println("Fan has been on");
        on = true;
        mediator.supplierOn();
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
