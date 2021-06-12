package com.javastack.oop.objectmaster;

public class Ninja extends Human {

	public Ninja(String name) {
		super(name);
		stealth = 10;
		// TODO Auto-generated constructor stub
	}
	
//	Ninja: Add a method steal(Human) that takes the 
//	amount of stealth the ninja has, removes it from the 
//	other human's health, and adds it to the ninja's
	public void steal(Human target) {
		target.changeHealth(this.stealth, false);
		this.changeHealth(this.stealth, true);
		
		System.out.printf(
				"%1$s steals %3$s health points from %2$s\n", 
				name, target.getName(), stealth
				);
	}

//	Ninja: Add a method runAway() that decreases their health by 10

}
