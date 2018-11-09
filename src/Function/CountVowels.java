package Function;

import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		countVowels(input());
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String inputs;
		System.out.println("Enter Random Letters: ");
		inputs = scanner.nextLine();

		return inputs;
	}

	public static void countVowels(String inputs) {
		char[] vowels = { 'e', 'u', 'i', 'o', 'a', 'å', 'ä', 'ö', 'y' };

		int sum = 0;
		for (int i = 0; i < inputs.length(); i++) {
			for (int j = 0; j < vowels.length; j++){
				
				if (("" + inputs.charAt(i)).equalsIgnoreCase("" + vowels[j])){
					sum++;
					
				}
			}
			
		}
		System.out.println("Amount of vowels is " + sum);

	}
}