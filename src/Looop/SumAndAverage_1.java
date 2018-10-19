package Looop;

import java.util.Scanner;

public class SumAndAverage_1 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int sum = 0;
		int j = 1;

		System.out.println("Enter Number: ");
		int nr = inputScanner.nextInt();

		while (j <= nr) {
			sum += j;
			System.out.println(sum);
			j++;
		}
		System.out.println("Average = " + sum + " / " + nr + " = " + (double) sum / (double) nr);

	}

}
