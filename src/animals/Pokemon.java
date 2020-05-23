package animals;

public class Pokemon extends Animal {

	public Pokemon(String name, String medCondition, int age) {
		super(name, medCondition, age);
	}
	
	@Override
	public String identify() {
		
		return "Pokemon";
	}
	
	@Override
	public String toString() {
		return ("\nType: Pokemon \nName: " + name + "\nAge: " + age + "\nIllness: " + medCondition);
	}

}
