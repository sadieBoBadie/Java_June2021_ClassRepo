package com.javastack.oop.pokemon;

public class Pokemon {
	
	private String name;
	private String type;
	private int health;
	
	private static int count = 0;
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
	}
	
	public Pokemon(String name, String type) {
		this.name = name;
		this.type = type;
		this.health = 100;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	public int getHealth() {
		return health;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	
	public void setHealth(int health) {
		this.health = health;
		return;
	}
	public void setName(String name) {
		this.name = name;
		return;
	}
	public void setType(String type) {
		this.type = type;
		return;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	};
	
	
}
