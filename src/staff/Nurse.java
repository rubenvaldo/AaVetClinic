package staff;

public class Nurse extends MedStaff{

	public Nurse(String name, String iD, double salary) {
		super(name, iD, salary);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String identify() {
		
		return "Nurse";
	}
		
	
	

}
