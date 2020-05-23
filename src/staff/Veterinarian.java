package staff;

public class Veterinarian extends MedStaff{

	public Veterinarian(String name, String iD, double salary) {
		super(name, iD, salary);
		
	}

	@Override
	public String identify() {
		
		return "Veterinarian";
	}

}
