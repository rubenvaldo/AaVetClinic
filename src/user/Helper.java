package user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import animals.Animal;
import factory.AnimalFactory;
import factory.LinkedListFactory;
import factory.StaffFactory;
import staff.Manager;
import staff.Receptionist;
import staff.Staff;


public class Helper {
	
	AnimalFactory animalFactory = new AnimalFactory(); //calling the animal factory class
	StaffFactory staffFactory = new StaffFactory();    // likewise for staff
	
	private List <Animal> animalList = new ArrayList<Animal>(); // saving animals in memory
	private List<Staff> staffList = new ArrayList<Staff>(); // saving staff in memory
	
	private LinkedListFactory q1, q2, q3, q4, q5 ; // using LinkedList for queue
	
	
	
	//populating arrayList
	public Helper() {
		
		//Animal attributes
		int numAnimalType = 4;
		int numAnimal = 1000;
		int numCat = numAnimal/numAnimalType;
		int numDog = numAnimal/numAnimalType;
		int numGui = numAnimal/numAnimalType;
		int numPok = numAnimal/numAnimalType;
			
		
		//  start     x    final  ID   (used for creating the required amount of staff per type) 
		int iMan = 0; int lMan = 5;
		int iRec = 5; int lRec = 10;
		int iVet = 0; int lVet = 5;
		int iNur = 5; int lNur = 15;
		int iTra = 15; int lTra = 30;
			
		
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
		for(int i= iMan; i< lMan; i++) { // Manager
			staffList.add(staffFactory.getStaffType("Manager", i));	
		}
		
		for (int i= iRec; i< lRec; i++) { // Receptionist
			staffList.add(staffFactory.getStaffType("Receptionist", i));
		}
		
		// MED STAFF
		for (int i = iVet; i< lVet; i++) { // Veterinarian
			staffList.add(staffFactory.getStaffType("Veterinarian", i));
		}
		 
		for (int i = iNur; i< lNur; i++) { // Nurse
			staffList.add(staffFactory.getStaffType("Nurse", i));
		}
		
		for (int i = iTra; i< lTra; i++) { // Trainee Vet
			staffList.add(staffFactory.getStaffType("TraineeVet", i));
		}
		
		
		// ============= QUEUE ===============
		
		// 5 queue - each with 200 animals
		
		// Q1
		q1 = new LinkedListFactory();
		for (int i = 0; i< 200; i++) { // 200 animals per queue
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
	
	
	
	public void performTask(String task) { 
		Manager man = new Manager(); // invoking the Manager Class to implement Tasks interface
		Receptionist recep = new Receptionist(); //Likewise for the Receptionist Class 
		
		if(task.equals("one")) {
		for (Staff pt: staffList) {
			if(pt.getClass().getSimpleName().equalsIgnoreCase("Manager")){
				System.out.println("Hi! My name is " + pt.getName()+ ". I'm a Manager " + man.doTask01());		
			} 
			else if (pt.getClass().getSimpleName().equalsIgnoreCase("Receptionist")){
				System.out.println("Hi! My name is " + pt.getName()+ ". I'm a Receptionist " + recep.doTask01());	
				
			}
		}
		
		}
		else if (task.equals("two")){
			for (Staff pt: staffList) {
				if(pt.getClass().getSimpleName().equalsIgnoreCase("Manager")){
					System.out.println("Hi! I'm a manager. My name is " + pt.getName()+ ". " + man.doTask02());		
				} 
				else if (pt.getClass().getSimpleName().equalsIgnoreCase("Receptionist")){
					System.out.println("Hi! I'm a receptionist. My name is " + pt.getName()+ ". " + recep.doTask02());	
					
				}
			}
			
		}
		
			
		}
	
	
	
	public void listStaffNames() {
		
		Set<String> staffName = new HashSet<String>(); // Since I want to print the names to user (without duplicates)
		
		for(Staff s: staffList) {
			staffName.add(s.getName());	// putting them into the staffName Set Collection	
		}
		
		System.out.println("\nStaff list names:\n");
		Iterator<String> itr = staffName.iterator(); // iterating through the collection
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
	
	
	// Search for a specific member of staff by name
	public Collection<Staff> searchStaffName(String keyword){
		ArrayList <Staff> staff = new ArrayList<Staff>(); // ArrayList to save the staff that will match with the name chosen by the user 
		ListIterator<Staff> iter = staffList.listIterator(); 
		while (iter.hasNext()) {
			Staff newStaff = iter.next();
			String name = newStaff.getName();
			if(name.equalsIgnoreCase(keyword)) { //checking condition
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
	
		Set<String> animalName = new HashSet<String>(); // Since I want to print the names to user (without duplicates)
														// I had initially printed the names off the arrayList
		
		// getting the names from the arrayList
		for(Animal a: animalList) {
			animalName.add(a.getName());	// putting them into the animalName Set Collection	
		}
		
		System.out.println("\nAnimal list names\n");
		Iterator<String> itr = animalName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	//Listing animals by category
	public void listAnimalsByType(String type) {
		for (Animal a: animalList) {
			if(a.getClass().getSimpleName().equalsIgnoreCase(type)){ 
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
	
	// Due to brain fatigue, unfortunately I haven't managed to avoid code repetition for the additional functionality  
	
	// creating a queue for each Veterinarian
	public void leeshaQueue() {
		
		// declaring and instantiating a HashMap (key, value)
		HashMap <String, LinkedListFactory> map = new HashMap <String, LinkedListFactory> ();
		
		// populating an ArrayList with the name of the vet
		ArrayList<String> vetList = new ArrayList<String>();
		for (int i =0; i< staffList.size(); i++) {
			if(staffList.get(i).getClass().getSimpleName().equalsIgnoreCase("veterinarian")) {
				vetList.add(staffList.get(i).getName());
		
			}
		}
		
		// putting the queues into an arrayList 
		ArrayList<LinkedListFactory> a = new ArrayList<LinkedListFactory>();
		a.add(q1);
		a.add(q2);
		a.add(q3);
		a.add(q4);
		a.add(q5);		
	
		
		// Assigning a queue for each Veterinarian
		for (int i=0; i< vetList.size(); i++) {
			map.put(vetList.get(i), a.get(i)); // using the put method
			
		}
		
		// printing the Veterinarian
		System.out.println("\nList of Veterinarian");
		for (int i =0; i<vetList.size();i++) {
			System.out.println((i+1) + " - " + vetList.get(i));
		}
		
		
		
		// Getting input from the user
		BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
		int userInput = -1;
		
		while (userInput < 1 || userInput>5) {
		try {
			System.out.println("\nPress a number between 1-5");
			userInput = Integer.parseInt(myInput.readLine());
			
			// reprinting options
			System.out.println("\nList of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		} catch (Exception e) {
			System.out.println("Please type a valid number");
			
			// reprinting Veterinarian options
			System.out.println("\nList of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
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
		System.out.println("\nList of Veterinarian");
		for (int i =0; i<vetList.size();i++) {
			System.out.println((i+1) + " - " + vetList.get(i));
		}
		
		
		
		// Getting input from the user
		BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
		int userInput = -1;
		
		while (userInput < 1 || userInput>5) {
		try {
			System.out.println("\nPress a number between 1-5");
			userInput = Integer.parseInt(myInput.readLine());
			
			// reprinting options
			System.out.println("\nList of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		} catch (Exception e) {
			System.out.println("Please type a valid number");
			
			// reprinting Veterinarian options
			System.out.println("\nList of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		
		}
		
		}
		
		switch(userInput) {
		
		case 1:
			System.out.println("\nAnimal by order ");
			for (int i = 0; i< q1.getCount(); i++) {
				System.out.println("\nPosition in the queue: " + (i + 1) + q1.findAnimalbyPosition(i));
			}
			break;
			
		case 2:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q2.getCount(); i++) {
				System.out.println("\nPosition in the queue: " + (i + 1) + q2.findAnimalbyPosition(i));
			}
			break;
			
		case 3:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q3.getCount(); i++) {
				System.out.println("\nPosition in the queue: " + (i + 1) + q3.findAnimalbyPosition(i));
			}
			break;
			
		case 4:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q4.getCount(); i++) {
				System.out.println("\nPosition in the queue: " + (i + 1) + q4.findAnimalbyPosition(i));
			}
			break;
			
		case 5:
			System.out.println("\nAnimal by order");
			for (int i = 0; i< q5.getCount(); i++) {
				System.out.println("\nPosition in the queue: " + (i + 1) + q5.findAnimalbyPosition(i));
			}
			break;
			
		default:
				System.out.println("ERROR! please type a valid number");
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
		System.out.println("\nList of Veterinarian");
		for (int i =0; i<vetList.size();i++) {
			System.out.println((i+1) + " - " + vetList.get(i));
		}
		
		
		
		// Getting input from the user
		BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
		int userInput = -1;
		
		while (userInput < 1 || userInput>5) {
		try {
			System.out.println("\nPress a number between 1-5");
			userInput = Integer.parseInt(myInput.readLine());
			
			// reprinting options
			System.out.println("\nList of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		} catch (Exception e) {
			System.out.println("Please type a valid name");
			
			// reprinting Veterinarian options
			System.out.println("\nList of Veterinarian");
			for (int i =0; i<vetList.size();i++) {
				System.out.println((i+1) + " - " + vetList.get(i));
			}
		}
		
		}
		
		 
		switch(userInput) {
		
		case 1:
			System.out.println("\nAnimal being treated by the Veterinarian ");
			System.out.println(q1.removeFirst()); // remove the first animal from the queue. 
												  //Here, I'm assuming that it's the current animal being seeing by a vet 
			System.out.println("\nNext animal ");
			System.out.println(q1.removeFirst()); //  next animal to be seen by a doctor
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
	
	