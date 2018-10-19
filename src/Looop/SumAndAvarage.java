package Looop;

import java.util.Scanner;

public class SumAndAvarage {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int sum = 0;
		int j = 0;
		
		System.out.println("Enter Number: ");
		int nr = inputScanner.nextInt(); 

		for (int i = 1; i <= nr; i++) {
			sum += i;
			System.out.println(sum);
			j = i;
		}
		System.out.println("Average = " + sum + " / " + j + " = " + (double) sum / (double) j);

	}

}
