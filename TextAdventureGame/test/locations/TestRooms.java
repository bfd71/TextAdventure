package locations;

public class TestRooms {
	
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
