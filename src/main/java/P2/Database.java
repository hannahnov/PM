package P2;

import java.util.ArrayList;

public class Database {
	
	public ArrayList <Owner> owners = new ArrayList<>();
	
	public ArrayList <Runner> runners = new ArrayList<>();
	
	public ArrayList <Pairing>	pairings = new ArrayList<>();
	
	public ArrayList <Dog> dogs = new ArrayList<>();

	public Database() {
	
	}
	
	
	public void addOwner(Owner owner) {
		owners.add(owner);
	}
	
	public void addRunner(Runner runner) {
		runners.add(runner);
	}
	
	public void addPairing(Pairing pairing) {
		pairings.add(pairing);
	}
	
	public void addDog(Dog dog) {
		dogs.add(dog);
	}
	
	public Dog getDog(int index) {
		return dogs.get(index);
	}
	
	public Owner getOwner(int index) {
		return owners.get(index);
	}
	
	public Runner getRunner(int index) {
		return runners.get(index);
	}
	
	public Pairing getPairing(int index) {
		return pairings.get(index);
	}
	public void clearDatabase() {
		pairings.clear();
		runners.clear();
		owners.clear();
	}

}
