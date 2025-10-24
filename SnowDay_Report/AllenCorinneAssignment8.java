/*
 * Name: Corinne Allen
 * Class: CS1150 (M/W)
 * Due: October 29, 2025
 * Description: Assignment #8
 * 
 * This program uses arrays, loops, if statements, and methods to display 
 * yearly snow amount for 7 different ski resorts; calculate and display the
 * total snow amount for all 7 resorts; calculate and display the average snow
 * amount of all 7 resorts; determine and display the resort with the most
 * snow yearly; and finally display resorts with snowfall averages above the 
 * overall average.
 */
public class AllenCorinneAssignment8 {

	public static void main(String[] args) {

		// create resort and amounts arrays
		String[] resorts = { "Vail", "Steamboat", "Wolf Creek", "Keystone", "Breckenridge", "Telluride", "Purgatory" };
		double[] snowAmounts = { 189.2, 154.4, 430.2, 159.9, 184.6, 167.7, 260.2 };

		// display resorts and snow amounts
		displaySnowFallAmount(resorts, snowAmounts);

		// calculate and display total snowfall for all resorts
		double totalSnowfall = computeTotalSnowfall(snowAmounts);
		System.out.printf("The total snowfall for all resorts is %.2f\n", totalSnowfall);

		// calculate and display the average snowfall amount
		double avgSnowfall = computeAvgSnowfall(snowAmounts);
		System.out.printf("The average snowfall for all resorts is %.2f\n", avgSnowfall);
		System.out.println("");

		// determine and print the resort with the most snowfall
		int mostSnowfallIndex = findResortWithMostSnowfall(snowAmounts);
		String mostSnowfallResort = resorts[mostSnowfallIndex];
		double mostSnowfallAmount = snowAmounts[mostSnowfallIndex];
		System.out.println("The ski resort with the most snow is " + mostSnowfallResort + " with " + mostSnowfallAmount
				+ " inches per year");
		System.out.println("");
		// determine and print the resorts with snowfall amounts above the average

		displayResortsWithAboveAvgSnowfall(resorts, snowAmounts, avgSnowfall);

	}

	// method to display resort snowfall amounts.
	public static void displaySnowFallAmount(String[] resorts, double[] snowAmounts) {
		String resortHeading = "------------------------------------\r\n" + "Resort        Yearly Snowfall\r\n"
				+ "------------------------------------\r\n";
		System.out.print(resortHeading);
		for (int i = 0; i < snowAmounts.length; i++) {
			System.out.printf("%-13s %6.2f\n", resorts[i], snowAmounts[i]);
		}
		System.out.println("");
	}

	// method to compute and return the total snow amount of all resorts.
	public static double computeTotalSnowfall(double[] snowAmounts) {
		double totalAmount = 0;
		for (int i = 0; i < snowAmounts.length; i++) {
			totalAmount += snowAmounts[i];
		}
		return totalAmount;
	}

	// method to compute and return average snow amounts for all resorts.
	public static double computeAvgSnowfall(double[] snowAmounts) {
		double avg = computeTotalSnowfall(snowAmounts) / snowAmounts.length;
		return avg;
	}

	// method to find the resort with the most snow, returns the index of that
	// resort.
	public static int findResortWithMostSnowfall(double[] snowAmounts) {
		double max = snowAmounts[0];
		int maxIndex = 0;
		for (int i = 1; i < snowAmounts.length; i++) {
			if (snowAmounts[i] > max) {
				max = snowAmounts[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	// method to determine and display resorts with snowfall above the average
	// and what those amounts are
	public static void displayResortsWithAboveAvgSnowfall(String[] resorts, double[] snowAmounts, double avg) {
		for (int i = 0; i < snowAmounts.length; i++) {
			if (snowAmounts[i] > avg) {
				System.out.println(resorts[i] + " gets " + snowAmounts[i] + " inches which is above average");
			}
		}
	}

}
