package com.kren.pattern.mediator.problem;

public class Button {

    private final Fan fan;

    public Button(Fan fan) {
        this.fan = fan;
    }

    public void press() {
        if (fan.isOn()) {
            fan.off();
        } else {
            fan.on();
        }
    }
}
