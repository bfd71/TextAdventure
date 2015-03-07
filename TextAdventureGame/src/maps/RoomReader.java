package maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RoomReader {
	
	// name of file to open
	private String fileName = "RoomTestFile.txt";
	private String line = null;
	private String roomEnds = "xxx"; // end of individual rooms in txt file
	private String fileEnds = "END OF FILE";
	private int indexPos = 8;
	private ArrayList<Rooms> rooms = new ArrayList<Rooms>();
	private int rID;
	private String rName;
	private String rDesc;
	private int eEast;
	private int eSouth;
	private int eWest;
	private int eNorth;
	
	
	public RoomReader() {
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fileReader);
			
			line = br.readLine();
			while(!line.equals(fileEnds)) {				
				if (line.contains("rmID")) {
					rID = Integer.parseInt(line.substring(8).trim());
				} else if (line.contains("rmName")){
					rName = line.substring(indexPos);					
				} else if (line.contains("rmDesc")){
					rDesc = line.substring(indexPos);
					rDesc = wrapText(rDesc);
				} else if (line.contains("exEast")){					
					eEast = Integer.parseInt(line.substring(indexPos).trim());
				} else if (line.contains("exSouth")){					
					eSouth = Integer.parseInt(line.substring(indexPos).trim());
				} else if (line.contains("exWest")){					
					eWest = Integer.parseInt(line.substring(indexPos).trim());
				} else if (line.contains("exNorth")){					
					eNorth = Integer.parseInt(line.substring(indexPos).trim());
				} else if (line.equals(roomEnds)) {
					Rooms newRoom = new Rooms(rID, rName, rDesc, eEast, eSouth, eWest, eNorth);
					rooms.add(newRoom);
				}
				
				line = br.readLine();				
			}			
			
			// Always close files.
            br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException e) {
			System.out.println("Error reading file '" + fileName + "'");
			//e.printStackTrace();
		}
	}
	
	public ArrayList<Rooms> getRoomsList() {				
		return rooms;
	}
	
	public String wrapText(String text) {
		int lineLength = 40;
		StringBuilder sb = new StringBuilder(text);
		
		int i = 0;
		while (i + lineLength < sb.length() && (i = sb.lastIndexOf(" ", i + lineLength)) != -1) {
			sb.replace(i, i + 1, "\n");
		}
		
		return sb.toString();
	}

	// main method for testing purposes
	public static void main(String[] args) {		
		RoomReader roomReader = new RoomReader();
		//System.out.println(new File(".").getAbsolutePath());
		ArrayList<Rooms> allRooms = roomReader.getRoomsList();
		
		/*for (Rooms room : allRooms) {
			System.out.println(room.toStringFull());
		}*/
		
		roomReader.wrapText("This is the starting point for this experiment.  There are four exits from this room.");
	}

}
