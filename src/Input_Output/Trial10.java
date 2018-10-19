package Input_Output;

import java.util.Scanner;

public class Trial10 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter a number between 1 - 15: ");

		int bin = inputScanner.nextInt();

		if (bin == 1) {
			System.out.println(1);

		} else if (bin == 2) {
			System.out.println(10);

		} else if (bin == 3) {
			System.out.println(11);

		} else if (bin == 4) {
			System.out.println(100);

		} else if (bin == 5) {
			System.out.println(101);

		} else if (bin == 6) {
			System.out.println(110);

		} else if (bin == 7) {
			System.out.println(111);

		} else if (bin == 8) {
			System.out.println(1000);

		} else if (bin == 9) {
			System.out.println(1001);

		} else if (bin == 10) {
			System.out.println(1010);

		} else if (bin == 11) {
			System.out.println(1011);

		} else if (bin == 12) {
			System.out.println(1100);

		} else if (bin == 13) {
			System.out.println(1101);

		} else if (bin == 14) {
			System.out.println(1110);

		} else if (bin == 15) {
			System.out.println(1111);

		} else {

			System.out.println("Not valid number, must be between 1 and 15 ");

		}

	}

}
