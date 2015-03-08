package characters;

public class Characters {
	
	private String name;
	private String description;
	private int maxHitPoints;
	private int currentHitPoints;
	
	public Characters(String name, String desc, int mHP) {
		this.name = name;
		this.description = desc;
		this.maxHitPoints = mHP;
		this.currentHitPoints = this.maxHitPoints;
	}

	public Characters() {
		this("NO NAME", "NO DESCRIPTION", 1);
	}

	public int getMaxHitPoints() {
		return maxHitPoints;
	}

	public void setMaxHitPoints(int maxHitPoints) {
		this.maxHitPoints = maxHitPoints;
	}

	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public String toStringFull() {
		return "Name: " + this.name + "\nDescription: " + this.description + "\nMax HP: " + this.maxHitPoints +
				"\nCurrent HP: " + this.currentHitPoints + "\n";
	}
	
}
