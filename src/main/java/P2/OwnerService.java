package P2;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class OwnerService {

	private static Logger log = Logger.getRootLogger();
	public OwnerService() {
		
	}
	
	public String askName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username");
		String name = sc.next();
		return name;
	}
	
	public int askOwnerID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your password");
		
		int ID = sc.nextInt();
		return ID;
	}
	
	public int askNumDogs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many dogs do you have?");
			int numDogs = sc.nextInt();
			return numDogs;
	}
	
	public String askDogName(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter dog " + (i + 1) + "'s name"); 
		String name = sc.next();
		return name;
	}
	
	
	
	public int askDogLevel(int i) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter dog " + (i + 1) + "'s skill level \n 1: BEGINNER, 2: INTERMEDIATE, 3: EXPERT");	
		int skillLevel = sc.nextInt();
		
		return skillLevel;
	}
	
	public Owner logOwnerIn(Database data, String username, int password) {
		int p = data.owners.size();
		
		for (int i = 0; i < data.owners.size(); i++) {
			String user = data.getOwner(i).getName();
			int pass = data.getOwner(i).getPassword();
			if (user.compareTo(username) == 0) {
				if (pass == password) {
				System.out.println("Signed in.");
				return data.getOwner(i);
			}
			}
		}
		System.out.println("Invalid username or password");
		log.info("User not found");
		return null;
		
	}
		
	//Creates a new owner with given information. Adds new owner and their dogs to database
	public Owner createOwner(Database data) {
		OwnerService ownerS = new OwnerService();
		Owner owner = new Owner();
		owner.setName(ownerS.askName());
		owner.setPassword(askOwnerID());
		owner.setNumDogs(askNumDogs());
		for (int i = 0; i < owner.getNumDogs(); i++) {
			Dog dog = new Dog();
			dog.setDogName(askDogName(i));
			dog.setDogOwner(owner);
			dog.setSkillLevelDog(askDogLevel(i));
			dog.changeDogAvailability(true);
			owner.addDog(dog);
			log.info("dog added to owner.dogs()");
			data.dogs.add(dog);
			log.info("dog added to database.dogs()");
		}
		data.addOwner(owner);
		log.info("Owner added to database.owners()");
		System.out.println("Account created");
		return owner;
	}

}
