package com.kren.pattern.mediator.problem;

import com.kren.pattern.mediator.FanOptions;
import com.kren.pattern.mediator.PowerSupplier;

public class Fan implements FanOptions {
    private final PowerSupplier supplier;
    private boolean on;

    public Fan(PowerSupplier supplier) {
        this.on = false;
        this.supplier = supplier;
    }

    @Override
    public void off() {
        System.out.println("Fan has been off");
        on = false;
        supplier.off();
    }

    @Override
    public void on() {
        System.out.println("Fan has been on");
        on = true;
        supplier.on();
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
