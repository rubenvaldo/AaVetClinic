package staff.medStaff;



public abstract class MedStaff {
	
	String name, surname;
	int medID;
	double salary;
	
	
	public MedStaff(String name, String surname, int medID, double salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.medID = medID;
		this.salary = salary;
	}
	
	public MedStaff (String name, String surname, int medID) {
		super();
		this.name = name;
		this.surname = surname;
		this.medID = medID;
	}
	
	public MedStaff(String name, int medID) {
		super();
		this.name = name;
		this.medID = medID;
	}
	
	
	// List all the animals assigned to a member of medical staff [DISTINCTION!!!]

	

}
