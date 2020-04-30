package staff.medStaff;

public class TraineeVet extends MedStaff {

	public TraineeVet(String name, String surname, int medID, double salary) {
		super(name, surname, medID, salary);
		// TODO Auto-generated constructor stub
	}

	
		
	public TraineeVet(String name, String surname, int medID) {
		super(name, surname, medID);
		
	}
	
	public TraineeVet (String name, int medID) {
		super(name, medID);
	}

}
