package com.javastack.oop.calculator;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Calculator implements Serializable {
	

	private char operator;
	private double num1;
	private double num2;
	private double results;
	
	
	public Calculator() {
	}

	public Calculator(char operator, double num1, double num2) {
		this.operator = operator;
		this.num1 = num1;
		this.num2 = num2;
	}

	public void setResults(double results) {
		this.results = results;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public void performOperation() {
		try {
			switch(operator) {
				case '*':
					results = num1*num2;
					break;
				case '+':
					results = num1+num2;
					break;
				case '-':
					results = num1-num2;
					break;
				case '/':
					results = num1/num2;
					break;
				default:
					System.out.println("Bad operator.\n Operator types include: +, -, *, /");
			}
		}
		catch(Exception e){
			System.out.printf("Exception: %s", e.getMessage());
		}
		return;
		
	}
	
	public double getResults() {
		System.out.println(results);
		return results;
	}
}
