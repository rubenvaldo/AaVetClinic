package factory;

import java.util.Random;

import staff.Manager;
import staff.Nurse;
import staff.Receptionist;
import staff.Staff;
import staff.TraineeVet;
import staff.Veterinarian;



public class StaffFactory {
	
	//int mgrID = 100; //starting ID Manager number
	
	public StaffFactory() {

		
	}
	
	public Staff getStaffType (String staffType, int i) {
		
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
	
	
	public double getVetSalary() {
		return 2000;
	}
	
	public double getNurseSalary() {
		return 1000;
	}
	public double getTraineeSalary() {
		return 400;
	}

	public double getRecepSalary() {
		return 500;
	}

	public double getMgrSalary() {
		return 1000;
	}
	
	
	public String getID(String type, int i) {
		
		int staffID = 101;
		staffID+= i;
		
		if(type.equalsIgnoreCase("adm")) {
				return "ADM" + Integer.toString(staffID);
				//x++;
			
		}	
		else if(type.equalsIgnoreCase("med")) {
			
			return "MED" + Integer.toString(staffID);
			}
		else {		
		
		return null;
		}
	}

	public String getRandomName() {
		//return a random name
		
		String [] firstName = {"Alaska", "Trixie", "Katya", "Sharon", "Adore", "Alyssa", "Shangela", "Willam", "Bob", "Jinkx", "Yvie"};
		String [] surname = {"Thunderfuck", "Mattel","Zamolodchikova", "Needles", "Delano", "Edwards", "Wadley", "Queen", "Belli", "Oddly"};
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fName = firstName[r.nextInt(firstName.length)];
		String sName = surname[r.nextInt(surname.length)];
		
		return ( fName + " " + sName);
	
	}	
	
	
	
	
//}



}




/*
 public String getID(String type, int i) {
		
		int staffID = 100;
		staffID+= i;
		
		if(type.equalsIgnoreCase("adm")) {
				return "ADM" + Integer.toString(staffID);
				//x++;
			
		}	
		else if(type.equalsIgnoreCase("med")) {
			
			return "MED" + Integer.toString(x);
			}
		else {		
		
		return null;
		}
	}
 */
	
	/*
	// just want to create the staff objects (adm and med)

	private final int numAdmStaff = 10;
	private int currentAdmID = 100;
	private final int numMedStaff = 30;
	private int currentMedID = 200;
	//int numStaff = numAdmnStaff + numMedStaff;
	
	
	// storing staff in two dif arrayList
	private ArrayList <AdmStaff> admStaffList = new ArrayList<AdmStaff>();
	private ArrayList <MedStaff> medStaffList = new ArrayList<MedStaff>();
	
	
	
	public StaffFactory() {
		
	}
	
	// adding staff to the staff lists
	// AdmStaff: Receptionist and Manager
	// MedStaff: Veterinarian, Nurse and TraineeVet
	public void addStaff() {
		
		int numRec = numAdmStaff/2; // 5 receptionists. (They're part-time students)
		int numMan = numAdmStaff/2; // 5 managers
		int ID;
		
		//=== ADM STAFF ==
		
		//Receptionists 
		for (int i=0; i<numRec; i++) {
			//String name = getRandomName();
			ID = currentAdmID;
			//AdmStaff nextAdmStaff = new Receptionist(getRandomName(), ID);
			//admStaffList.add(nextAdmStaff);
			admStaffList.add(new Receptionist(getRandomName(), ID));
			currentAdmID++;
			
		}
		
		// Managers
		for (int i=0; i<numMan; i++) {
			ID = currentAdmID;
			admStaffList.add(new Manager(getRandomName(), ID));
			currentAdmID++;
			
		}
		
		// ==== MED STAFF ====
		
		// Veterinarian
		for (int i=0; i<5; i++) {
			ID = currentMedID;
			medStaffList.add(new Veterinarian(getRandomName(), ID));
			currentMedID++;
		}
		
		// Nurse
		for (int i=0; i<15; i++) {
			ID = currentMedID;
			medStaffList.add(new Nurse(getRandomName(), ID));
			currentMedID++;
		}
		
		// TraineeVet
		for (int i =0; i < 10; i++) {
			ID = currentMedID;
			medStaffList.add(new TraineeVet(getRandomName(), ID));
			currentMedID++;
			
		}
	}
		
	// Creating an arrayList to store staff names
	public Collection<String> listNames(){
			ArrayList<String> staffNames = new ArrayList<String>();
			
			//AdmStaff
			for(int i=0; i<admStaffList.size(); i++) {
				AdmStaff admStaff = admStaffList.get(i);
				String admName = admStaff.getName();
				staffNames.add(admName);
			}
			
			//MedStaff
			for(int i=0; i<medStaffList.size(); i++) {
				MedStaff medStaff = medStaffList.get(i);
				String medName = medStaff.getName();
				staffNames.add(medName);
				
			}
			return staffNames;
			
			// try to check enum to return either admStaff or medStaff 
			
			
		}
	
	
	public String getRandomName() {
		//return a random name
		
		String [] firstName = {"Alaska", "Trixie", "Katya", "Sharon", "Adore", "Alyssa", "Shangela", "Willam", "Bob", "Jinkx", "Yvie"};
		String [] surname = {"Thunderfuck", "Mattel","Zamolodchikova", "Needles", "Delano", "Edwards", "Wadley", "Queen", "Belli", "Oddly"};
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fName = firstName[r.nextInt(firstName.length)];
		String sName = surname[r.nextInt(surname.length)];
		
		return ( fName + " " + sName);
	
	}	
	
	
	//String[] firstName = {"Ruben", "Brian", "Amilcar", "Ken", "Rubia", "Ricardo", "Rivaldo", "Maria", "Kyra", "Tifany"};
			//String[] surname = {"Francisco", "Nascimento", "Sammon", "Silva", "Soares", "Duarte", "Oliveira", "O'Connor", "Kenny"};
	
}
*/