package user;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CLI();
		
		//Helper h = new Helper();
		//h.leeshaQueue();
		//h.listOrder();
		//h.nextPet();
		
		
		
		
		
	// ================ TEST ZONE ====================== //
		
		
		//h.printAllAnimals();
		//h.printAllCats();
		//h.listAnimalsByType("DoG");
		//h.printAllStaff();
		//h.listStaffByCategory("nurse");
				
		//h.performingTaskTwo();
				
		//h.listStaffNames();
		
		/**
		System.out.println("==== keyword ====");
		String keyword = "puff";
		//for(Animal animal: h.searchName(keyword)) {
		for (Animal animal: h.findName(keyword)) {
			System.out.println( "Name: " + animal.getName()+ "\nType: " + animal.getClass().getSimpleName() + "\nAge: " + animal.getAge() + "\nIlness: "+ animal.getMedCondition());
			System.out.println();
		}
		*/
		
		
		/*
		String keyword = "Britney";
		System.out.println(h.searchAnimal(keyword, h.animalList));
		//String position = h.searchAnimal(keyword, h.animalList);// (target, h.animalList);
		/*
		if (position == null) {
			System.out.println("not there");
		}
		else {
			System.out.println("Name: " +h.animalList.;
		}
		*/
		/*
		String target = "Puff";
		int position = h.searchAnimalByName(target, h.animalList);
		if (position == -1) {
			System.out.println("not there");
		}
		else {
			System.out.println("Name: " + target + " Age: " + h.
		}
		//h.searchAnimalByName("Puff", h.animalList);
		*/
		
		/*
		System.out.println("==== keyword ====");
		String keyword = "puff";
		//for(Animal animal: h.searchName(keyword)) {
		for (Animal animal: h.searchName(keyword)) {
			System.out.println(animal.getName() + animal.getAge() + animal.getMedCondition());
		}
		*/
		
		
		
		/**
		StaffFactory sf = new StaffFactory();
		sf.addStaff();
		
		
		
		for (String name : sf.listNames()) {
			System.out.println(name);
		}
		System.out.println();
		
		*/
		
		
		/*
		AnimalFactory af = new AnimalFactory();
		af.createAnimal();
		af.printAllCats();
		
		//System.out.println(af.getPokemonName());
		//System.out.println(af.addAnimal());
		
		//for (Animals animal: af.getPokemonName()) {
		//	System.out.println(animal);
		//}
		
		Animal a1 = new Pokemon ("pikachu", "sick", 1);
		System.out.println(a1);
		
		//String type = af.getAnimalType();
		//System.out.println(af.getAnimalType());
		
		
		for (int i=0; i< 250; i++) {
		Animals a2 = new Pokemon (af.getPokemonName(), af.getMedCondition(), af.animalAge());
		System.out.println(a2);
		}
		*/

	}

}
