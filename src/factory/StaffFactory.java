package factory;

import java.util.Random;

import staff.Manager;
import staff.Nurse;
import staff.Receptionist;
import staff.Staff;
import staff.TraineeVet;
import staff.Veterinarian;

public class StaffFactory {
	
	
	public StaffFactory() {

		
	}
	
	public Staff getStaffType (String staffType, int i) { // gets a string and an integer passed on as a ID number
		
		if (staffType.equalsIgnoreCase("MANAGER")) {
			return new Manager(getRandomName(), getID("adm", i), getMgrSalary());
		}
		
		else if (staffType.equalsIgnoreCase("RECEPTIONIST")) {
			return new Receptionist(getRandomName(), getID("adm", i), getRecepSalary());
		}
		
		else  if (staffType.equalsIgnoreCase("VETERINARIAN")) {
			return new Veterinarian(getRandomName(), getID("med", i), getVetSalary());
		}
		
		else if (staffType.equalsIgnoreCase("NURSE")) {
			return new Nurse(getRandomName(), getID("med", i), getNurseSalary());
		}
		
		else if (staffType.equalsIgnoreCase("TRAINEEVET")) {
			return new TraineeVet(getRandomName(), getID("med", i), getTraineeSalary());
		}
		
		else  {
			return null;
		}
	}
	
	
	public double getVetSalary() { // setting the salary for all veterianarian
		return 2000;
	}
	
	public double getNurseSalary() { // setting the salary for all nurse
		return 1000;
	}
	public double getTraineeSalary() { // setting the salary for all trainee
		return 400;
	}

	public double getRecepSalary() { // receptionist
		return 500;
	}

	public double getMgrSalary() { // manager
		return 1000;
	}
	
	
	public String getID(String type, int i) { // generates staff ID
		
		int staffID = 101; // start ID number
		staffID+= i; // increments according to the number of staff 
		
		if(type.equalsIgnoreCase("adm")) {  // adm staff
				return "ADM" + Integer.toString(staffID);	
		}	
		else if(type.equalsIgnoreCase("med")) { // medical staff
			
			return "MED" + Integer.toString(staffID);
		}
		else {		
		
		return null;
		}
	}

	public String getRandomName() {
		//return a random name
		
		// those are former drag queen names from one of my favourite TV show
		String [] firstName = {"Alaska", "Trixie", "Katya", "Sharon", "Adore", "Alyssa", "Shangela", "Willam", "Bob", "Jinkx", "Yvie"};
		String [] surname = {"Thunderfuck", "Mattel","Zamolodchikova", "Needles", "Delano", "Edwards", "Wadley", "Queen", "Belli", "Oddly"};
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fName = firstName[r.nextInt(firstName.length)];
		String sName = surname[r.nextInt(surname.length)];
		
		return ( fName + " " + sName);
	
	}	

}




