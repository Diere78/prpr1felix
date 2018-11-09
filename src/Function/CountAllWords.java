package Function;

import java.util.Scanner;

public class CountAllWords {
	public static void main(String[] args) {
		System.out.println("Counting words");
		countWords(input());
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Enter Random Words: ");
		inputs = scanner.nextLine();
		inputs = inputs.trim();

		return inputs;

	}

	public static void countWords(String inputs) {
		int sum = 1;
		boolean foundSpace = false;
		for (int i = 0; i < inputs.length(); i++) {
			if (inputs.charAt(i) == (' ')) {
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