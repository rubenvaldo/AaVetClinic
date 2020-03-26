package employees;

public abstract class Staff {
	
	private String name;
	private int empID; //private final int employeeID does not work. WHY???
	protected double salaryLevel;
	
	
	public Staff(String name, int empID, double salaryLevel) {
		super();
		this.name = name;
		this.empID = empID;
		this.salaryLevel = salaryLevel;
	}
	
	
	

}
