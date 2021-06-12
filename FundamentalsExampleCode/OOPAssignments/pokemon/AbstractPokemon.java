package com.javastack.oop.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		
		return String.format(
				"Name: %s\nHealth: %s\nType: %s\n\n", 
				pokemon.getName(), 
				pokemon.getHealth(),
				pokemon.getType()
				);
	}

}
