package factory;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;

import animals.*;
//import animals.Cat;
//import animals.Dog;

public class AnimalFactory {

	/*
	private final int numAnimals = 1000;
	protected int numCat = 250;
	int numDog = 250;
	int numGui = 250;
	private int numPok = 250;
	
	
	private List<Animals> animalList = new ArrayList<Animals>();
	*/
	
	public AnimalFactory(){
		
	}
	
	public Animal getAnimalType(String animalType) {
		
		if (animalType.equalsIgnoreCase("CAT")) {
			
			return new Cat(getAnimalName(), getMedCondition(), animalAge());
		}
		
		else if (animalType.equalsIgnoreCase("DOG")) {
			
			return new Dog(getAnimalName(), getMedCondition(), animalAge());
		}
		
		else if (animalType.equalsIgnoreCase("GUINEAPIG")) {
					
			return new GuineaPig(getAnimalName(), getMedCondition(), animalAge());
		}
		
		else if (animalType.equalsIgnoreCase("POKEMON")) {
			
			return new Pokemon(getPokemonName(), getMedCondition(), animalAge());
		}
		else {
			return null;
		}
		
	}
				
		
		public String getAnimalName() {
			
			String [] petName = { "Suky", "Harvey", "Nala", "Minnie", "Madonna", "Britney", "Shakira", "Beyonce", 
								"Sinead OConnor", "Fergie", "Grover", "Timmy", "Puff", "Shirley", "Getulio", "Anitta",
								"Carminha", "Nazare", "Xuxa", "Gretchen", "MJ", "Fred", "Lalo"};
			
			Random r = new Random();
			
			String pName = petName[r.nextInt(petName.length)];
			
			
			return pName;
		
			
	}
		public String getPokemonName() {
			
			String [] pokNamePool = {"Pikachu", "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Butterfree",
								 "Beedrill", "Pidgeotto", "Rattata", "Arbok", "Raichu", "Vulpix", "Jigglypuff", "Meowth", "Psyduck", "Abra", "Weezing"};
			
			Random r = new Random();
			
			String pokName = pokNamePool[r.nextInt(pokNamePool.length)];
			
			return pokName;
			
		
		
		}
		
		public int animalAge() {
			
			Random r = new Random();
			
			int animalAge = r.nextInt(180); // Age in months - from 0 to 15 years
			return animalAge;
		}
		
		public String getMedCondition() {
			
			String [] medConditionPool = {"skin allergie", "ear infection", "skin infection", "arthritis", "upset stomach", "vomiting", "periodontitis",
					"intestinal upset", "blade infection", "bruise", "homesick", "depressed", "horny", "diabetes", "in love", "excessive thyroid hormone", 
					"lymphoma", "pregnant", "broken bone", "right wing", "republican", "bolsominion"}; 
			
			Random r = new Random();
			
			String medCondition = medConditionPool[r.nextInt(medConditionPool.length)];
		
			
			return medCondition;
		}
			
		
		
	}
	
	
	/*
	
	public void createAnimal() {
		
		// === CATS ===
		for (int i=0; i< numCat; i++) {
			animalList.add(new Cat(getAnimalName(), getMedCondition(), animalAge()));
			// new Cat(getAnimalName(), getMedCondition(), animalAge());
		}
		
		// === DOGS ===
		for (int i=0; i< numDog; i++) {
			animalList.add(new Dog(getAnimalName(), getMedCondition(), animalAge()));
		}
	
		// === GUINEA PIG ===
		for (int i=0; i< numGui; i++) {
			animalList.add(new GuineaPig(getAnimalName(), getMedCondition(), animalAge()));
		}
		
		// === POKEMON ===
		for (int i=0; i< numPok; i++) {
			animalList.add(new Pokemon(getPokemonName(), getMedCondition(), animalAge()));
		}
		
		for (Animals a: animalList) {
			System.out.println("Type: " + a.identify());
			System.out.println("Name: " + a.getName());
			System.out.println("Age: " + a.getAge());
			System.out.println("Ilness: " +a.getMedCondition());
		}
	}
	
	public void printAllCats() {
		for (Animals b: animalList) {
			if(b.getClass().getSimpleName().equalsIgnoreCase("cat")){
				System.out.println(b.getName() + " " + b.getClass().getSimpleName());
				
				
			}
			
		}
	}
	
	
	
	public String getAnimalName() {
		
		String [] petName = { "Suky", "Harvey", "Nala", "Minnie", "Madonna", "Britney", "Shakira", "Beyonce", 
							"Sinead OConnor", "Fergie", "Grover", "Timmy", "Puff", "Shirley", "Getulio", "Anitta",
							"Carminha", "Nazare", "Xuxa", "Gretchen", "MJ", "Fred", "Lalo"};
		
		Random r = new Random();
		
		String pName = petName[r.nextInt(petName.length)];
		
		
		return pName;
	
		
}
	public String getPokemonName() {
		
		String [] pokNamePool = {"Pikachu", "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Butterfree",
							 "Beedrill", "Pidgeotto", "Rattata", "Arbok", "Raichu", "Vulpix", "Jigglypuff", "Meowth", "Psyduck", "Abra", "Weezing"};
		
		Random r = new Random();
		
		String pokName = pokNamePool[r.nextInt(pokNamePool.length)];
		
		return pokName;
		
	
	
	}
	
	public int animalAge() {
		
		Random r = new Random();
		
		int animalAge = r.nextInt(15);
		return animalAge;
	}
	
	public String getMedCondition() {
		
		String [] medConditionPool = {"skin allergie", "ear infection", "skin infection", "arthritis", "upset stomach", "vomiting", "periodontitis",
				"intestinal upset", "blade infection", "bruise", "homesick", "depressed", "horny", "diabetes", "in love", "excessive thyroid hormone", 
				"lymphoma", "pregnant", "broken bone", "right wing", "republican", "bolsominion"}; 
		
		Random r = new Random();
		
		String medCondition = medConditionPool[r.nextInt(medConditionPool.length)];
	
		
		return medCondition;
	}
	
	
}

*/
