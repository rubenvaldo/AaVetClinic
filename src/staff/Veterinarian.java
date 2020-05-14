package staff;

public class Veterinarian extends MedStaff{

	public Veterinarian(String name, String iD, double salary) {
		super(name, iD, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String identify() {
		
		return "Veterinarian";
	}

}
