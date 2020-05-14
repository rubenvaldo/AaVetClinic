package animals;

public class Dog extends Animal {

	public Dog(String name, String medCondition, int age) {
		super(name, medCondition, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String identify() {
		
		return "Dog";
	}

}
