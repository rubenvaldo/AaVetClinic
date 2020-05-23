package animals;

public class Dog extends Animal {

	public Dog(String name, String medCondition, int age) {
		super(name, medCondition, age);
		
	}
	
	@Override
	public String identify() {
		
		return "Dog";
	}
	
	@Override
	public String toString() {
		return ("\nType: Dog \nName: " + name + "\nAge: " + age + "\nIllness: " + medCondition);
	}

}
