package staff.medStaff;

public class Veterinarian extends MedStaff{

	public Veterinarian(String name, String surname, int medID, double salary) {
		super(name, surname, medID, salary);
		// TODO Auto-generated constructor stub
	}
	
	//public Veterinarian (String name)

	public Veterinarian (String name, int medID) {
		super(name, medID);
	}
	

}
