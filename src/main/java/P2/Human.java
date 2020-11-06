/**
 * 
 */
package P2;

/**
 * @author hannah
 *
 */
public class Human {
	
	private String userName;
	
	private int age;
	
	private int password;
	
	Human() {
		
	}
	
	Human(String userName, int age, int password) {
		this.userName = userName;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return userName;
	}

	public void setName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	

}
