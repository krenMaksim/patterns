package com.kren.pattern.command.stock;

import com.kren.pattern.command.stock.command.Operation;

import java.util.LinkedList;
import java.util.List;

class Brocker {

    private final List<Operation> operations;

    public Brocker() {
        this.operations = new LinkedList<>();
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public void accomplishAll() {
        operations.forEach(o -> o.execute());
    }
}
