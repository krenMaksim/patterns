package com.kren.pattern.command.applience.command;

import com.kren.pattern.command.applience.Light;

public class LightOffOn extends Operation {

    public LightOffOn(Light lihgt) {
        this.onOperation = () -> lihgt.lightOn();
        this.offOperation = () -> lihgt.lightOff();
    }
}
