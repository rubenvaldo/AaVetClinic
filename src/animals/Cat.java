package animals;

public class Cat extends Animal {

	public Cat(String name, String medCondition, int age) {
		super(name, medCondition, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String identify() {
		
		return "Cat";
	}

}
