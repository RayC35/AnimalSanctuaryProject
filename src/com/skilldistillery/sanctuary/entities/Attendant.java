package com.skilldistillery.sanctuary.entities;

public class Attendant extends Sanctuary {
	
	public void makeRounds(Animal[] animals) {

//	String Animal[] = new String[4];
//	Animal[0] = " ";
//	Animal[1] = " ";
//	Animal[2] = " ";
//	Animal[3] = null;
//	String Animal[] = {"Turkey", "Crow", "Horse", "null"};
	

	System.out.println("Time to feed the animals");

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

		


