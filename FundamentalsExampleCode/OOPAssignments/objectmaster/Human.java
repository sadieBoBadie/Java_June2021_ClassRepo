package com.javastack.oop.objectmaster;

public class Human {
	
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	protected String name;

	public Human(String name) {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		this.name = name;
		health = 100;
		
		System.out.printf("%s enters the scene, ready to fight.", name);
		// TODO Auto-generated constructor stub
	}
	
	public void changeStrength(int amount, boolean isIncrease) {
		strength = isIncrease ? strength + amount : strength - amount;
	}
	
	public void changeStealth(int amount, boolean isIncrease) {
		stealth = isIncrease ? stealth + amount : stealth - amount;
	}
	public void changeIntelligence(int amount, boolean isIncrease) {
		intelligence = isIncrease ? intelligence + amount : intelligence - amount;
	}
	public void changeHealth(int amount, boolean isIncrease) {
		health = isIncrease ? health + amount : health - amount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	
	public void displayStats() {
		System.out.printf(
				"%s: Health: %s, Strength: %s\n", name, health, strength
				);
	}
	
	
	public void attack(Human opponent) {
		System.out.printf(
				"%s attacks %s. %<s's health is decreased by %s\n", 
				name, opponent.getName(), strength
				);
		opponent.changeHealth(this.strength, false);
	}

}
