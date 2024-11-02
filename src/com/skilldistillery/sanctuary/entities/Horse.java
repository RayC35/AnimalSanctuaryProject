package com.skilldistillery.sanctuary.entities;

public class Horse extends Animal {
	
	private static String noise = "Neigh neigh";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("Neigh neigh, I'm munching " + amount + " apples");
	}

}
