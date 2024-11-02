package com.skilldistillery.sanctuary.entities;

public class Crow extends Animal {
	
	private static String noise = "Caw-caw, caw-caw!";
			
	@Override		
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		System.out.println("Caw-caw, caw-caw! I'm grubbing on " + amount + " grubworms");
		
	}

}
