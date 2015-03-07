package maps;

public class Rooms {
	
	private int rmID;
	private String rmName;
	private String rmDesc;
	private int exEast;
	private int exSouth;
	private int exWest;
	private int exNorth;
	
	public Rooms(int rID, String rName, String rDesc, int eEast, int eSouth, int eWest, int eNorth) {
		this.rmID = rID;
		this.rmName = rName;
		this.rmDesc = rDesc;
		this.exEast = eEast;
		this.exSouth = eSouth;
		this.exWest = eWest;
		this.exNorth = eNorth;				
	}
	
	public String toStringFull() {
		return "rmID: " + rmID + "\n" + rmName + "\n" + rmDesc + "\nE: " + exEast + "\nS: " + exSouth + 
				"\nW: " + exWest + "\nN: " + exNorth;		
	}
	
	public String toStringDesc() {
		return rmDesc + "\n";
	}
	public int getRmID() {
		return rmID;
	}

	public String getRmName() {
		return rmName;
	}

	public String getRmDesc() {
		return rmDesc;
	}

	public int getExEast() {
		return exEast;
	}

	public int getExSouth() {
		return exSouth;
	}

	public int getExWest() {
		return exWest;
	}

	public int getExNorth() {
		return exNorth;
	}

	// main method for testing purposes
	public static void main(String[] args) {
		int rID = 12345;
		String rName = "Test Room";
		String rDesc = "This is a test room.  It is intended for testing \nwhether this class works as intended";
		int eEast = 900001;
		int eSouth = 900002;
		int eWest = 900003;
		int eNorth = 900004;
		
		Rooms testRoom = new Rooms(rID, rName, rDesc, eEast, eSouth, eWest, eNorth);
		
		System.out.println(testRoom.toStringFull());
	}

}
