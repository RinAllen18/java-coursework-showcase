/*
 * Name: Corinne Allen
 * Class: CS1150 (M/W)
 * Due: October 15, 2025
 * Description: Assignment #7
 *This program allows a user to compute the volume of 4 different shape types (cube, sphere, cylinder, and rectangular). 
 *The user can continually calculate shape volumes until otherwise specified with a sentinel. The program utilizes four 
 *separate methods in the same class that return volumes for their shape type calculations, and one method to handle 
 *invalid input from the user regarding the shape type selected.
 */

import java.util.Scanner;
public class AllenCorinneAssignment7 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		final int EXIT = 5; // declare sentinel

		//Display heading
		String heading = "*******************************\r\n"
				+ "Welcome to the Volume Program\r\n"
				+ "*******************************\r\n";
		System.out.print(heading);

		//Prompt for shape option and compute volume until user stops
		int shapeOption = getShapeOption(userInput);
		while(shapeOption != EXIT) {
			double volume = 0.0; //initialize volume

			//Determine shape volume calculation and display
			switch (shapeOption) {

			//Cube option
			case 1: 
				System.out.print("Enter a side length: ");
				double sideLength = userInput.nextDouble();
				volume = cubeVolume(sideLength);
				System.out.printf("Cube volume = %5.2f\n", volume);
				break;

				//Sphere option
			case 2: 
				System.out.print("Enter the radius: ");
				double sphereRadius = userInput.nextDouble();
				volume = sphereVolume(sphereRadius);
				System.out.printf("Sphere volume = %5.2f\n", volume);
				break;

				//Cylinder option
			case 3: 
				System.out.print("Enter the radius: ");
				double cylinderRadius = userInput.nextDouble();
				System.out.print("Enter the height: ");
				double cylinderHeight = userInput.nextDouble();
				volume = cylinderVolume(cylinderRadius, cylinderHeight);
				System.out.printf("Cylinder volume = %5.2f\n", volume);
				break;

				//Rectangular option
			case 4: 
				System.out.print("Enter the legnth: ");
				double rectangularLength = userInput.nextDouble();
				System.out.print("Enter the width: ");
				double rectangularWidth = userInput.nextDouble();
				System.out.print("Enter the height: ");
				double rectangularHeight = userInput.nextDouble();
				volume = rectangularPrismVolume(rectangularLength, rectangularWidth, rectangularHeight);
				System.out.printf("Rectangular prism volume = %5.2f\n", volume);	
			}

			shapeOption = getShapeOption(userInput); //determine next loop iteration
		}
		System.out.println("That was mathtastic! Goodbye!");
	}


	//Method to prompt for shape option and handle invalid input
	public static int getShapeOption(Scanner userInput) {
		int option = 0; //initialize

		//Display menu
		String menu = "Option   Shape\r\n"
				+ "-------------------\r\n"
				+ " 1       Cube\r\n"
				+ " 2       Sphere\r\n"
				+ " 3       Cylinder\r\n"
				+ " 4       Rectangular Prism\r\n"
				+ " 5       Exit\r\n";
		System.out.println("");
		System.out.println(menu);

		//Prompt user
		System.out.print("Select a shape to calculate its volume."
				+ " Select option 1, 2, 3, 4 or 5 to exit: ");
		option = userInput.nextInt();

		//Handle invalid input
		while (option < 1 || option > 5) {
			System.out.println(option + " is not a valid entry - "
					+ "please try again. ");
			System.out.print("Select a shape to calculate its volume. "
					+ "Select option 1, 2, 3, 4 or 5 to exit: ");
			option = userInput.nextInt();
		}
		return option;
	}

	//Method to calculate cube volume
	public static double cubeVolume(double side) {
		double volume = Math.pow(side, 3);
		return volume;
	}

	//Method to calculate sphere volume
	public static double sphereVolume(double radius) {
		double volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}

	//Method to calculate cylinder volume
	public static double cylinderVolume(double radius, double height) {
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}

	//Method to calculate rectangular volume
	public static double rectangularPrismVolume(double length, double width, double height) {
		double volume = length * width * height;
		return volume;
	}
}
