package staff;

public abstract class Staff {
	
	String name, ID;
	double salary;
	
	
	public Staff(String name, String ID, double salary) {
		super();
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}


	public Staff() {
		super();
	}


	public String getName() {
		return name;
	}


	public String getID() {
		return ID;
	}


	public double getSalary() {
		return salary;
	}


	public String identify() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return ("Name: " + this.name);
	}
	
	

}
