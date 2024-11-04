package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Sanctuary;
import com.skilldistillery.sanctuary.entities.Animal;
//import com.skilldistillery.sanctuary.entities.Attendant;
//import com.skilldistillery.sanctuary.entities.Turkey;
//import com.skilldistillery.sanctuary.entities.Crow;
//import com.skilldistillery.sanctuary.entities.Horse;


public class AnimalSanctuaryApp {

//	Scanner kb = new Scanner(System.in);
//	private Sanctuary sanctuary;

	public static void main(String[] args) {
	
	AnimalSanctuaryApp app = new AnimalSanctuaryApp();
	app.launchApp();
	
	}
	
	private void launchApp() {
	Scanner kb = new Scanner(System.in);
	Sanctuary sanctuary = new Sanctuary();
	Animal newAnimal = new Animal();
	
	
	System.out.println("Hello! Welcome to the Animal Sanctuary!");
	printMenu();
	int choice = kb.nextInt();

	
	Boolean keepGoing = true;
	while (keepGoing) {
	switch (choice) {
	case 1:
		sanctuary.listAnimals(newAnimal);
		System.out.println();
		printMenu();
		choice = kb.nextInt();
		break;
	case 2:
		newAnimal = new Animal();
		System.out.println("Which sort of animal would you like to move into the sanctuary?");
		System.out.println("1. Turkey\n2. Crow\n3. Horse\n*Press 4 to return to Main Menu*");
		int addAnimal = kb.nextInt();
		if (addAnimal == 1) { 
			String newTurkey = "" + addAnimal;
			System.out.println("What is the animal's name?");
			String newAnimalName = kb.next();
			sanctuary.addAnimal(newAnimal);
			printMenu();
			choice = kb.nextInt();
		}
//		else if (addAnimal == 2) {
//			String newCrow = "" + newAnimal;
//			System.out.println("What is the animal's name?");
//			String newAnimalName = kb.next();
//			sanctuary.addAnimal(newAnimal);
//			printMenu();
//			choice = kb.nextInt();
//		}
//		else if (addAnimal == 3) {
//			String newHorse = "" + newAnimal;
//			System.out.println("What is the animal's name?");
//			String newAnimalName = kb.next();
//			sanctuary.addAnimal(newAnimal);
//			System.out.println();
//			printMenu();
//			choice =kb.nextInt();
//		}
//		else if (addAnimal == 4) {
//			printMenu();
//			choice = kb.nextInt();
//		}
		break;
	case 3:
		sanctuary.startAttendantRounds(); 
		keepGoing = false;
		printMenu();
		choice = kb.nextInt();
//		break;
	case 4:
		System.out.println("Thanks for stopping by! See ya next time!");
		keepGoing = false;
		break;
	default: 
		System.out.println("Ooops! Please type a number from 1 - 4 ");
		choice = kb.nextInt();
		break;
	}
		
	}
	kb.close();
	}

public static void printMenu() {
System.out.println("\n3What would you like to do?\n");
	
	System.out.println("********   Animal Sanctuary   ********");
	System.out.println("*** 1. List of current animals     ***");
	System.out.println("*** 2. Add a new animal            ***");
	System.out.println("*** 3. Have attendant feed animals ***");
	System.out.println("*** 4. Leave                       ***");
	System.out.println("**************************************");
	
	System.out.println("Please enter a number: ");
}
}		

		

