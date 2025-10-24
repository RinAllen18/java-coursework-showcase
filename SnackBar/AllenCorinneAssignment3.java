/*
 * Name: Corinne Allen
 * Class: CS1150 (M/W)
 * Due: Sept 117, 2025
 * Description: Assignment #3
 * This program displays a snack bar menu and allows the user to input their selection
 * of menu item, drink size, and discount type. The program then displays their menu selections
 * and provides them the cost of their selection, the amount of discount they will recieve, the
 * tax on their total, and their final total after the discount and taxes are applied. This
 * program also handels invalid input in various ways depending on the prompt.
*/


import java.util.Scanner;

public class AllenCorinneAssignment3 {

	public static void main(String[] args) {
		// use scanner
		Scanner input = new Scanner(System.in); 
		
		//establish constants for menu options
		final double SAND_CH_SMDRINK = 15.50;
		final double SAND_CH_LRDRINK = 17.50;
		final double SAND_BR_SMDRINK = 14.00;
		final double SAND_BR_LRDRINK = 16.00;
		final double SMDRINK = 5.75;
		final double LRDRINK = 7.75;
		final double taxes = 7.5 / 100;
		
		//display menu
		System.out.println("Welcome to the Nissan Stadium's Snack Attack Bar");
		System.out.println("    ");
		System.out.println("Option Snack                   Small Drink   Large Drink");
		System.out.println("----------------------------------------------------------");
		System.out.println("1      Sandwich/Chip/Drink     $15.50        $17.50");
		System.out.println("2      Sandwich/Brownie/Drink  $14.00        $16.00");
		System.out.println("3      Drink                   $5.75         $7.75");
		System.out.println(" ");
		
		//prompt menu selection
		System.out.print("What snack would you like? Select option 1, 2, or 3: ");
		int menuChoice = input.nextInt();
		
		//outter if menu choice is valid
		if (menuChoice >= 1 && menuChoice <= 3) {
			System.out.print("What drink size do you want? Enter 1 for small, or 2 for large: ");
			int drinkSize = input.nextInt();
			
			//if drink size is valid
			if (drinkSize == 1 || drinkSize == 2) {
				System.out.print("Are you a student or a military member? Enter 1 for college, 2 for military, 3 for neither: ");
				int discountType = input.nextInt();
				double discountRate = 0.0;
				//if-else discount rate is valid		
				if (discountType >= 1 && discountType <= 3) {
					if (discountType == 1) {
						discountRate = 0.10;
						}
					 if (discountType == 2) {
						discountRate = 0.15;
						}
					 if (discountType == 3) {
						discountRate = 0.0;
					 }
					//Initializing variables for menu choice cost and menu choice name
					double menuChoiceCost = 0.0;
					String menuChoiceName = "";
					
					// set menu choice cost and name based on user selections
					if (menuChoice == 1 && drinkSize == 1) {
						menuChoiceCost =  SAND_CH_SMDRINK;
						menuChoiceName = "Sandwich/Chip/Drink";
					}
					if (menuChoice == 1 && drinkSize ==2) {
						menuChoiceCost = SAND_CH_LRDRINK;
						menuChoiceName = "Sandwich/Chip/Drink";
					}
					if (menuChoice == 2 && drinkSize == 1) {
						menuChoiceCost = SAND_BR_SMDRINK;
						menuChoiceName = "Sandwich/Brownie/Drink";
					}
					if (menuChoice == 2 && drinkSize == 2) {
						menuChoiceCost = SAND_BR_LRDRINK;
						menuChoiceName = "Sandwich/Brownie/Drink";
					}
					if (menuChoice == 3 && drinkSize == 1) {
						menuChoiceCost = SMDRINK;
						menuChoiceName = "Drink";
					}
					if (menuChoice == 3 && drinkSize == 2 ) {
						menuChoiceCost = LRDRINK;
						menuChoiceName = "Drink";
					}
					
					// Display menu choice cost
					System.out.println(" ");
					System.out.println("Snack Attack Bar Reciept");
					System.out.println("-------------------------------------");
					// why is this so weird???
					System.out.printf("%s\t\t$%5.2f\n",menuChoiceName, menuChoiceCost);
					//Compute and display savings
					double discountAmount = menuChoiceCost * discountRate;
					System.out.printf("Reduction\t\t$%10.2f\n", discountAmount);
					
					//Compute and display tax
					double tax = (menuChoiceCost - discountAmount) * taxes;
					System.out.printf("Tax\t\t\t$%10.2f\n", tax);
					
					//Compute and display final cost after discount and tax
					double finalCost = menuChoiceCost - discountAmount + tax;
					System.out.println("-------------------------------------");
					System.out.printf("Total\t\t\t$%10.2f", finalCost);
					}
				else {
					//invalid discount type
					System.out.println ("Whoops! looks like " + (discountType) + " isn't an option please try again. Go Titans!");
				}
			}
			//else invalid drink input
			else { 
				System.out.println(drinkSize + " is not a an option, please try again. Go Titans!");
			}
		}
		//else invalid menu option
		else {
			System.out.println(menuChoice + " is not a an option, please try again. Go Titans!");
		}
		//close scanner
		input.close();
	}
}
