package com.javastack.oop.objectmaster;

public class Wizard extends Human {

	public Wizard(String name) {
		super(name);
		health = 50;
		intelligence = 8;
		
		// TODO Auto-generated constructor stub
	}
	
	//	Wizard: Add a method heal(Human) that heals the other human 
	//	by the wizard's intelligence
	public void heal(Human injuredPerson) {
		injuredPerson.changeHealth(this.intelligence, true);
		System.out.printf(
				"%s heals %s. %<s's health is increased by %s\n", 
				name, injuredPerson.getName(), this.intelligence
				);
	}
	
	//	Wizard: Add a method fireball(Human) that decreases the 
	//	other human's health by the wizard's intelligence * 3
	public void fireball(Human opponent) {
		opponent.changeHealth(this.intelligence*3, false);
		System.out.printf(
				"%s throws a fireball at %s. %<s's health is decrease by %s\n", 
				name, opponent.getName(), this.intelligence
				);
	}

}
