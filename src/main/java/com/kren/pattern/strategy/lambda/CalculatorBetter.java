package com.kren.pattern.strategy.lambda;

import java.util.function.BinaryOperator;

class CalculatorBetter {

    private BinaryOperator<Integer> operation;

    public CalculatorBetter(OperationType operationType) {
	this.operation = operationType.getOperation();
    }

    public Integer calculate(Integer val1, Integer val2) {
	return operation.apply(val1, val2);
    }

    public void setOperation(OperationType operationType) {
	this.operation = operationType.getOperation();
    }

    public static enum OperationType {
	ADDITION((val1, val2) -> val1 + val2),

	SUBTRACTION((val1, val2) -> val1 - val2),

	DIVISION((val1, val2) -> val1 / val2);

	private BinaryOperator<Integer> operation;

	private OperationType(BinaryOperator<Integer> operation) {
	    this.operation = operation;
	}

	BinaryOperator<Integer> getOperation() {
	    return operation;
	}
    }
}
