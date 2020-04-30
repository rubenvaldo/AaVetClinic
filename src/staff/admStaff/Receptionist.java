package staff.admStaff;

public class Receptionist extends AdmStaff {

	public Receptionist(String name, String surname, int medID, double salary) {
		super(name, surname, medID, salary);
		// TODO Auto-generated constructor stub
	}
	
	public Receptionist (String name, String surname, int medStaffID) {
		super(name, surname, medStaffID);
	}
		
	public Receptionist (String name, int ID) {
		super(name, ID);
	}

	

}
