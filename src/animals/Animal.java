package animals;

public abstract class Animal {
	
	private String name, medCondition;
	private int age;
	private Animal next; // for the LinkedList aka Queue
	//public abstract String identify();
	
	
	public Animal(String name, String medCondition, int age) {
		super();
		this.name = name;
		this.medCondition = medCondition;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMedCondition() { //double check with AnimalFactory
		return medCondition;
	}

	public void setMedCondition(String medCondition) {
		this.medCondition = medCondition;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return ("Name: " + name + ", age: " + age + ", illness: " + medCondition);
	}
	
	
	/*
	@Override
	public String toString() {
		return name + " " + age + " " + medCondition;
	}
	*/

	public String identify() {
		// TODO Auto-generated method stub
		return "animal type";
	}

	// LinkedList aka Queue
	public Animal getNext() {
		return next;
	}
/*
	public void setNext(Animal next) {
		this.next = next;
	}
*/


	public void setNext(Animal next) {
		this.next = next;
		
	}
	
		
	

	



}
