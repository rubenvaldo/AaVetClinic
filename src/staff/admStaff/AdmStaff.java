package staff.admStaff;


public abstract class AdmStaff {
	
	String name, surname;
	int admID;
	double salary;
	
	
	public AdmStaff(String name, String surname, int admID, double salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.admID = admID;
		this.salary = salary;
	}


	public AdmStaff(String name, String surname, int medID) {
		super();
		this.name = name;
		this.surname = surname;
		this.admID = admID;
	}
	
	public AdmStaff(String name, int admID) {
		super();
		this.name = name;
		this.admID = admID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAdmID() {
		return admID;
	}


	public void setAdmID(int admID) {
		this.admID = admID;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	
	//public Collection<String> listStaff(){
	//	return list;
	//}
	


}
