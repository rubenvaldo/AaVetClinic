package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import animals.Animal;
import staff.Staff;


/*
 * SYSTEM HAS TO
 	- Assign each animal to a member of med staff (MedStaff -> Animal)
 	- A member of staff treats more than one animal (order/queue)
 	- Assign a task to each staff	
 * 
 BASIC FUNCTIONALITY (Required to achieve a pass / merit)
	- List all staff
	- List staff by categories (e.g. list all Nurses)
	- List all Admin staff performing a certain task
	- Search for a specific member of staff by name
	- List all animals
	- List animals by various types (e.g. list all dogs)
	- Search for a specific animal by name
ADDITIONAL FUNCTIONALITY (Required to achieve a Distinction)
	- List all the animals assigned to a member of medical staff
	- List the order in which pets will be looked after by a particular member of the medical
	staff
	- For a given member of the medical staff, pass to the next pet.
 */



public class CLI {
	
	// to consume input from the keyboard
	BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));

	boolean exit; // to exit the system
	Helper h = new Helper(); // calling the Helper Class
	
	
	public CLI() {
		displayMainMenu(); // first thing to be seen by the user
						   // the Main Menu will call all the operations for this project
	}
	
	
public void displayMainMenu() {
	
	printHeader(); // printing the header
	while(!exit) {
		printMainMenu();
		int choice = getUserInput(); // getting input from the user
		performAction(choice); // passing the user input onto the switch statements
	}
}
	
	private void printHeader() { // Introduction message
		System.out.println("+---------------------------------------+");
		System.out.println("|       Welcome to the VetClinic        |");
		System.out.println("|            Menu Application           |");
		System.out.println("+---------------------------------------+");
		
	}
	
	private void printMainMenu() { // I've decide to split up the two types of functionalities, even though Amilcar has said it was not necessary =]
		
		System.out.println("\nPlease, choose an option from the list below");
		System.out.println("1 - Basic Funcionalities");
		System.out.println("2 - Additional Functionalities");
		System.out.println("0 - Exit");
		
	}
	
	private int getUserInput() { // getting input from the user
		
		int userInput = -1 ;
		
		while (userInput < 0 || userInput > 2) {
			try {
				System.out.print("\nPlease type a valid a number ");
				userInput = Integer.parseInt(myInput.readLine());
				
			} catch (Exception e) {
				System.out.print("\nInvalid selection. Please try again");
			}	
		}
		
		return userInput;
	}
	
	private void performAction(int choice) {
		
		switch(choice) {
		
		case 0:
			exit = true;
			System.out.println("\nThanks for using our system!!! \nGood Bye!!!");
			break;
		
		case 1:
			displayBasicFuncionalities();
			break;
			
		case 2:
			displayAddFunctionalities();
			break;
			
		default:
			System.out.println("\nAn unknown error has occurred. Please try again!"); // it will never be checked because of the while loop
			
	}
		
	


}

	private void displayBasicFuncionalities() {
		
		while(!exit) {
			printBasicMenu();
			int choice = getUserBasicInput();
			performBasicAction(choice);
		
		}
	}
		
		private void performBasicAction(int choice) {
			
			switch(choice) {
			
			case 0:
				exit = true;
				System.out.println("\nThanks for using our system!!! \nGood Bye!!!");
				break;
				
			case 1:
				h.listAllStaff(); // List all staff
				break;
				
			case 2:
				displayCategoryMenu(); // List staff by categories (e.g. list all Nurses)
				break;
				
			case 3:
				displayTaskMenu(); // it will display a menu for the << List all Admin staff performing a certain task
				break;
				
			case 4:
				h.listStaffNames(); // List all staff names
				System.out.println("\nPlease type the name of the employee you'd like to search for\n");
				
				String userInput = "";
				try {
					userInput = myInput.readLine();
				} catch (IOException e) {
					System.out.println("Please type a valid name");
				}
				
				int staffCount = 0; // starting in ZERO. It will count how many staff will be found
				
				for (Staff staff: h.searchStaffName(userInput)) {
						System.out.println("\nType: " + staff.getClass().getSimpleName() + "\nName: " + staff.getName() + "\nID: " + staff.getID() + "\nSalary: " + staff.getSalary());
			
					staffCount++; // incrementing inside the for loop
				}
				System.out.println("\n" + staffCount + " result(s) have been found!!!");
				
				break;
				
			case 5:
				h.printAllAnimals(); // List all animals
				break;
				
			case 6:
				displayATMenu(); // List animals by various types (e.g. list all dogs)
				break;
				
			case 7:
				h.listAllAnimalNames(); // List all animal names (non duplicate names)
				System.out.println("\nPlease type the name of the animal you'd like to search for\n");
				
				String userInput2 = "";
				try {
					userInput2 = myInput.readLine();
				} catch (IOException e) {
					System.out.println("Please type a valid name");
				}
				
				
				int animalCount = 0; // same logic as for staff count
				for (Animal a: h.findName(userInput2)) {
						System.out.println("\nType: " + a.getClass().getSimpleName() + "\nName: " + a.getName() + "\nAge: " + a.getAge() + "\nIllness: " + a.getMedCondition());
					animalCount++;
				}
						System.out.println("\n" +animalCount + " result(s) have been found!!!");
					
				
				break;
				
			case 8:
				displayMainMenu(); // display main menu
				break;
				
			default:
				System.out.println("\nAn unknown error has occurred\n");
			
			}		
		
	}
		
	private void displayATMenu() { // Menu animal type menu
		while(!exit) {
			printATMenu();
			int choice = getUserBasicInput();
			performATAction(choice);
		
		}
			
			
		}

	private void performATAction(int choice) { // consume input from the user passing onto the switch statement
		
		switch(choice) {
		case 0:
			exit = true;
			System.out.println("\nThanks for using our system!!\nGood bye!!!");
			break;
		
		case 1:
			h.listAnimalsByType("cat"); // cat type
			break;
			
		case 2:
			h.listAnimalsByType("dog"); // dog type and so on...
			break;
			
		case 3:
			h.listAnimalsByType("guineapig");
			break;
			
		case 4:
			h.listAnimalsByType("pokemon");
			break;
			
		case 5: 
			displayBasicFuncionalities(); // basic functionality menu
			break;
			
		default:
			System.out.println("\nAn unknown error has occurred\n");	
			
		}
		
	}

	private void printATMenu() { // animal type menu
		
		System.out.println("\nChoose the type of animal");
		System.out.println(" 1 - Cat");
		System.out.println(" 2 - Dog");
		System.out.println(" 3 - Guinea Pig");
		System.out.println(" 4 - Pokemon");
		System.out.println(" 5 - Back to Basic Menu");
		System.out.println(" 0 - Exit");
		
	}

	private void displayTaskMenu() { // displays task menu
		while(!exit) {
			printTaskMenu();
			int choice = getUserBasicInput();
			performTaskAction(choice);
		
		}
			
		}

	private void performTaskAction(int choice) {
		
		switch (choice) {
		case 0:
			exit = true;
			System.out.println("\nThanks for using our system");
			break;
			
		case 1:
			h.performTask("one"); //passes one as a parameter
			break;
			
		case 2:
			h.performTask("two"); // passes two as a parameter
			break;
			
		case 3:
			displayBasicFuncionalities();
			break;
			
		default:
			System.out.println("\nAn unknown error has occurred\n");
			
		}
	}

	private void printTaskMenu() { // prints the task menu to the user
		System.out.println("\nWelcome to the adm Task Menu. Manager and Receptionist perform different tasks");
		System.out.println(" 1 - for Task one");
		System.out.println(" 2 - for Task two");
		System.out.println(" 3 - Back to Basic Menu");
		System.out.println(" 0 - Exit");
		
		
	}

	private void displayCategoryMenu() { // displays staff category menu
		while(!exit) {
			printCategoryMenu();
			int choice = getUserBasicInput();
			performCategoryAction(choice);
		
		}
	}
			
		private void printCategoryMenu() { // prints the staff category menu
		
			System.out.println("\nWelcome to the staff category menu. Please choose an option");
			System.out.println(" 1 - Manager");
			System.out.println(" 2 - Receptionist");
			System.out.println(" 3 - Veterianarian");
			System.out.println(" 4 - Nurse");
			System.out.println(" 5 - Trainee Vet");
			System.out.println(" 6 - Back to Basic Menu");
			System.out.println(" 0 - Exit");
			
		
	}
		
		
		private void performCategoryAction(int choice) {
			
			switch (choice) {
			
			case 0:
				exit = true;
				System.out.println("\nThanks for using our system");
				break;
				
			case 1:
				h.listStaffByCategory("manager");
				break;
				
			case 2:
				h.listStaffByCategory("receptionist");
				break;
				
			case 3:
				h.listStaffByCategory("veterinarian");
				break;
				
			case 4:
				h.listStaffByCategory("nurse");
				break;
				
			case 5:
				h.listStaffByCategory("traineevet");
				break;
				
			case 6: 
				displayBasicFuncionalities();
				break;
				
			default:
				System.out.println("\nAn unknown error has occurred\n");	
				
			
			}
		}

		

	private int getUserBasicInput() { // I could've used only this method to get input from the user
									  // since it gets numbers from 0 to 8
		
		int userInput = -1 ;   
		
		while (userInput < 0 || userInput > 8) { // if for the other methods the user had chosen a number bigger than 3
												 // the default case in the switch statement would catch the other situations
			try {
				System.out.print("\nPlease type a valid a number ");
				userInput = Integer.parseInt(myInput.readLine());
				
			} catch (Exception e) {
				System.out.print("\nInvalid selection. Please try again");
			}
			
		}
		
		return userInput;
	}
	

	private void printBasicMenu() { // Basic functionality menu
		
		System.out.println("\nBasic Functionality Menu \nWhat would you like to do?");
		System.out.println("1 - List all Staff");
		System.out.println("2 - List staff by categories");
		System.out.println("3 - List all Admin staff performing a certain task ");
		System.out.println("4 - Search for a specific member of staff by name ");
		System.out.println("5 - List all animals");
		System.out.println("6 - List animals by various types (e.g. list all dogs)");
		System.out.println("7 - Search for a specific animal by name");
		System.out.println("8 - Go back to Menu application");
		System.out.println("0 - Exit");
			
		}
	
	private void displayAddFunctionalities() {
		
		while(!exit) {
			printAddMenu();
			int choice = getUserBasicInput();
			performAddAction(choice);
		
		}
			
			
		}

	private void performAddAction(int choice) {
		
		switch(choice) {
		
		case 0:
			exit = true;
			System.out.println("\nThanks for using our system!!! \nGood Bye!!!");
			break;
			
		case 1:
			h.leeshaQueue(); // List all the animals assigned to a member of medical staff
			break;
			
		case 2:
			h.listOrder(); // List the order in which pets will be looked after by a particular member of the medical
						   //staff
			break;
			
		case 3:
			h.nextPet(); // For a given member of the medical staff, pass to the next pet
			break;
			
		case 4:
			displayMainMenu(); // back to the main menu
			break;
			
		default:
			System.out.println("\nAn unknown error has occurred\n");
		
		}		
		
		
	}

	private void printAddMenu() { // Additional Functionality menu

		System.out.println("\nAdditional Functionality Menu \nPlease chose an option");
		System.out.println("1 - List all the animals assigned to a member of medical staff");
		System.out.println("2 - List the order in which pets will be looked after by a veterinarian");
		System.out.println("3 - For a given member of the medical staff, pass to the next pet");
		System.out.println("4 - Back to Main Menu");
		System.out.println("0 - Exit");
		
	}
	}
		
