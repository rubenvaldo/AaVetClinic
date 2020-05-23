package factory;


import java.util.Random;
import animals.*;


public class AnimalFactory {

	
	public AnimalFactory(){
		
	}
	
	public Animal getAnimalType(String animalType) { // getting a string from the helper class
		
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
				
		
		public String getAnimalName() { // generates random names
			
			// pool of names
			String [] petName = { "Suky", "Harvey", "Nala", "Minnie", "Madonna", "Britney", "Shakira", "Beyonce", 
								"Sinead OConnor", "Fergie", "Grover", "Timmy", "Puff", "Shirley", "Getulio", "Anitta",
								"Carminha", "Nazare", "Xuxa", "Gretchen", "MJ", "Fred", "Lalo"};
			
			Random r = new Random();
			
			String pName = petName[r.nextInt(petName.length)];
			
			
			return pName;	
			
	}
		
		public String getPokemonName() { // generates random names for the pokemon type
			
			String [] pokNamePool = {"Pikachu", "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Butterfree",
								 "Beedrill", "Pidgeotto", "Rattata", "Arbok", "Raichu", "Vulpix", "Jigglypuff", "Meowth", "Psyduck", "Abra", "Weezing"};
			
			Random r = new Random();
			
			String pokName = pokNamePool[r.nextInt(pokNamePool.length)];
			
			return pokName;	
		
		}
		
		public int animalAge() { // generates random age (in months)
			
			Random r = new Random();
			
			int animalAge = r.nextInt(180);  // 15 years times 12 months = 180
			return animalAge;
		}
		
		public String getMedCondition() {
			
			String [] medConditionPool = {"skin allergie", "ear infection", "skin infection", "arthritis", "upset stomach", "vomiting", "periodontitis",
					"intestinal upset", "blade infection", "bruise", "homesick", "depressed", "overly amorous", "diabetes", "in love", "excessive thyroid hormone", 
					"lymphoma", "pregnant", "broken bone", "right wing", "republican", "bolsominion"}; 
			
			Random r = new Random();
			
			String medCondition = medConditionPool[r.nextInt(medConditionPool.length)];
		
			
			return medCondition;
		}
			
		
	}
	
	
	