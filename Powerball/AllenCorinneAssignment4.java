/*
 * Name: Corinne Allen
 * Class: CS1150 (M/W)
 * Due: Sept 24, 2025
 * Description: Assignment #4
 * This program allows a user to participate in a Powerball as a player. 
 * The program prompts the player to choose two letters and one number; this 
 * will create their selection ticket. The program then generates its own ticket 
 * with a random assortment of 2 letters and one number. To determine if the 
 * player won the Powerball lottery the program compares the user’s ticket to  
 * the randomly generated ticket.
 */

import java.util.Scanner;
public class AllenCorinneAssignment4 {

	public static void main(String[] args) {
		
		//Establish Scanner
		Scanner input = new Scanner(System.in);
		
		//Establish Constants
		final char MIN_CHAR = 65;
		final char MAX_CHAR = 90;
		final int REQ_LENGTH = 2;
		final int MIN_POWB = 1;
		final int MAX_POWB = 10;
		
		//Display Powerball menu
		System.out.println("CS1150 Powerball Lottery Game");
		System.out.println("----------------------------------------------------------------");
		//Using Text block taught in this assignments required reading chapter 4.7
		String chances = """
				Match 2 Letters: and Powerball Number: Win Jackpot
				Match Only 2 Letter:                  \sWin $100.00
				Match Only 1 Letter:                  \sWin $40.00
				Match Only Powerball Number:          \sWin $20.00
				""";
		System.out.println(chances);
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		//Prompt user to enter letter choices
		System.out.print("Enter 2 letters between A and Z with no space between the letters: ");
		String playerLetters = input.nextLine().toUpperCase();
		
		//Validate string is only two characters long (outter if)
		if (playerLetters.length() == REQ_LENGTH) {
			char playerCh1 = playerLetters.charAt(0);
			char playerCh2 = playerLetters.charAt(1);
			
			//Validate chracters are in the range for capital letters
			if (playerCh1 >= MIN_CHAR && playerCh1 <= MAX_CHAR && 
					playerCh2 >= MIN_CHAR && playerCh2 <= MAX_CHAR) {
				//Prompt user to choose an integer between 1 and 10
				System.out.print("Enter 1 Powerball number between 1 and 10: ");
				int playerNum = input.nextInt();
				System.out.println(""); //Looks better in console
				
				//Validate users integer is in the 1 to 10 range
				if (playerNum >= MIN_POWB && playerNum <= MAX_POWB) {
					String playerTicket = playerCh1 + " " + playerCh2 + " " + playerNum;
					
					//Generate random ticket
					char winCh1 = (char)(65 + Math.random() * 26);
					char winCh2 = (char)(65 + Math.random() * 26);
					int winNum = (int)(1 + Math.random() * 10);
					String winTicket = winCh1 + " " + winCh2 + " " + winNum;
					
					//Display tickets
					System.out.println("Player Lottery Ticket");
					System.out.println(playerTicket);
					System.out.println(" ");
					System.out.println("Powerball Ticket");
					System.out.println(winTicket);
					System.out.println(" "); //Looks better in the console
					
					//Test results (multi-way if)
					if (winTicket.equals(playerTicket)) {
						System.out.println("Your ticket matched the Powerball ticket! Jackpot!!");
					}
					else if (playerCh1 == winCh1 && playerCh2 == winCh2) {
						System.out.println("Your ticket matched 2 letters with Powerball ticket! You win $100.00!");
					}
					// this allows a win even if the matching char is in a different string index
					else if (playerCh1 == winCh1 || playerCh1 == winCh2 || playerCh2 == winCh1 || playerCh2 == winCh2) 
					{
						System.out.println("Your ticket matched at least 1 letter! You win $40.00!");
					}
					else if (playerNum == winNum) {
						System.out.println("Your ticket matched the Powerball number! You win $20.00! ");
					}
					else {
						System.out.println("Sorry, no match. You did not win.");
					}
				}
				else {
					System.out.println("Invalid entry. " + playerNum + " is not a number between 1 and 10.");
			}	
		}
		else {
			System.out.println("Invalid entry. " + playerLetters + " is not 2 letters between A and Z.");
		}
		
	}
		else {
			System.out.println("Invalid entry. " + playerLetters + " is not 2 letters between A and Z.");
		}
		
		//close scanner
		input.close();
	}
}
