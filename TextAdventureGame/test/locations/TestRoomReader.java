package locations;

import java.util.ArrayList;
import locations.RoomReader;

public class TestRoomReader {

	// main method for testing purposes
	public static void main(String[] args) {		
		RoomReader roomReader = new RoomReader();
		//System.out.println(new File(".").getAbsolutePath());
		ArrayList<Rooms> allRooms = roomReader.getRoomsList();
		
		for (Rooms room : allRooms) {
			System.out.println(room.toStringFull());
		}
		
		//roomReader.wrapText("This is the starting point for this experiment.  There are four exits from this room.");
	}

}
