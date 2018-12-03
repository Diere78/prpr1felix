package Function;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class for checking the middle character in an entered string
 * 
 * @author felix.ortlund
 *
 */

public class MiddelCharacter {

	public static void main(String[] args) {
		/*
		 * executes the program
		 */

		middleChar(input());
	}

	/**
	 * Function that allows user to enter a string.
	 * 
	 * @return
	 */

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String inputs = scanner.nextLine();

		return inputs;

	}

	/**
	 * Function for calculating the if it is an even or odd amount of characters
	 * and printing the middle characters.
	 * 
	 * @param inputs
	 */
	public static void middleChar(String inputs) {
		/*
		 * Checks if it is an even amount of characters in the string and if
		 * there is print two middle characters
		 */
		if (inputs.length() % 2 == 0) {
			System.out.println("Even Amount of Chars");
			System.out.println("Middle Chars Are: " + inputs.charAt((inputs.length() / 2) - 1) + " and "
					+ inputs.charAt(inputs.length() / 2));
		} else {
			System.out.println("Odd Amount of Chars");
			System.out.println("Middle Char Is: " + inputs.charAt(inputs.length() / 2));

		}

	}

}
