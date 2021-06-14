package com.java.projects.controllers;

public abstract class Shape {
	
	// Member Variables
	private Integer numSides;
	private String color;
	private String name;
	
	
	// Constructor(s)
	public Shape() {
		numSides = 3;
		color = "blue";
	}


	public Shape(Integer numSides, String color, String name) {
		this.numSides = numSides;
		this.color = color;
		this.name = name;
	}

	
	// Methods
	// 
	
	
	
	// Getters / Setters
	
	public Integer getNumSides() {
		return numSides;
	}
	
	
	public void setNumSides(Integer numSides) {
		this.numSides = numSides;
	}
	
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
