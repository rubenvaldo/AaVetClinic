package factory;

// code according to guidance provided from Amilcar's youtube channel
// https://www.youtube.com/watch?v=9GiKpPAD_r8&list=PL2RazpQ39sI1QEbGi59jn7aq2v-WDbY0I&index=17

import animals.Animal;

public class LinkedListFactory {
	
	private Animal first;
	private Animal last;
	private int size;
	
	
	public LinkedListFactory() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void add(Animal animal) { // add animal to the queue
		if (size == 0) {
			this.first = animal;
			this.last = animal;
			size++;
		}
		else {
			this.last.setNext(animal);
			this.last = animal;
			size++;
		}
	}
	
	public void addFirst(Animal animal) { // add animal to the first postition
		if(size == 0) {
			this.first = animal;
			this.last = animal;
			size++;		
		}
		else {
			animal.setNext(this.first);
			this.first = animal;
			size++;
		}
	}
	
	
	public Animal findAnimalbyPosition(int position) {
		
		//if(size == 0 || position >= size -1) { it didn't work with this notation
		if (size ==0 || position >= size){
			return null;			
		}
		
		Animal current = first;
		int counter = 0;
		
		while (counter < position) {
			current = current.getNext();
			counter++;
		}
		return current;
		
	}
	
	public int getCount() {
		
		Animal temp = first;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}
	
	// For a given member of the medical staff, pass to the next pet
	public Animal removeFirst() {
		
		if(size == 0) {
			return null;
		}
		
		if(size == 1) {
			last = null;
		}
		
		Animal toReturn = first;
		first = first.getNext();
		size--;
		
		return toReturn;
		
		
	}
	
	@Override
	public String toString() {
		String toReturn = " ";
		Animal current = this.first;
		
		while(current !=null) {
			toReturn += current + "\n ";
			current = current.getNext();
		}

		
		return toReturn;
	}

}
