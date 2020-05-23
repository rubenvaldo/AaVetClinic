package animals;

public class GuineaPig extends Animal {

	public GuineaPig(String name, String medCondition, int age) {
		super(name, medCondition, age);
	}
	
	@Override
	public String identify() {
		
		return "Guinea Pig";
	}
	
	@Override
	public String toString() {
		return ("\nType: Guinea Pig \nName: " + name + "\nAge: " + age + "\nIllness: " + medCondition);
	}

}
