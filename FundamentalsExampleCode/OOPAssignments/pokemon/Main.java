package com.javastack.oop.pokemon;

public class Main {

	public static void main(String[] args) {
		// TODO instantiate pokemon, 
		Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass, Posion", 45);
		Pokemon squirtle = new Pokemon("Squirtle", "Water", 25);
		Pokemon eevee = new Pokemon("Eevee", "Normal");
		
		Pokedex pokedex = new Pokedex();
		pokedex.add(eevee);
		pokedex.add(squirtle);
		pokedex.add(bulbasaur);
		
		pokedex.listPokemon();
		
		// attack pokemon, and 
		bulbasaur.attackPokemon(eevee);
		squirtle.attackPokemon(eevee);
		
		
		// list pokemon from a pokedex.
		pokedex.listPokemon();

	}

}
