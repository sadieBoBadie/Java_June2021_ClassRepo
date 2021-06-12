package com.javastack.oop.objectmaster;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ninja ninja = new Ninja("Brendan");
		Wizard wizard = new Wizard("Lia");
		Samurai samurai = new Samurai("Sadie");
		Samurai samurai2 = new Samurai("George");
		Samurai samurai3 = new Samurai("Edward");
		Samurai samurai4 = new Samurai("Cody");
		
		ninja.displayStats();
		wizard.displayStats();
		ninja.attack(wizard);
		
		wizard.heal(wizard);
		wizard.fireball(ninja);
		
		wizard.displayStats();
		ninja.displayStats();
		
		ninja.steal(wizard);
		wizard.displayStats();
		ninja.displayStats();
		
		samurai.displayStats();
		samurai.deathBlow(ninja);
		samurai.meditate();
		samurai.displayStats();
		ninja.displayStats();
		Samurai.howManySamurai();
	}

}
