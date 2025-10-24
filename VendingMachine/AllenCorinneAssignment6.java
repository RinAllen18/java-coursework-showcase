/*
 * Name: Corinne Allen
 * Class: CS1150 (M/W)
 * Due: October 8, 2025
 * Description: Assignment #6
 * This program simulates a vending a machine by offering a customer snack options (Pop Tarts, Pretzels, and Funyuns). It
 * will then ask the customer how many snacks they would like (the max allowed per transaction is 3). The program will then
 * display a receipt for each snack selected before the program asks for another snack selection. The program also supports
 * shutdown mode for the machine. If the owner would like to shutdown the machine they will enter 999 instead of a snack 
 * selection amount and enter the correct shutdown password. Once shutdown mode it entered the program will print a report
 * on total sales, total count of snacks sold, and total count of each snack sold.
 */
import java.util.Scanner;
public class AllenCorinneAssignment6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		//Declare Constants
		final double POPTART_P = 0.90;
		final double PRETZEL_P = 0.70;
		final double FUNYUNS_P = 1.50;
		final String SHUTDOWN_P = "COOKIES";
		final int SHUTDOWN_C = 999;
		final int MAX_COUNT = 3;
		final int MIN_COUNT = 1;
		
		//Initialize counters/variables referenced in and out of main loop
		double totalSaleAmount = 0.0;
		int totalNumSnackSold = 0;
		int totalPoptartSold = 0;
		int totalPretzSold = 0;
		int totalFunSold = 0;
		boolean inService = true; //initialized so outer loop can be entered
		
		//Outer loop checking for customer mode
		while (inService) {
			
			//Display Menu
			String menu = "*******************************************\r\n"
					+ "              Snack Machine\r\n"
					+ "*******************************************\r\n"
					+ "\r\n"
					+ "Pop Tarts      Pop Tarts     Pop Tarts \r\n"
					+ "1A  $0.90      1B  $0.90     1C  $0.90\r\n"
					+ "--------------------------------------------\r\n"
					+ "Pretzels       Pretzels      Pretzels\r\n"
					+ "2A  $0.70      2B  $0.70     2C  $0.70\r\n"
					+ "--------------------------------------------\r\n"
					+ "Funyuns   	Funyuns  	Funyuns\r\n"
					+ "3A  $1.50      3B  $1.50     3C  $1.50\r\n"
					+ "--------------------------------------------\r\n";
			System.out.println(menu);
			System.out.print("How many snacks would you like? Limit is 3: ");
			int snackCount = input.nextInt(); 
			
			//test for valid snackCount
			while (snackCount < MIN_COUNT || snackCount > MAX_COUNT && snackCount != SHUTDOWN_C) {
				System.out.print("Invalid entry. Enter number between 1 and 3: ");
				snackCount = input.nextInt(); 
			}
			
			//proceed to snack selection
			if (snackCount != SHUTDOWN_C) {
				for(int i = 0; i < snackCount; i++) {
					System.out.print("Enter snack selection: ");
					String snackSelection = input.next().toUpperCase();
					
					//loop to handle invalid snack selection
					while (!snackSelection.equals("1A") && !snackSelection.equals("1B") && !snackSelection.equals("1C")
							&& !snackSelection.equals("2A") && !snackSelection.equals("2B") && !snackSelection.equals("2C")
							&& !snackSelection.equals("3A") && !snackSelection.equals("3B") && !snackSelection.equals("3C")) {
						System.out.print("Invalid entry. Enter 1A-1C, 2A-2C, or 3A-3C: ");
						snackSelection = input.next().toUpperCase();
					}
					
					//Process snack selection and print receipt
					if (snackSelection.equals("1A")) {
						totalPoptartSold ++;
						totalSaleAmount += POPTART_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 1A ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Pop Tarts");
						System.out.println("       Snack Price: 	0.90");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else if (snackSelection.equals("1B")) {
						totalPoptartSold ++;
						totalSaleAmount += POPTART_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 1B ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Pop Tarts");
						System.out.println("       Snack Price: 	0.90");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else if (snackSelection.equals("1C")) {
						totalPoptartSold ++;
						totalSaleAmount += POPTART_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 1C ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Pop Tarts");
						System.out.println("       Snack Price: 	0.90");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else if (snackSelection.equals("2A")) {
						totalPretzSold ++;
						totalSaleAmount += PRETZEL_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 2A ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Pretzels");
						System.out.println("       Snack Price: 	0.70");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else if (snackSelection.equals("2B")) {
						totalPretzSold ++;
						totalSaleAmount += PRETZEL_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 2B ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Pretzels");
						System.out.println("       Snack Price: 	0.70");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else if (snackSelection.equals("2C")) {
						totalPretzSold ++;
						totalSaleAmount += PRETZEL_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 2C ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Pretzels");
						System.out.println("       Snack Price: 	0.70");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else if (snackSelection.equals("3A")) {
						totalFunSold ++;
						totalSaleAmount += FUNYUNS_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 3A ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Funyuns");
						System.out.println("       Snack Price: 	1.50");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else if (snackSelection.equals("3B")) {
						totalFunSold ++;
						totalSaleAmount += FUNYUNS_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 3B ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Funyuns");
						System.out.println("       Snack Price: 	1.50");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					else {
						totalFunSold ++;
						totalSaleAmount += FUNYUNS_P;
						System.out.println("--------------------------------------");
						System.out.println("------------ Selection 3C ------------");
						System.out.println("--------------------------------------");
						System.out.println("       Snack Item:      Funyuns");
						System.out.println("       Snack Price: 	1.50");
						System.out.println("--------------------------------------");
						System.out.println("     Thank you for your business!");
						System.out.println("--------------------------------------");
						System.out.println("");
					}
					totalNumSnackSold ++;
					
				}
			} 
			//Prompt for password and shutdown
			else { 
				System.out.print("Enter Password: ");
				String password = input.next();
				if (password.equalsIgnoreCase(SHUTDOWN_P)) {
					inService = false;
				} 
				else {
					System.out.println("Invalid password ");
					System.out.println("");
				}
			}
		}
		//Shutdown mode report
		System.out.println("");
		System.out.printf("Total Sales = $%4.2f\n", totalSaleAmount);
		System.out.println("Total Number Snacks Sold = " + totalNumSnackSold);
		System.out.println(totalPoptartSold + " Poptarts");
		System.out.println(totalPretzSold + " Pretzels");
		System.out.println(totalFunSold + " Funyuns");
		
		input.close();
	}
}
