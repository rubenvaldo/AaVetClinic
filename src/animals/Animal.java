package animals;

public abstract class Animal {
	
	// attributes accessible in the same package and subclasses
	protected String name;
	protected String medCondition;
	protected int age;
	protected Animal next; // for the LinkedList aka Queue
	
	
	public Animal(String name, String medCondition, int age) {
		super();
		this.name = name;
		this.medCondition = medCondition;
		this.age = age;
		
		
	}

	public String getName() {
		return name;
	}


	public String getMedCondition() { 
		return medCondition;
	}


	public int getAge() {
		return age;
	}

	
	@Override
	public String toString() {
		return ("\nName: " + name + "\nAge: " + age + "\nIllness: " + medCondition);
	}


	public String identify() {
		return "animal type";
	}

	// LinkedList aka Queue
	public Animal getNext() {
		return next;
	}



	public void setNext(Animal next) {
		this.next = next;
		
	}
	
		
	

	



}
