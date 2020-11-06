package P2;

public class Runner extends Human {

	//runners and dogs with similar skill levels will be matched
	private int skillLevel;
	
	private boolean isAvailable;
	
	
	public Runner() {
		
	}
	
	public Runner(int skillLevel, boolean isAvailable) {
		this.skillLevel = skillLevel;
		this.isAvailable = isAvailable;
	}
	
	public int getSkillLevel() {
		return this.skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	public boolean isRunnerAvailable() {
		return isAvailable;
	}

	public void changeRunnerAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	
}
