package com.kren.pattern.strategy.lambda;

class StrategyLambdaMain {

    public static void main(String[] args) {
	Calculator calc = new Calculator((val1, val2) -> val1 + val2);

	System.out.println(calc.calculate(10, 5));

	calc.setOperation((val1, val2) -> val1 * val2);

	System.out.println(calc.calculate(10, 5));

	CalculatorBetter calcBetter = new CalculatorBetter(CalculatorBetter.OperationType.ADDITION);

	System.out.println(calcBetter.calculate(10, 5));

	calcBetter.setOperation(CalculatorBetter.OperationType.DIVISION);

	System.out.println(calcBetter.calculate(10, 5));

    }

}
