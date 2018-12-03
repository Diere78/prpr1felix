package Function;

import java.util.Scanner;

/**
 * Program for computing the inputed rent values or solving Y = C *a^x equations
 * 
 * @author felix.ortlund
 *
 */

public class ComputeFuture {

	public static void main(String[] args) {
		/*
		 * executes the program
		 */
		future(input());

	}

	/**
	 * Functions that allows you to enter values and converts them to an array
	 * 
	 * @return
	 */
	public static double[] input() {
		double[] array = new double[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of investment: ");
		array[0] = scanner.nextDouble();
		System.out.println("Enter Intrest: ");
		array[1] = scanner.nextDouble();
		System.out.println("Enter Amount of Years: ");
		array[2] = scanner.nextDouble();
		return array;

	}

	/**
	 * Function for calculating the numbers
	 * 
	 * @param array
	 */
	public static void future(double[] array) {
		/*
		 * Converts a percentage number to a decimal value.
		 */
		array[1] = array[1] / 100 + 1;
		/*
		 * Shows the increase each hypothetical year
		 */
		for (int i = 1; i <= array[2]; i++) {
			double totItrest = (Math.pow(array[1], i));
			System.out.println(array[0] * totItrest);
		}
	}

}
