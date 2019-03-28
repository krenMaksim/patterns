package com.kren.pattern.command.applience.remote.control;

import com.kren.pattern.command.applience.command.Operation;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private static final int NUMBER_BUTTONS = 4;

    private List<Operation> operations;

    public RemoteControl() {
        this.operations = new ArrayList<>(NUMBER_BUTTONS);
    }

    public void click(int buttonNumber) {
        operations.get(buttonNumber)
                  .execute();
    }

    public void assignApplience(int buttonNumber, Operation applience) {
        operations.set(buttonNumber, applience);
    }

    public void removeApplience(int buttonNumber) {
        operations.set(buttonNumber, null);
    }
}