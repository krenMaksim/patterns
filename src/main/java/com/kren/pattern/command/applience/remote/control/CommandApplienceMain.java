package com.kren.pattern.command.applience.remote.control;

import com.kren.pattern.command.applience.Audio;
import com.kren.pattern.command.applience.Light;
import com.kren.pattern.command.applience.command.LightOffOn;
import com.kren.pattern.command.applience.command.RadioOffOn;

class CommandApplienceMain {

    public static void main(String[] args) {
        Light lihgt = null;
        Audio audio = null;

        RemoteControl control = new RemoteControl();
        control.assignApplience(2, new LightOffOn(lihgt));
        control.assignApplience(1, new RadioOffOn(audio));

        control.click(2);
    }
}
