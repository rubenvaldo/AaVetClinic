package user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import animals.Animal;
import factory.AnimalFactory;
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
		ArrayList <Staff> staffName = new ArrayList<Staff>();
		ListIterator<Staff> iter = staffList.listIterator();
		while (iter.hasNext()) {
			Staff newStaff = iter.next();
			String name = newStaff.getName();
			if(name.equalsIgnoreCase(keyword)) {
				staffName.add(newStaff);
			}
		}
		return staffName;
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
	
	
	
	// ================= DRAFT ZONE ====================
	
	
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
}
