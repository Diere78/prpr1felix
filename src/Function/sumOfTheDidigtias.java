package Function;

import java.util.Scanner;

public class sumOfTheDidigtias {

	public static void main(String[] args) {
		sumOfDigits(input());

	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Enter Two Digit Number: ");
		inputs = scanner.nextLine();

		return inputs;

	}
	public static void sumOfDigits (String inputs){
		int sum = 0;
		for (int i = 0; i < inputs.length(); i++){
			sum += Character.getNumericValue(inputs.charAt(i));
			System.out.println(Character.getNumericValue(inputs.charAt(i)) + "+");
		}
		System.out.println("Is:");
		System.out.println(sum);
		
	}
}