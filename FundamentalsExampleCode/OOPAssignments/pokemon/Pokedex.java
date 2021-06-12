package com.javastack.oop.pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {

	private ArrayList<Pokemon> myPokemons;
	
	public Pokedex() {
		// TODO Auto-generated constructor stub
		myPokemons = new ArrayList<Pokemon>();	
	}
	public Pokedex(ArrayList<Pokemon> pokeList) {
		// TODO Auto-generated constructor stub
		myPokemons = pokeList;	
	}

	@Override
	public void listPokemon() {
		//List all the pokemon names that you have in your pokedex.
		for (Pokemon pokemon : myPokemons) {
			System.out.println(pokemonInfo(pokemon));
		}
		System.out.println("=========================");
	}
	public void add(Pokemon pokemon) {
		myPokemons.add(pokemon);
	}

}
