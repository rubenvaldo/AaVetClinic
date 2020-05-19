package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import animals.Animal;
import staff.Staff;


//import user.Helper;

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
	BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));

	boolean exit;
	
	Helper h = new Helper();
	
	public CLI() {
		displayMainMenu();
	}
	
public void displayMainMenu() {
	
	printHeader();
	//printMenu();
	while(!exit) {
		printMainMenu();
		int choice = getUserInput();
		performAction(choice);
		//exit = true;
	}
}
	
	private void printHeader() {
		System.out.println("+---------------------------------------+");
		System.out.println("|       Welcome to the VetClinic        |");
		System.out.println("|            Menu Application           |");
		System.out.println("+---------------------------------------+");
		
	}
	
	private void printMainMenu() {
		
		System.out.println("\nPlease, choose an option from the list below");
		System.out.println("1 - Basic Funcionalities");
		System.out.println("2 - Additional Functionalities");
		System.out.println("0 - Exit");
		
	}
	
	private int getUserInput() {
		
		//BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
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
			System.out.println("Thanks for using our system");
			break;
		
		case 1:
			displayBasicFuncionalities();
			break;
			
		case 2:
			displayAddFunctionalities();
			break;
			
		default:
			System.out.println("An unknown error has occurred");
			
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
				System.out.println("Thanks for using our system");
				break;
				
			case 1:
				h.listAllStaff();
				//displayBasicFuncionalities();
				break;
				
			case 2:
				displayCategoryMenu();
				//displayBasicFuncionalities();
				break;
				
			case 3:
				displayTaskMenu();
				//h.performingTaskOne();
				//displayBasicFuncionalities();
				break;
				
			case 4:
				
				h.listStaffNames();
				System.out.println("\nPlease type the name of the employee you'd like to search for\n");
				
				String userInput = "";
				try {
					userInput = myInput.readLine();
				} catch (IOException e) {
					System.out.println("Please type a valid name");
				}
				
				
				for (Staff staff: h.searchStaffName(userInput)) {
					if(userInput.equalsIgnoreCase(staff.getName())) {
						System.out.println("\nType: " + staff.getClass().getSimpleName() + "\nName: " + staff.getName() + "\nID: " + staff.getID() + "\nSalary: " + staff.getSalary());
					}

					else { // it doesn't work
						System.out.println("No staff found with this name. Please try again");
					}
				}
				//displayBasicFuncionalities();
				//h.listStaffByCategory(type);
				break;
				
			case 5:
				h.printAllAnimals();
				//displayBasicFuncionalities();
				break;
				
			case 6:
				displayATMenu();
				//displayBasicFuncionalities();
				break;
				
			case 7:
				h.listAllAnimalNames();
				System.out.println("\nPlease type the name of the animal you'd like to search for\n");
				
				String userInput2 = "";
				try {
					userInput2 = myInput.readLine();
				} catch (IOException e) {
					System.out.println("Please type a valid name");
				}
				
				
				for (Animal a: h.findName(userInput2)) {
					if(userInput2.equalsIgnoreCase(a.getName())) {
						System.out.println("\nType: " + a.getClass().getSimpleName() + "\nName: " + a.getName() + "\nAge: " + a.getAge() + "\nIllness: " + a.getMedCondition());
					}

					else { // it doesn't work
						System.out.println("No staff found with this name. Please try again");
					}
				}
				
				//displayBasicFuncionalities();
				
				break;
				
			case 8:
				displayMainMenu();
				break;
				
			default:
				System.out.println("An unknown error has occurred");
			
			}		
		
	}
		
	private void displayATMenu() {
		while(!exit) {
			printATMenu();
			int choice = getUserBasicInput();
			performATAction(choice);
		
		}
			
			
		}

	private void performATAction(int choice) {
		switch(choice) {
		case 0:
			exit = true;
			System.out.println("Thanks for using our system");
			break;
		
		case 1:
			h.listAnimalsByType("cat");
			break;
			
		case 2:
			h.listAnimalsByType("dog");
			break;
			
		case 3:
			h.listAnimalsByType("guineapig");
			break;
			
		case 4:
			h.listStaffByCategory("pokemon");
			break;
			
		case 5: 
			//displayBasicFunctionalities();
			displayBasicFuncionalities();
			break;
			
		default:
			System.out.println("An unknown error has occurred");	
			
		}
		
	}

	private void printATMenu() {
		System.out.println("Choose an option");
		System.out.println(" 1 - Cat");
		System.out.println(" 2 - Dog");
		System.out.println(" 3 - Guinea Pig");
		System.out.println(" 4 - Pokemon");
		System.out.println(" 5 - Back to Basic Menu");
		System.out.println(" 0 - Exit");
		
	}

	private void displayTaskMenu() {
		while(!exit) {
			printTaskMenu();
			int choice = getUserBasicInput();
			performTaskAction(choice);
		
		}
			
		}

	private void performTaskAction(int choice) {
		// TODO Auto-generated method stub
		
		switch (choice) {
		case 0:
			exit = true;
			System.out.println("Thanks for using our system");
			break;
			
		case 1:
			h.performingTaskOne();
			break;
			
		case 2:
			h.performingTaskTwo();
			break;
			
		case 3:
			displayBasicFuncionalities();
			break;
			
		default:
			System.out.println("An unknown error has occurred");
			
		}
	}

	private void printTaskMenu() {
		System.out.println("\nWelcome to the adm Task Menu. Manager and Receptionist perform different tasks");
		System.out.println(" 1 - for Task one");
		System.out.println(" 2 - for Task two");
		System.out.println(" 3 - Back to Basic Menu");
		System.out.println(" 0 - Exit");
		
		
	}

	private void displayCategoryMenu() {
		while(!exit) {
			printCategoryMenu();
			int choice = getUserBasicInput();
			performCategoryAction(choice);
		
		}
	}
			
		private void printCategoryMenu() {
		// TODO Auto-generated method stub
			System.out.println("Choose an option");
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
				System.out.println("Thanks for using our system");
				break;
				
			case 1:
				h.listStaffByCategory("manager");
				//printCategoryMenu();
				break;
				
			case 2:
				h.listStaffByCategory("receptionist");
				//printCategoryMenu();
				break;
				
			case 3:
				h.listStaffByCategory("veterinarian");
				//printCategoryMenu();
				break;
				
			case 4:
				h.listStaffByCategory("nurse");
				//printCategoryMenu();
				break;
				
			case 5:
				h.listStaffByCategory("traineevet");
				//printCategoryMenu();
				break;
				
			case 6: 
				//displayBasicFunctionalities();
				displayBasicFuncionalities();
				break;
				
			default:
				System.out.println("An unknown error has occurred");	
				
			
			}
		}

		

	private int getUserBasicInput() {
		
		int userInput = -1 ;
		
		while (userInput < 0 || userInput > 8) {
			try {
				System.out.print("\nPlease type a valid a number ");
				userInput = Integer.parseInt(myInput.readLine());
				
			} catch (Exception e) {
				System.out.print("\nInvalid selection. Please try again");
			}
			
		}
		
		return userInput;
	}
	

	private void printBasicMenu() {
		System.out.println("\nChoose an option from the menu below:");
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
			System.out.println("Thanks for using our system");
			break;
			
		case 1:
			//h.animalMember();
			System.out.println("WIP");
			break;
			
		case 2:
			System.out.println("WIP");
			//h.animalOrder();
			break;
			
		case 3:
			System.out.println("WIP");
			//h.nextPet();
			break;
			
		case 4:
			displayMainMenu();
			break;
			
		default:
			System.out.println("An unknown error has occurred");
		
		}		
		
		
	}

	private void printAddMenu() {

		System.out.println("\nPlease chose an option");
		System.out.println("1 - List all the animals assigned to a member of medical staff");
		System.out.println("2 - List the order in which pets will be looked after by a veterinarian");
		System.out.println("3 - For a given member of the medical staff, pass to the next pet");
		System.out.println("4 - Back to Main Menu");
		System.out.println("0 - Exit");
		
	}
	}
		
