package animals;

public class Pokemon extends Animal {

	public Pokemon(String name, String medCondition, int age) {
		super(name, medCondition, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String identify() {
		
		return "Pokemon";
	}

}
