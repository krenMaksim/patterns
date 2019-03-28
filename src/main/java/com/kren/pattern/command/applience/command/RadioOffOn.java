package com.kren.pattern.command.applience.command;

import com.kren.pattern.command.applience.Audio;

public class RadioOffOn extends Operation {

    public RadioOffOn(Audio audio) {
        this.onOperation = () -> {
            audio.chooseRadio();
            audio.setVolume(5);
        };
        this.offOperation = () -> audio.off();
    }
}
