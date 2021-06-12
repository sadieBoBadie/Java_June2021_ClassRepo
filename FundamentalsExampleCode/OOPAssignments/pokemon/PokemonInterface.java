package com.javastack.oop.pokemon;

public interface PokemonInterface {
	
	// Creates and returns a Pokemon.
	public Pokemon createPokemon(String name, String type, int health);
	
	// Returns a String with the name, health, and type of the pokemon.
	public String pokemonInfo(Pokemon pokemon);
	
	// List all the pokemon names that you have in your pokedex.
	public void listPokemon();
	
}
