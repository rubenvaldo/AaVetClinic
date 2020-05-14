package staff;

public class TraineeVet extends MedStaff {

	public TraineeVet(String name, String iD, double salary) {
		super(name, iD, salary);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String identify() {
		
		return "Trainee Vet";
	}

}
