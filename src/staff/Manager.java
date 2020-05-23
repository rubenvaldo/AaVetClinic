package staff;

import staff.tasks.Tasks;

public class Manager extends AdmStaff implements Tasks {

	public Manager(String name, String ID, double salary) {
		super(name, ID, salary);
	}

	
	public Manager() {
		super();
	}


	@Override
	public String identify() {
		
		return "Manager";
	}


	@Override
	public String doTask01() { // overrides Tasks interface
		return "I'm working on the business plan of the clinic";
	}


	@Override
	public String doTask02() {
		return "I'm working on the payroll";
	}
	

}
