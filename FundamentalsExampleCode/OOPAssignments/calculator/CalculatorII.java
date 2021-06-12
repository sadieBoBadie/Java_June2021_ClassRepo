package com.javastack.oop.calculator;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;

public class CalculatorII implements Serializable {

	private Double result = 0.0;
	private Double product = null;
	private String currentOperator = null;
	
	public CalculatorII() {
		
	}
	
	public Double getResult() {
		
		Double finalResult = result + product;
		result = 0.0;
		currentOperator = null;
		product = null;
		System.out.printf("Result: %s\n", finalResult);
		
		return finalResult;
	}

	public void performOperation(String newOperator) {
		
		double resetSign = newOperator == "+"? 1.0: -1.0;
		currentOperator = newOperator;
		
		switch(newOperator) {
	
			case "+":
			case "-":
				// add last product to result, 
				// reset new product sign (+ or -)
				result += product;
				product = resetSign;
				break;
				
			case "/":
			case "*":
				break;
			
			default:
				System.out.println("Bad operator.\n Operator types include: +, -, *, /");
				getResult();
		}
		
		
		return;
	}
	
	public void performOperation(int number) {
		performOperation((Double)(double)number);
	}
	
	public void performOperation(Double number) {
		
		// if new operation
		if (currentOperator == null) {
			product = number;
			
		} else if (currentOperator.equals("/")) {
			product /= number;
			
		
		// If multiplying
		} else {
			// Note: if adding/subtracting this starts a 
			// new product with the correct sign.
			product *= number;
		}
	}
	
}
