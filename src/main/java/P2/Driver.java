package P2;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Driver {
	
		private static Scanner scan = new Scanner(System.in);
		
		private static Logger log = Logger.getRootLogger();
		
		static Database data = new Database();
	
		public static void main(String args[]) {
			
			log.info("Program has started");
			
			int userInput;
			
			do {
			
			System.out.println("Please choose one of the following");
			System.out.println("[1] I am a dog owner");
			System.out.println("[2] I am a runner");
			System.out.println("[3] Exit");
			
			userInput = scan.nextInt();
			if (userInput == 2) {
				RunnerService runnerServer = new RunnerService();
				Runner runner = new Runner();
				System.out.println("Do you already have an account with us?");
				System.out.println("[1] Yes");
				System.out.println("[2] No");
				
				userInput = scan.nextInt();
				if (userInput == 1) {
					do {
					runner = runnerServer.logRunnerIn(data, runnerServer.askName(), runnerServer.askRunnerID());
					} while (runner == null);
				}
				if (userInput == 2) {
			
					runner = runnerServer.createRunner(data);
				}
				System.out.println("Would you like to be matched today?");
				System.out.println("[1] Yes");
				System.out.println("[2] No, just put me in the database.");
				userInput = scan.nextInt();
				
				if (userInput == 1) {
					
					Matcher matcher = new Matcher();
					matcher.findMatchForRunner(runner, data);
					
				}
				userInput = 2;
			}
			if (userInput == 1) {
				OwnerService ownerServer = new OwnerService();
				Owner owner = new Owner();
				System.out.println("Do you already have an account with us?");
				System.out.println("[1] Yes");
				System.out.println("[2] No");
				
				userInput = scan.nextInt();
				if (userInput == 1) {
					do {
					owner = ownerServer.logOwnerIn(data, ownerServer.askName(), ownerServer.askOwnerID());
					}while (owner == null);
				}
				if (userInput == 2) {
				
				 owner = ownerServer.createOwner(data);
				}
			
			System.out.println("Would you like to be matched today?");
			System.out.println("[1] Yes");
			System.out.println("[2] No, just put me and my dog in the database.");
			userInput = scan.nextInt();
			
			if (userInput == 1) {
				Matcher matcher = new Matcher();
				matcher.findMatchForOwner(owner, data);
			}
			}
			}

			 while (userInput!= 3);
			 log.info("Program has ended");
			
	}
	

}

