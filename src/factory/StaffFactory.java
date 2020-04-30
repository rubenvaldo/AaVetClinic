package factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import staff.admStaff.AdmStaff;
import staff.medStaff.MedStaff;
import staff.medStaff.Nurse;
import staff.medStaff.TraineeVet;
import staff.medStaff.Veterinarian;
import staff.admStaff.*;
//import staff.*;


public class StaffFactory {
	// just want to create the staff objects (adm and med)

	private final int numAdmStaff = 10;
	private int currentAdmID = 100;
	private final int numMedStaff = 30;
	private int currentMedID = 200;
	//int numStaff = numAdmnStaff + numMedStaff;
	
	private ArrayList <AdmStaff> admStaffList = new ArrayList<AdmStaff>();
	private ArrayList <MedStaff> medStaffList = new ArrayList<MedStaff>();
	
	
	
	public StaffFactory() {
		
	}
	
	// adding staff to the staff lists
	public void addStaff() {
		
		int numRec = numAdmStaff/2;
		int numMan = numAdmStaff/2;
		int ID;
		
		//=== ADM STAFF ==
		//Receptionists 
		for (int i=0; i<numRec; i++) {
			String name = getRandomName();
			ID = currentAdmID;
			AdmStaff nextAdmStaff = new Receptionist(name, ID);
			admStaffList.add(nextAdmStaff);
			currentAdmID++;
			
		}
		// Managers
		for (int i=0; i<numMan; i++) {
			String name = getRandomName();
			ID = currentAdmID + numRec;
			admStaffList.add(new Manager(name, ID));
			currentAdmID++;
			
		}
		
		// ==== MED STAFF ====
		// Veterinarian
		for (int i=0; i<5; i++) {
			String name = getRandomName();
			ID = currentMedID;
			medStaffList.add(new Veterinarian(name, ID));
			currentMedID++;
		}
		
		// Nurse
		for (int i=0; i<15; i++) {
			String name = getRandomName();
			ID = currentMedID;
			medStaffList.add(new Nurse(name, ID));
			currentMedID++;
		}
		
		// TraineeVet
		for (int i =0; i < 10; i++) {
			String name = getRandomName();
			ID = currentMedID;
			medStaffList.add(new TraineeVet(name, ID));
			currentMedID++;
			
		}
	}
		public Collection<String> listNames(){
			ArrayList<String> names = new ArrayList<String>();
			for(int i=0; i<admStaffList.size(); i++) {
				AdmStaff staff = admStaffList.get(i);
				String name = staff.getName();
				names.add(name);
				
			}
			return names;
			
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
