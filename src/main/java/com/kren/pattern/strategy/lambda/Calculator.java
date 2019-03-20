package com.kren.pattern.strategy.lambda;

import java.util.function.BinaryOperator;

class Calculator {

    private BinaryOperator<Integer> operation;

    public Calculator(BinaryOperator<Integer> operation) {
        this.operation = operation;
    }

    public Integer calculate(Integer val1, Integer val2) {
        return operation.apply(val1, val2);
    }

    public void setOperation(BinaryOperator<Integer> operation) {
        this.operation = operation;
    }

}
