package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLI {
	
	int choice;
	
	Helper helper;
	
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
	
	public CLI() {
		
		System.out.println("Welcome to the VetClinic System. Choose an option from the list below");
		System.out.println("1 - Basic Funcionalities");
		System.out.println("2 - Additional Functionalities");
		
		
		choice = -1;
		helper = new Helper();
		
		do {
			choice = getUserOption();
			
			if(choice == 1) {
				displayBasicFunctionalities();
			}
			else if (choice == 2){
				displayAddFunctionalities();
				
			}
		} while (choice!=0);
		System.out.println("Thanks for using our system");
		
	}
	
	private void displayBasicFunctionalities() {
		
		System.out.println("1 - List all Staff");
		System.out.println("2 - List staff by categories");
		System.out.println("3 - List all Admin staff performing a certain task ");
		System.out.println("4 - Search for a specific member of staff by name ");
		System.out.println("5 - List all animals");
		System.out.println("6 - List animals by various types (e.g. list all dogs)");
		System.out.println("7 - Search for a specific animal by name");
	}

	private void displayAddFunctionalities() {
		// TODO Auto-generated method stub
		
	}

	
		
	

	public int getUserOption() {
		
		BufferedReader myInput = new BufferedReader(new InputStreamReader (System.in));
		int userInput = -1 ;
		//boolean valid = false;
		
		do {
			try {
				userInput = Integer.parseInt(myInput.readLine());
	
				if((userInput)<1 || (userInput)>2){
					System.out.println("Please type 1 for basic or 2 for additional");
				}
			} catch (Exception e) {
				System.out.println("Please type a valid option");
				userInput = -1;
				
			}
			
		}while (!((userInput<1) || (userInput>2)));

		
		return userInput;
	}

}
