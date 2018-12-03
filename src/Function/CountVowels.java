package Function;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class for counting vowels in an entered string
 * 
 * @author felix.ortlund
 *
 */

public class CountVowels {

	public static void main(String[] args) {
		/*
		 * executes the program
		 */
		countVowels(input());
	}

	/**
	 * Function that allows user to enter a string.
	 * 
	 * @return
	 */
	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Enter Random Letters: ");
		inputs = scanner.nextLine();

		return inputs;
	}

	/**
	 * Function that calculates and prints the sum of all vowels
	 * 
	 * @param inputs
	 */
	public static void countVowels(String inputs) {
		/*
		 * Creates an array with all swedish vowels
		 */
		char[] vowels = { 'e', 'u', 'i', 'o', 'a', 'å', 'ä', 'ö', 'y' };

		int sum = 0;
		/*
		 * A Loop that goes through each entered character in the previous
		 * string and checks if it is a vowel
		 */
		for (int i = 0; i < inputs.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {

				if (("" + inputs.charAt(i)).equalsIgnoreCase("" + vowels[j])) {
					sum++;

				}
			}

		}
		/*
		 * prints the value.
		 */
		System.out.println("Amount of vowels is " + sum);

	}
}