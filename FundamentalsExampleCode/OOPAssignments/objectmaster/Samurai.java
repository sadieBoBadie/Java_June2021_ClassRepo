package com.javastack.oop.objectmaster;

public class Samurai extends Human {
	
	public static int samuraiTotal = 0;

	public Samurai(String name) {
		
		super(name);
		health = 200;
		samuraiTotal+= 1;
		// TODO Auto-generated constructor stub
	}
	
	
//	Samurai: Add a method howMany() that returns the total 
//	current number of Samurai.
	public static int howManySamurai() {
		System.out.printf("There are %s Samurai.", samuraiTotal);
		return samuraiTotal;
	}
	
//	Samurai: Add a method deathBlow(Human) that kills 
//	the other human, but reduces the Samurai's health by half
	public void deathBlow(Human opponent) {
		
		System.out.printf(
				"%1$s deals a death blow to %2$s and loses %3$s health points\n", 
				name, opponent.getName(), health/2
				);
		
		opponent.changeHealth(opponent.health, false);
		this.changeHealth((int)this.health/2, false);
		
	}

//	Samurai: Add a method meditate() that heals the Samurai 
//	for half of their current health.
	public void meditate() {
		System.out.printf(
				"%1$s meditates and gains %2$s health.\n", 
				name, health/2
				);
		this.changeHealth((int)this.health/2, true);
	}
	
}
