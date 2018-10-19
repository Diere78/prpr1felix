package Input_Output;

import java.util.Scanner;

public class Trial9 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter a binary number using 3 digits: ");

		int binA = inputScanner.nextInt();

		System.out.print("Enter a binary number using 3 digits: ");

		int binB = inputScanner.nextInt();

		if (binA == 10 && binB == 11) {
			System.out.println(binA * binB);

		} else if (binA == 11 && binB == 10) {
			System.out.println(binA * binB);

		} else if (binA == 10 && binB == 10) {
			System.out.println(binA * binB);

		} else if (binA == 1 || binB == 1) {
			System.out.println(binA * binB);

		} else {
			System.out.println("Error Only Three Digits");

		}

	}

}
