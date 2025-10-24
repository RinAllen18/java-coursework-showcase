/*
 * Name: Corinne Allen
 * Class: CS1150 (M/W)
 * Due: October 1, 2025
 * Description: Assignment #5
 * This program that allows a coffee shop owner to input multiple sale amounts that each of his stores 
 * accomplished. The program will read the input individually and test each amount against a sentinel value
 * The loop will determine and display how many sales were in each monetary amount range; determine and 
 * display the smallest and largest sale in the sequence; display a bar chart that represents how large the
 * sales were for each store (in increments of $100); determine and display the total count of sales, the 
 * sum of sales, and the average of all sales.
 */
import java.util.Scanner; 
public class AllenCorinneAssignment5 {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner input = new Scanner(System.in);
		
		//Decalre constants
		final double SENTINEL = -1;
		final double LOW_RANGE = 500;
		final double MID_RANGE = 2000;
		final int MONEY_PER_STAR = 100;
		
		//intialize variables used inside and only outside loop and not depandant on 
		double totalSaleAmount = 0;
		int totalSaleCount = 0;
		int lowRangeCount = 0;
		int midRangeCount = 0;
		int highRangeCount = 0;
		
		//Prompt user
		System.out.print("Enter sales from all coffee shops, end input by entering -1: ");
		double sale = input.nextDouble();
		System.out.println();
		
		//Determine if input is valid and has sales to report on
		if (sale == SENTINEL) {
			System.out.println("No sales amounts entered except -1");
		}
		else {
			//Initialize variables dependant on input
			double smallSale = sale;
			double largeSale = sale;
			int saleNum = 1;
			
			//Outer loop for sales if the sentinel isn't the first entry
			while (sale != SENTINEL) {
				totalSaleAmount = sale + totalSaleAmount;
				totalSaleCount = totalSaleCount + 1;
				
				//Determine ranges
				if (sale < LOW_RANGE) {
					lowRangeCount = lowRangeCount + 1;
				}
				else if (sale <= MID_RANGE) {
					midRangeCount = midRangeCount + 1;
				}
				else {
					highRangeCount = highRangeCount + 1;
				}
				
				//Determine smallest and largest sales
				if (sale < smallSale) {
					smallSale = sale;
				}
				if (sale > largeSale) {
					largeSale = sale;
				}
				
				//Bar chart pre-game
				System.out.print("Sale #" + saleNum + ": ");
				int bar = (int) (sale / MONEY_PER_STAR);
				int starCount = 0;
				
				//Nested bar chart while to print bar length
				for ( ; starCount < bar; starCount = starCount + 1) {
					System.out.print("*");
				}
				//Prep for next outer loop iteration 
				System.out.println();
				saleNum = saleNum + 1;
				sale = input.nextDouble();
			}
			//Calculate average
			double average = (totalSaleAmount / totalSaleCount);
			System.out.println();
			
			//Display statistics
			System.out.printf("Number of sales            = %d\n", totalSaleCount);
			System.out.printf("Smallest sale amount       = %.1f\n", smallSale);
			System.out.printf("Largest sale amount        = %.1f\n", largeSale);
			System.out.printf("Total of all sales amount  = %.1f\n", totalSaleAmount);
			System.out.printf("Average                    = %.2f\n", average);
			System.out.println();
			
			//Display sale ranges
			System.out.printf("Number of sale amounts less than $500         = %d\n", lowRangeCount);
			System.out.printf("Number of sale amounts between $500 and $2000 = %d\n", midRangeCount);
			System.out.printf("Number of sale amounts more than $2000        = %d\n", highRangeCount);
		}
		//close scanner
		input.close();
	}

}
