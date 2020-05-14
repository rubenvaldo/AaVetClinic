package staff;

import staff.admStaff.Tasks;

public class Receptionist extends AdmStaff implements Tasks{

	public Receptionist(String name, String iD, double salary) {
		super(name, iD, salary);
		// TODO Auto-generated constructor stub
	}

	public Receptionist() {
	
	}

	@Override
	public String identify() {
		return "Receptionist";
	}

	

	@Override
	public String doTask01() {
		return "I'm welcoming the patients";
	}


	@Override
	public String doTask02() {
		return "I'm making phone calls";
	}
	

}
