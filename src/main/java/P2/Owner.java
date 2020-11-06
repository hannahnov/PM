package P2;

import java.util.ArrayList;


public class Owner extends Human {
	
	private int numDogs;

    private ArrayList <Dog> dogs = new ArrayList<>();

	
	public Owner() {
		
	}
	
	public Owner (int numDogs, ArrayList<Dog> dogs) {
		
	}


	public int getNumDogs() {
		return numDogs;
	}


	public void setNumDogs(int numDogs) {
		this.numDogs = numDogs;
	}


	public ArrayList<Dog> getDogs() {
		return dogs;
	}


	public void addDog(Dog dog) {
		dogs.add(dog);
	}
	
	

}
