package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import animals.Animal;
import factory.AnimalFactory;
import factory.LinkedListFactory;
import factory.StaffFactory;
import staff.Manager;
//import staff.Nurse;
import staff.Receptionist;
import staff.Staff;
//import staff.TraineeVet;
//import staff.Veterinarian;

public class Helper {
	
	AnimalFactory animalFactory = new AnimalFactory();
	StaffFactory staffFactory = new StaffFactory();
	
	private List <Animal> animalList = new ArrayList<Animal>();
	private List<Staff> staffList = new ArrayList<Staff>();
	
	LinkedListFactory q1, q2, q3, q4, q5 ;
	
	//HashMap <String, LinkedListFactory> map;
	//ArrayList<String> vetList;
	
	//populating arrayList
	public Helper() {
		
		//Animal attributes
		int numAnimalType = 4;
		int numAnimal = 1000;
		int numCat = numAnimal/numAnimalType;
		int numDog = numAnimal/numAnimalType;
		int numGui = numAnimal/numAnimalType;
		int numPok = numAnimal/numAnimalType;
		
		
		//Staff attribute
		int numAdmStaff = 10;
		int numMedStaff = 20;
		int numStaff = numAdmStaff + numMedStaff;
		int numMan = numAdmStaff/2;
		int numRec = numAdmStaff - numMan;
		int numVet = 5;
		int numNur = 10;
		int numTra = numMedStaff - (numVet + numNur);
		
		//map = new HashMap <String, LinkedListFactory> ();
		//vetList = new ArrayList<String>();
		
		
		
		// ============= ANIMALS ===============
		
		//making 250 cats	
		for (int i = 0; i<numCat; i++) {
			animalList.add(animalFactory.getAnimalType("CAT"));
		}
		
		//making 250 dogs	
		for (int i = 0; i<numDog; i++) {
			animalList.add(animalFactory.getAnimalType("DOG"));		
		}
		
		//making 250 guineapig	
		for (int i = 0; i<numGui; i++) {
			animalList.add(animalFactory.getAnimalType("GUINEAPIG"));
		}
			
		//making 250 pokemon	
		for (int i = 0; i<numPok; i++) {
			animalList.add(animalFactory.getAnimalType("POKEMON"));	
		}
		
		
		// ============= STAFF ===============
		
		// ADM STAFF
		for(int i=0; i< numMan; i++) { // Manager
			staffList.add(staffFactory.getStaffType("Manager", i));	
		}
		
		for (int i= numMan; i< numAdmStaff; i++) { // Receptionist
			staffList.add(staffFactory.getStaffType("Receptionist", i));
		}
		
		// MED STAFF
		for (int i = 0; i< numVet; i++) { // Veterinarian
			staffList.add(staffFactory.getStaffType("Veterinarian", i));
		}
		 
		for (int i = 5; i<15; i++) { // Nurse
			staffList.add(staffFactory.getStaffType("Nurse", i));
		}
		
		for (int i = 15; i<30; i++) { // Trainee Vet
			staffList.add(staffFactory.getStaffType("TraineeVet", i));
		}
		
		
		// ============= QUEUE ===============
		
		// Q1
		q1 = new LinkedListFactory();
		for (int i = 0; i< 200; i++) {
			q1.add(animalList.get(i));			
		}
		
		// Q2
		q2 = new LinkedListFactory();
		for (int i = 200; i< 400; i++) {
			q2.add(animalList.get(i));		
		}
		
		// Q3
		q3 = new LinkedListFactory();
		for (int i = 400; i< 600; i++) {
			q3.add(animalList.get(i));	
		}
		
		// Q4
		q4 = new LinkedListFactory();
		for (int i = 600; i< 800; i++) {
			q4.add(animalList.get(i));	
		}
		
		//Q5
		q5 = new LinkedListFactory();
		for (int i = 800; i< 1000; i++) {
			q5.add(animalList.get(i));	
		}

		
	}
	
	
	// ============== BASIC FUNCTIONALITIES ================== //
		
		
	//List all Staff
	public void listAllStaff() {
		for (Staff staff: staffList) {
		System.out.println("Type: " + staff.identify());
		System.out.println("Name: " + staff.getName());
		System.out.println("ID: " + staff.getID());
		System.out.println("Salary: " + staff.getSalary());
		System.out.println();
		}
		 
	}
		
		//List staff by Category
	public void listStaffByCategory(String type) {
		for (Staff s: staffList) {
			if(s.getClass().getSimpleName().equalsIgnoreCase(type)){ // equals
				System.out.println("Type: " + s.getClass().getSimpleName() + "\nName: " + s.getName() + "\nID: " + s.getID());
				System.out.println();
					
			}

		}

	}
	
	// List all staff performing a certain task01
	public void performingTaskOne() { // redo this method...
		Manager man = new Manager();
		Receptionist recep = new Receptionist();
		for (Staff pt: staffList) {
			if(pt.getClass().getSimpleName().equalsIgnoreCase("Manager")){
				System.out.println("I'm " + pt.getName()+ ". " + man.doTask01());		
			} 
			else if (pt.getClass().getSimpleName().equalsIgnoreCase("Receptionist")){
				System.out.println("I'm " + pt.getName()+ ". " + recep.doTask01());	
				
			}
		}
		
	}
	
	// List all staff performing a certain task02
	public void performingTaskTwo() { // redo this method...
		Manager man = new Manager();
		Receptionist recep = new Receptionist();
		for (Staff pt: staffList) {
			if(pt.getClass().getSimpleName().equalsIgnoreCase("Manager")){
				System.out.println("I'm " + pt.getName()+ ". " + man.doTask02());		
			} 
			else if (pt.getClass().getSimpleName().equalsIgnoreCase("Receptionist")){
				System.out.println("I'm " + pt.getName()+ ". " + recep.doTask02());	
				
			}
		}
		
	}
	
	public void listStaffNames() {
		System.out.println("Staff List: \n");
		for (int i = 0; i< staffList.size(); i++) {
			System.out.println(staffList.get(i).getName());
		}
	
	}
	
	
	// Search for a specific member of staff by name
	public Collection<Staff> searchStaffName(String keyword){
		ArrayList <Staff> staff = new ArrayList<Staff>();
		ListIterator<Staff> iter = staffList.listIterator();
		while (iter.hasNext()) {
			Staff newStaff = iter.next();
			String name = newStaff.getName();
			if(name.equalsIgnoreCase(keyword)) {
				staff.add(newStaff);
			}
		}
		return staff;
	}
		
		
		
		
	//List all animals 			
	public void printAllAnimals() {
		for (Animal a: animalList) {
			System.out.println("Type: " + a.identify());
			System.out.println("Name: " + a.getName());
			System.out.println("Age: " + a.getAge());
			System.out.println("Illness: " +a.getMedCondition());
			System.out.println();
		}
	}
	
	public void listAllAnimalNames() {
		System.out.println("\nBelow all the animals in our system");
		for(Animal a: animalList) {
			System.out.println(a.getName());
		}
	}
	
	//Listing animals by category
	public void listAnimalsByType(String type) {
		for (Animal a: animalList) {
			if(a.getClass().getSimpleName().equalsIgnoreCase(type)){ // equals
				System.out.println("Type: " + a.getClass().getSimpleName() + "\nName: " + a.getName() + "\nAge: " + a.getAge() + "\nIllness: " + a.getMedCondition());
				System.out.println();
				
			}

		}

	}
	
	
	// Search animals by name
	public Collection<Animal> findName(String keyword){
		ArrayList <Animal> animalName = new ArrayList<Animal>();
		ListIterator<Animal> iter = animalList.listIterator();
		while (iter.hasNext()) {
			Animal newAnimal = iter.next();
			String name = newAnimal.getName();
			if(name.equalsIgnoreCase(keyword)) {
				animalName.add(newAnimal);
			}
		}
		return animalName;
	}
	
	
	
	
	// ============== ADDITIONAL FUNCTIONALITIES ================== //
	
	
	// creating a queue for each Veterinarian
	public void leeshaQueue() {
		
		// defining a HashMap
		HashMap <String, LinkedListFactory> map = new HashMap <String, LinkedListFactory> ();
		
		// populating an ArrayList with the name of the vet
		ArrayList<String> vetList = new ArrayList<String>();
		for (int i =0; i< staffList.size(); i++) {
			if(staffList.get(i).getClass().getSimpleName().equalsIgnoreCase("veterinarian")) {
				vetList.add(staffList.get(i).getName());
		
			}
		}
		
		ArrayList<LinkedListFactory> a = new ArrayList<LinkedListFactory>();
		a.add(q1);
		a.add(q2);
		a.add(q3);
		a.add(q4);
		a.add(q5);		
	
		
		// Assigning a queue for each Veterinarian
		for (int i=0; i< vetList.size(); i++) {
			map.put(vetList.get(i), a.get(i));
			
		}
		
		// printing the Veterinarian
		System.out.println("List of Veterinarian");
		for (int i =0; i<vetList.size();i++) {
			System.out.println((i+1) + " - " + vetList.get(i));
		}
		
		
		
		// Getting input from the user
		BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
		int userInput = -1;
		
		while (userInput < 1 || userInput>5) {
		try {
			System.out.println("Press a number between 1-5");
			userInput = Integer.parseInt(myInput.readLine());
			
			// reprinting options
			System.out.println("List of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		} catch (Exception e) {
			System.out.println("Please type a valid name");
			
			// reprinting Veterinarian options
			System.out.println("List of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		
		}
		
		
		switch(userInput) {
		
		case 1:
			System.out.println("\nList of animals assigned to the chosen Veterinarian ");
			System.out.println(map.get(vetList.get(0)));
			break;
			
		case 2:
			System.out.println("\nList of animals assigned to the chosen Veterinarian ");
			System.out.println(map.get(vetList.get(1)));
			break;
			
		case 3:
			System.out.println("\nList of animals assigned to the chosen Veterinarian ");
			System.out.println(map.get(vetList.get(2)));
			break;
			
		case 4:
			System.out.println("\nList of animals assigned to the chosen Veterinarian ");
			System.out.println(map.get(vetList.get(3)));
			break;
			
		case 5:
			System.out.println("\nList of animals assigned to the chosen Veterinarian ");
			System.out.println(map.get(vetList.get(4)));
			break;
			
		default:
				System.out.println("ERROR! please type a valid number");
		}
			
		
		}	
	
	}


	public void listOrder() {
		
		HashMap <String, LinkedListFactory> map = new HashMap <String, LinkedListFactory> ();
		
		// populating an ArrayList with the name of the vet
		ArrayList<String> vetList = new ArrayList<String>();
		for (int i =0; i< staffList.size(); i++) {
			if(staffList.get(i).getClass().getSimpleName().equalsIgnoreCase("veterinarian")) {
				vetList.add(staffList.get(i).getName());
		
			}
		}
		
		ArrayList<LinkedListFactory> a = new ArrayList<LinkedListFactory>();
		a.add(q1);
		a.add(q2);
		a.add(q3);
		a.add(q4);
		a.add(q5);		
	
		
		// Assigning a queue for each Veterinarian
		for (int i=0; i< vetList.size(); i++) {
			map.put(vetList.get(i), a.get(i));
			
		}
		
		// printing the Veterinarian
		System.out.println("List of Veterinarian");
		for (int i =0; i<vetList.size();i++) {
			System.out.println((i+1) + " - " + vetList.get(i));
		}
		
		
		
		// Getting input from the user
		BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
		int userInput = -1;
		
		while (userInput < 1 || userInput>5) {
		try {
			System.out.println("Press a number between 1-5");
			userInput = Integer.parseInt(myInput.readLine());
			
			// reprinting options
			System.out.println("List of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		} catch (Exception e) {
			System.out.println("Please type a valid name");
			
			// reprinting Veterinarian options
			System.out.println("List of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		
		}
		
		switch(userInput) {
		
		case 1:
			System.out.println("\nAnimal by order ");
			for (int i = 0; i< q1.getCount(); i++) {
				System.out.println((i + 1) + " " + q1.findAnimalbyPosition(i));
			}
			break;
			
		case 2:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q2.getCount(); i++) {
				System.out.println((i + 1) + " " + q2.findAnimalbyPosition(i));
			}
			break;
			
		case 3:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q3.getCount(); i++) {
				System.out.println((i + 1) + " " + q3.findAnimalbyPosition(i));
			}
			break;
			
		case 4:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q4.getCount(); i++) {
				System.out.println((i + 1) + " " + q4.findAnimalbyPosition(i));
			}
			break;
			
		case 5:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q5.getCount(); i++) {
				System.out.println((i + 1) + " " + q5.findAnimalbyPosition(i));
			}
			break;
			
		default:
				System.out.println("ERROR! please type a valid number");
		}
			
		
		}
		}


	public void nextPet() {
		
HashMap <String, LinkedListFactory> map = new HashMap <String, LinkedListFactory> ();
		
		// populating an ArrayList with the name of the vet
		ArrayList<String> vetList = new ArrayList<String>();
		for (int i =0; i< staffList.size(); i++) {
			if(staffList.get(i).getClass().getSimpleName().equalsIgnoreCase("veterinarian")) {
				vetList.add(staffList.get(i).getName());
		
			}
		}
		
		ArrayList<LinkedListFactory> a = new ArrayList<LinkedListFactory>();
		a.add(q1);
		a.add(q2);
		a.add(q3);
		a.add(q4);
		a.add(q5);		
	
		
		// Assigning a queue for each Veterinarian
		for (int i=0; i< vetList.size(); i++) {
			map.put(vetList.get(i), a.get(i));
			
		}
		
		// printing the Veterinarian
		System.out.println("List of Veterinarian");
		for (int i =0; i<vetList.size();i++) {
			System.out.println((i+1) + " - " + vetList.get(i));
		}
		
		
		
		// Getting input from the user
		BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
		int userInput = -1;
		
		while (userInput < 1 || userInput>5) {
		try {
			System.out.println("Press a number between 1-5");
			userInput = Integer.parseInt(myInput.readLine());
			
			// reprinting options
			System.out.println("List of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		} catch (Exception e) {
			System.out.println("Please type a valid name");
			
			// reprinting Veterinarian options
			System.out.println("List of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		
		}
		
		switch(userInput) {
		
		case 1:
			System.out.println("\nAnimal being treated by the Veterinarian ");
			System.out.println(q1.removeFirst());
			System.out.println("\nNext animal ");
			System.out.println(q1.removeFirst());
			break;
			
		case 2:
			System.out.println("\nAnimal being treated by the Veterinarian ");
			System.out.println(q2.removeFirst());
			System.out.println("\nNext animal ");
			System.out.println(q2.removeFirst());
			break;
			
		case 3:
			System.out.println("\nAnimal being treated by the Veterinarian ");
			System.out.println(q3.removeFirst());
			System.out.println("\nNext animal ");
			System.out.println(q3.removeFirst());
			break;
			
		case 4:
			System.out.println("\nAnimal being treated by the Veterinarian ");
			System.out.println(q4.removeFirst());
			System.out.println("\nNext animal ");
			System.out.println(q4.removeFirst());
			break;
			
		case 5:
			System.out.println("\nAnimal being treated by the Veterinarian ");
			System.out.println(q5.removeFirst());
			System.out.println("\nNext animal ");
			System.out.println(q5.removeFirst());
			//q5.getClass().gets
			break;
			
		default:
				System.out.println("ERROR! please type a valid number");
		}
			
		
		}
		
		
	}	
	
		
	}
	
	
	// ================= DRAFT ZONE ====================
	//System.out.println(vetList);
			/*
			System.out.println("Type the name of the vet");
			
			BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
			String userInput = "";
			try {
				userInput = myInput.readLine();
			} catch (IOException e) {
				System.out.println("Please type a valid name");
			}
			
			//if(map.containsKey(userInput)){
				
				//if(map.con)
			String key = userInput;
			boolean isPresent = map.containsKey(key);
			
			if(isPresent== true) {
				System.out.println(map.get(key));
			}
			else {
				System.out.println("no");
			}
			
			/*
			for (String i: map.keySet()) {
				if(userInput.equalsIgnoreCase(i)) {
				//if(map.containsKey(userInput)){
					//System.out.println(map.get(i));
				}
				
				*/
				
			
			
		// HashMap<Staff, Queue> map = new LinkedHashMap<Staff, Queue>();
		// ArrayList<Queue<Animal>> queueArray = new ArrayList<Queue<Animal>>();	
			
			//if(map.containsKey(userInput){
			//	System.out.println(q);
			
	
	/**
	public Collection<Animal> searchName(String keyword) {
		ArrayList<Animal> foundAnimal = new ArrayList<Animal>();
		for (int i = 0; i < animalList.size(); i++ ) {
			if(animalList.get(i).getName().equalsIgnoreCase(keyword)) {
				Animal animal = animalList.get(i);
				foundAnimal.add(animal);
			}
		}
		return foundAnimal;
	}
	*/
	
	
	
	
	/*
	public String searchAnimal (String keyword, List<Animal>pool) {
		for(int i=0; i< pool.size();i++){
			if(pool.get(i).getName().equalsIgnoreCase(keyword)) {
				return pool.get(i).getName();
			}
		}
		return null;
	}
	*/
	
	
	/**
	public String searchAnimalByName(String target, List<Animal> pool) {
		boolean found = false;
		int i = 0;
		do {
			if(pool.get(i).getName() == target) {
				found = true;
				return "Name: ";// + pool.get(i).getName() + pool.get(i).getAge()+ pool.get(i).getMedCondition();
			}
			i++;
		}while (!found && i < pool.size());
		return null;
						
		
	}
	*/
	
	
	/*
	public void printAllDogs() {
		for (Animal pAD: animalList) {
			if(pAD.getClass().getSimpleName().equalsIgnoreCase("dog")){
				System.out.println(pAD.getName() + " " + pAD.getClass().getSimpleName());	
				
			}

		}

	}
	
	public void printAllGP() {
		for (Animal pAGP: animalList) {
			if(pAGP.getClass().getSimpleName().equalsIgnoreCase("guineapig")){
				System.out.println(pAGP.getName() + " " + pAGP.getClass().getSimpleName());	
				
			}

		}

	}
	
	public void printAllPokemon() {
		for (Animal pAP: animalList) {
			if(pAP.getClass().getSimpleName().equalsIgnoreCase("pokemon")){
				System.out.println(pAP.getName() + " " + pAP.getClass().getSimpleName());	
				
			}

		}

	}
	*/
	
	/**
	// Manager
	for (int i =0; i< 5; i++) {		
		//String name = staffFactory.getRandomName();
		//double salary = staffFactory.getMgrSalary();
		//String ID = staffFactory.getID("adm", admID);
		//staffList.add(new Manager (name, ID, salary));
		staffList.add(new Manager(staffFactory.getRandomName(), staffFactory.getID("adm", mgrID), staffFactory.getMgrSalary()));
		mgrID++;
	}
	
	// Receptionist
	for (int i =0; i<5; i++) {
		staffList.add(new Receptionist(staffFactory.getRandomName(), staffFactory.getID("adm", recID), staffFactory.getRecepSalary()));
		recID++;
	}
	
	// Veterinarian
	for (int i = 0; i< 5; i++) {
		staffList.add(new Veterinarian(staffFactory.getRandomName(), staffFactory.getID("med", vetID), staffFactory.getVetSalary()));
		vetID++;
	}
	
	// Nurse
	for (int i = 0; i< 5; i++) {
		staffList.add(new Nurse(staffFactory.getRandomName(), staffFactory.getID("med", nurID), staffFactory.getNurseSalary()));
		nurID++;
	}

	// Trainee Vet
	for (int i = 0; i< 5; i++) {
		staffList.add(new TraineeVet(staffFactory.getRandomName(), staffFactory.getID("med", traID), staffFactory.getTraineeSalary()));
		traID++;
	}	
	*/	
	
	/*
	public int searchAnimalByName(String target, List<Animal> pool) {
		boolean found = false;
		int i = 0;
		do {
			if(pool.get(i).getName().equals(target)) {
				found = true;
				return i; //"Name: ";// + pool.get(i).getName() + pool.get(i).getAge()+ pool.get(i).getMedCondition();
			}
			i++;
		}while (!found && i < pool.size());
		return -1;
	}
	*/

