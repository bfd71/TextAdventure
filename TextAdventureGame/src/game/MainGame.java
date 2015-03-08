package game;

import java.util.ArrayList;
import java.util.Scanner;

import locations.RoomReader;
import locations.Rooms;

public class MainGame {
	
	private static ArrayList<Rooms> roomsList;
	private static int startingRoom = 10000;
	private static int noExit = 99999;
	
	public static void main(String[] args) {
		roomsList = new ArrayList<Rooms>(); // AL to hold all the Rooms
		RoomReader rooms = new RoomReader(); // import rooms from text file through RoomReader
		roomsList = rooms.getRoomsList(); // get AL of rooms from RoomReader
		
		MainGame.currentRoom(startingRoom);
		
	}
	
	public static void currentRoom(int rmNumber) {
		int rmID = rmNumber;
		String rmName = null;
		String rmDesc = null;
		int eEast = noExit;
		int eSouth = noExit;
		int eWest = noExit;
		int eNorth = noExit;
		String command = "";
		Scanner kb = new Scanner(System.in);
		
		
		// get the details for the current room from room in roomsList
		for (Rooms room : roomsList) {
			if (rmID == room.getRmID()){
				rmName = room.getRmName();
				rmDesc = room.getRmDesc();
				eEast = room.getExEast();
				eSouth = room.getExSouth();
				eWest = room.getExWest();
				eNorth = room.getExNorth();						
			}
		}
		
		// create a string of current valid exits for command line
		int[] exitValue = {eEast, eSouth, eWest, eNorth};
		String[] exitStr = {"[e]ast", "[s]outh", "[w]est", "[n]orth"};
		String currentExits = "";
		for (int i = 0; i < exitValue.length; i++) {
			if (exitValue[i] != noExit) {
				currentExits = currentExits + exitStr[i] + ", ";
			}
		}				
		
		// print starting point location
		System.out.println(rmName);
		System.out.println(rmDesc);
		
		// process game movement
		while (!command.equalsIgnoreCase("q")) {
			String exitError = "You can't go that way.";
			
			// print commands
			System.out.print("Command: [l]ook, " + currentExits + "[q]quit\n");
			
			command = kb.nextLine();
			
			// determine command and execute
			switch(command.toLowerCase()) {
				case "l":
					System.out.println(rmName);
					System.out.println(rmDesc);
					break;
					
				// changes current location	
				case "e": case "s": case "w": case "n":
					if ((command.equals("e")) && (eEast != noExit)) {
						currentRoom(eEast);
					} else if ((command.equals("s")) && (eSouth != noExit)) {
						currentRoom(eSouth);
					} else if ((command.equals("w")) && (eWest != noExit)) {
						currentRoom(eWest);
					} else if ((command.equals("n")) && (eNorth != noExit)) {
						currentRoom(eNorth);
					} else {
						System.out.println(exitError);
					}
					break;		
				case "q":
					System.out.println("\nOk, see you next time.");
					System.exit(0);
					break;
				default:
					System.out.println("Try again.");
					break;					
			}
		}		
		
		kb.close();		
	}
}
