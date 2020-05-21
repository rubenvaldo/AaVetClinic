package staff;

import staff.tasks.Tasks;

public class Manager extends AdmStaff implements Tasks {

	public Manager(String name, String ID, double salary) {
		super(name, ID, salary);
		// TODO Auto-generated constructor stub
	}

	
	public Manager() {
		super();
	}


	@Override
	public String identify() {
		
		return "Manager";
	}


	@Override
	public String doTask01() {
		return "I'm monitoring a process group";// + this.toString();
	}


	@Override
	public String doTask02() {
		return "I'm doing the payroll";
	}
	
	

}
