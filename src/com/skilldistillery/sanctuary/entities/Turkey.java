package com.skilldistillery.sanctuary.entities;

public class Turkey extends Animal {

	private static String noise = "Gobble gobble";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
		
	}
	@Override
	public void eat(int amount) {
		System.out.println("Gobble gobble, I'm loving these " + amount + " acorns.");
		
	}
}
