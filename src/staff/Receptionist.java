package staff;

import staff.tasks.Tasks;

public class Receptionist extends AdmStaff implements Tasks{

	public Receptionist(String name, String iD, double salary) {
		super(name, iD, salary);
		
	}

	public Receptionist() {
	
	}

	@Override
	public String identify() {
		return "Receptionist";
	}

	

	@Override 
	public String doTask01() { // overrides Tasks interface
		return "I'm welcoming the patients";
	}


	@Override
	public String doTask02() { // overrides Tasks interface
		return "I'm making some phone calls";
	}
	

}
