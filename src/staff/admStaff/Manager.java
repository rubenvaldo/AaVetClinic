package staff.admStaff;

public class Manager extends AdmStaff {

	public Manager(String name, String surname, int medID, double salary) {
		super(name, surname, medID, salary);
		// TODO Auto-generated constructor stub
	}
	
	public Manager (String name, String surname, int medID) {
		super(name, surname, medID);
	}

	public Manager (String name, int ID) {
		super (name, ID);
	
	}

}
