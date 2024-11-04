package com.skilldistillery.sanctuary.entities;

public class Sanctuary {

	private Animal[] animals = new Animal[5];
	
	
	private Attendant attendant = new Attendant();

	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
	public void listAnimals(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animal.getName());
			}
			else {
				System.out.println("This enclosure is empty.");
			}
		}
	}
	
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				break;
			}
			else {
				System.out.println("Sorry, the sanctuary is full");
			}
		}
	}
	
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}
	public void listAnimals() {
		
	}
}
