package P2;

import java.util.HashSet;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MatcherTest {
	
	Database data = new Database();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		Owner owner = new Owner();
		Dog dog = new Dog("Huck", owner, 2, true);
		owner.setName("hmnov");
		owner.setAge(22);
		owner.setPassword(1234);
		owner.addDog(dog);
				
		Runner runner = new Runner();
		runner.setAge(39);
		runner.setName("catt");
		runner.setPassword(234);
		runner.setSkillLevel(2);
		runner.changeRunnerAvailability(true);
		
		Pairing pairing = new Pairing(dog, runner);
		
		data.addDog(dog);
		data.addOwner(owner);
		data.addRunner(runner);
		data.addPairing(pairing);
	}

	@After
	public void tearDown() throws Exception {
		
		data.clearDatabase();
		
	}
	

	@Test
	public void findMatchForRunnerTest() {
		Owner owner = new Owner();
		Dog dog = new Dog("Huck", owner, 2, true);
		owner.setName("hmnov");
		owner.setAge(22);
		owner.setPassword(1234);
		owner.addDog(dog);
		data.addDog(dog);
				
		Runner runner = new Runner();
		runner.setAge(39);
		runner.setName("catt");
		runner.setPassword(234);
		runner.setSkillLevel(2);
		runner.changeRunnerAvailability(true);
		data.addRunner(runner);
		
		Matcher testMatcher = new Matcher();
		
		Pairing pair = testMatcher.findMatchForRunner(runner, data);
		assert(pair.getDog().getDogName() == dog.getDogName());
		assert(pair.getRunner().getName() == runner.getName());
				}
	
	@Test
	public void findMatchForOwnerTest() {
		
		Owner owner = new Owner();
		Dog dog = new Dog("Huck", owner, 2, true);
		owner.setName("hmnov");
		owner.setAge(22);
		owner.setPassword(1234);
		owner.addDog(dog);
		data.addDog(dog);
		data.addOwner(owner);
				
		Runner runner = new Runner();
		runner.setAge(39);
		runner.setName("catt");
		runner.setPassword(234);
		runner.setSkillLevel(2);
		runner.changeRunnerAvailability(true);
		data.addRunner(runner);
		
		Matcher testMatcher = new Matcher();
		
		Pairing pair = testMatcher.findMatchForOwner(owner, data);
		assert(pair.getDog().getDogOwner().getName() == owner.getName());
		
		
	}

}
