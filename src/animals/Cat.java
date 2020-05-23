package animals;

public class Cat extends Animal {

	public Cat(String name, String medCondition, int age) {
		super(name, medCondition, age);
	
	}
	
	@Override
	public String identify() {
		
		return "Cat";
	}
	
	@Override
	public String toString() {
		return ("\nType: Cat \nName: " + name + "\nAge: " + age + "\nIllness: " + medCondition);
	}

}
