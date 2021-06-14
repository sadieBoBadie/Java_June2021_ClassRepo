package com.java.projects.controllers;

public class Square extends Shape implements Sprite {
	
	private double length;

	public Square() {
		super();
	}

	public Square(Integer numSides, String color, String name, double length) {
		
		this.length = length;
	}
	
	public double getArea() {
		return length*length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean incrementHealth() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
