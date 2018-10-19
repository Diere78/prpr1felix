package Input_Output;

import java.util.Scanner;

public class trial7 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		int c;

		System.out.println("Enter nr1: ");
		int a = inputScanner.nextInt();

		System.out.println("Enter nr: ");
		int b = inputScanner.nextInt();

		System.out.println("a: " + a + " b: " + b);

		c = a;
		a = b;
		b = c;
		
		System.out.println("new");
		System.out.println("a: " + a + " b: " + b);

	}

}
