package com.skilldistillery.sanctuary.entities;

public class Attendant {
	
	public void makeRounds(Animal[] animals) {


	System.out.println("\nTime to feed the animals!");

	for(int i = 0; i < animals.length; i++) {
		Animal a = animals[i];
		if (a != null) {
			System.out.println("I'll feed " + i + " 10 foods." );
			a.eat(10);
		}
		else if (a == null) {
			System.out.println("This enclosure is empty, on to the next one.");
		}
	}
		System.out.println("Everyone's fed now, time for a break.");
	
	}
}

		


