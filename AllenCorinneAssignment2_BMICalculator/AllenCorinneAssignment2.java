/*
 * Name: Corinne Allen
 * Class:CS1150 (M/W)
 * Due: Sept 10, 2025
 * Description: Assignment #1
 * This program is a BMI calculator that recieves input from the user and outputs their BMI, what
 * their BMI would be if their weight increased/decreased by 5, 10, and 15 pounds, and what the BMI
 * values from the Department of Health are. Output in displayed in a table. Inputs include end user's
 * name, height in feet, height in inches, and current weight in pounds.
 */
import java.util.Scanner;
public class AllenCorinneAssignment2 {

	public static void main(String[] args) {
		// utilizing a scanner
		Scanner input = new Scanner(System.in); 
		
		//Display and recieve "User Information"
		System.out.println("User Information");
		System.out.println("-----------------------");
		// prompt user's name input
		System.out.print("Enter your name: ");
		String name = input.nextLine(); 
		//prompt user's weight input
		System.out.print("Enter your weight in pounds: ");
		double weightPounds = input.nextDouble();
		//prompt user's height in feet input
		System.out.print("Enter your height in feet: ");
		double heightFeet = input.nextDouble();
		//prompt user's height in inches
		System.out.print("Enter your height in inches: ");
		double heightInches = input.nextDouble();
		
		//calculate height in total inches
		double heightTotalInches = heightFeet * 12 + heightInches;
		//create constant for 703 which is in the BMI conversion formula
		final int CON = 703;
		//Calculate BMI for current weight
		double currentBmi = CON * weightPounds / (heightTotalInches * heightTotalInches);
		
		//Calculate BMI for increase of weight by 5 pounds
		double bmiIncreaseS = CON * (weightPounds + 5) / (heightTotalInches * heightTotalInches);
		//Calculate BMI for increase of weight by 10 pounds
		double bmiIncreaseM = CON * (weightPounds + 10) / (heightTotalInches * heightTotalInches);
		//Calculate BMI for increase of weight by 15 pounds
		double bmiIncreaseL = CON * (weightPounds + 15) / (heightTotalInches * heightTotalInches);
		
		//Calculate BMI for decrease of weight by 5 pounds
		double bmiDecreaseS = CON * (weightPounds - 5) / (heightTotalInches * heightTotalInches);
		//Calculate BMI for decrease of weight by 10 pounds
		double bmiDecreaseM = CON * (weightPounds - 10) / (heightTotalInches * heightTotalInches); 
		//Calculate BMI for decrease of weight by 15 pounds
		double bmiDecreaseL = CON * (weightPounds - 15) / (heightTotalInches * heightTotalInches);
		
		//Display Results
		System.out.println("                    ");
		System.out.println("***********************************************");
		System.out.println("          Body Mass Index Calculator            ");
		System.out.println("                    ");
		System.out.println("          Name:   " + name);
		System.out.println("          Weight: " + weightPounds + " pounds");
		System.out.println("          Height: " + heightTotalInches + " inches");
		System.out.println("                    ");
		System.out.println("---------------------------------------------");
		System.out.println("        Weight               BMI");
		System.out.println("---------------------------------------------");
		System.out.printf("\t%6.2f  \t%6.2f", weightPounds - 15, bmiDecreaseL);
		System.out.printf("\n\t%6.2f  \t%6.2f", weightPounds - 10, bmiDecreaseM);
		System.out.printf("\n\t%6.2f  \t%6.2f", weightPounds - 5, bmiDecreaseS);
		System.out.printf("\n\t%6.2f  \t%6.2f", weightPounds, currentBmi);
		System.out.print("(current weight)");
		System.out.printf("\n\t%6.2f  \t%6.2f", weightPounds + 5, bmiIncreaseS);
		System.out.printf("\n\t%6.2f  \t%6.2f", weightPounds + 10, bmiIncreaseM);
		System.out.printf("\n\t%6.2f  \t%6.2f", weightPounds + 15, bmiIncreaseL);
		System.out.println("                    ");
		System.out.println("----------------------------------------------");
		System.out.println("      BMI Values from Department of Health");
		System.out.println("         Underweight: less than 18.5");
		System.out.println("         Normal:      18.5 to 25");
		System.out.println("         Overweight:  greater than 25");
		
		//closing scanner input
		input.close();
		
		
		
		
		
	/*	Playing with format specifiers and testing variables
	 * System.out.println(name);
		System.out.println(weightPounds);
		System.out.println(heightTotalInches);
		System.out.println(CON);
		System.out.printf("%6.2f%n" , currentBmi);
		
	    System.out.printf("%6.2f%n" , bmiIncreaseS);
		System.out.printf("%6.2f%n" , bmiIncreaseM);
		System.out.printf("%6.2f%n" , bmiIncreaseL);
		
		System.out.printf("%6.2f%n" , bmiDecreaseS);
		System.out.printf("%6.2f%n" , bmiDecreaseM);
		System.out.printf("%6.2f\n" , bmiDecreaseL);*/
	}

}
