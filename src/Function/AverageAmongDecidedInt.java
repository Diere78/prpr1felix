package Function;

import java.util.Scanner;

/**
 * Counting the average of a decided amount of numbers.
 * 
 * @author felix.ortlund
 * 
 */

public class AverageAmongDecidedInt {
	/**
	 * Executes the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Average among decided integers");
		averageAmongDecided(input());

	}

	/**
	 * Function for deciding the different values.
	 * 
	 * @return
	 */
	public static double[] input() {
		Scanner scanner = new Scanner(System.in);
		int o = 0;
		/*
		 * Decides how many steps of the array you are going to use when
		 * counting the average.
		 */
		System.out.println("Number of Steps in the Array: ");
		o = scanner.nextInt();
		double[] inputs = new double[o];
		/*
		 * Here is where you enter the different values that goes in to
		 * different positions in the array.
		 */
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Enter double for " + i + ": ");
			inputs[i] = scanner.nextDouble();
		}

		return inputs;
	}

	/**
	 * Sums up the values that you previously entered into the array. i
	 * represents the steps in the array.
	 */
	public static void averageAmongDecided(double[] inputs) {
		double sum = 0;
		/*
		 * Ads up the different array steps into a sum that can be divided.
		 */
		for (int i = 0; i < inputs.length; i++) {
			sum += inputs[i];
		}
		/*
		 * Divides the sum by the length of the array and printing the average.
		 */
		System.out
				.println("Average is: " + sum + " / " + inputs.length + " = " + (double) sum / (double) inputs.length);
		/*
		 * restarts the program.
		 */

		averageAmongDecided(input());
	}

}
