package com.kren.pattern.mediator.solution;

import com.kren.pattern.mediator.FanOptions;
import com.kren.pattern.mediator.PowerSupplier;

public class Mediator {

    private final FanOptions fan;
    private final PowerSupplier supplier;

    public Mediator(FanOptions fan, PowerSupplier supplier) {
        this.fan = fan;
        this.supplier = supplier;
    }

    public void funButton() {
        if (fan.isOn()) {
            fan.off();
        } else {
            fan.on();
        }
    }

    public void supplierOff() {
        supplier.off();
    }

    public void supplierOn() {
        supplier.on();
    }
}
