package com.skilldistillery.sanctuary.entities;

public class Animal extends Sanctuary {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public void makeNoise() {
	}
	public void eat(int amount) {
		System.out.println("I'm eating " + amount + " foods");
	}
	

}
