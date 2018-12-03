package Function;

import java.util.Scanner;

/**
 * Program to count the amount of entered words.
 * 
 * @author felix.ortlund
 *
 */

public class CountAllWords {
	public static void main(String[] args) {
		System.out.println("Counting words");
		/*
		 * executes the program
		 */
		countWords(input());
	}

	/**
	 * Function for entering words.
	 * 
	 * @return
	 */
	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Enter Random Words: ");
		inputs = scanner.nextLine();
		/*
		 * removes extra spaces in the beginning and end of the input
		 */
		inputs = inputs.trim();

		return inputs;

	}

	/**
	 * Function for calculating and printing the amount of words
	 * 
	 * @param inputs
	 */
	public static void countWords(String inputs) {
		int sum = 1;
		boolean foundSpace = false;
		/*
		 * loop that counts the number of spaces
		 */
		for (int i = 0; i < inputs.length(); i++) {
			if (inputs.charAt(i) == (' ')) {
				/*
				 * if, that ignores extra spaces so the value is accurate
				 */
				if (foundSpace == false) {
					sum++;
					foundSpace = true;
				}
			} else {
				foundSpace = false;
			}

		}
		System.out.println("The total sum of words " + sum);

	}
}