package com.kren.pattern.mediator.solution;

import com.kren.pattern.mediator.ButtonOptions;

public class Button implements ButtonOptions {

    private final Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void press() {
        mediator.funButton();
    }
}
