package com.kren.pattern.command.applience.command;

public abstract class Operation {
    private boolean isOff = true;

    Runnable onOperation;
    Runnable offOperation;

    Operation() {};

    public void execute() {
        if (isOff) {
            onOperation.run();
        } else {
            offOperation.run();
        }
    }
}