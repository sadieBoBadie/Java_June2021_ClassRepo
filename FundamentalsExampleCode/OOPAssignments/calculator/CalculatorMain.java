package com.javastack.oop.calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		
		// Basic Class Test
		Calculator c = new Calculator();
        c.setNum1(2);
        c.setNum2(3);
        c.setOperator('-');
        c.performOperation();
//        c.getResults();
        
        // Part 2 test
        CalculatorII numberMachine = new CalculatorII();
        numberMachine.performOperation(10);
        numberMachine.performOperation("+");
        numberMachine.performOperation(5);
        numberMachine.performOperation("*");
        numberMachine.performOperation(10);
        numberMachine.performOperation("*");
        numberMachine.performOperation(3);
        numberMachine.performOperation("/");
        numberMachine.performOperation(5);
        numberMachine.performOperation("+");
        numberMachine.performOperation(4);
        numberMachine.performOperation("+");
        numberMachine.performOperation(5);
        numberMachine.performOperation("+");
        numberMachine.performOperation(3.8);
        numberMachine.performOperation("+");
        numberMachine.performOperation(3);
        numberMachine.performOperation("*");
        numberMachine.performOperation(10);
        numberMachine.performOperation("/");
        numberMachine.performOperation(5);
        System.out.println(numberMachine.getResult());

	}

}
