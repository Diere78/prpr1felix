package Function;

import java.util.Arrays;
import java.util.Scanner;

public class MiddelCharacter {

	public static void main(String[] args) {

		middleChar(input());
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String inputs = scanner.nextLine();

		return inputs;

	}

	public static void middleChar(String inputs) {
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
