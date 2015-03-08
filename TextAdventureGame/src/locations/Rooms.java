package locations;

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
}
