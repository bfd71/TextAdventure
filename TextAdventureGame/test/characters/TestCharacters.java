package characters;

public class TestCharacters {
	
	
	// main method for testing purposes	
	public static void main(String[] args) {
		String testName = "Bob the Invincible";
		String testDesc = "A solidly built warrior stands here, towering above all those in \n"
				        + "his vicinity.  He radiates an intimidating power and confidence  \n"
				        + "that confidently itimidates you.";
		int maxHP = 100;
		
		Characters player = new Characters(testName, testDesc, maxHP);
		Characters emptyChar = new Characters();
		
		System.out.println(player.toStringFull());
		System.out.println(emptyChar.toStringFull());
		
	}
	
}
