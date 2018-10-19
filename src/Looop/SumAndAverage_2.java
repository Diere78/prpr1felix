package Looop;

import java.util.Scanner;

public class SumAndAverage_2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int sum = 0;
		int j = 0;

		System.out.println("Enter Number: ");
		int nr = inputScanner.nextInt();

		do {
			sum += j;
			System.out.println(sum);
			j++;
		}while (j <=nr);
		System.out.println("Average = " + sum + " / " + nr + " = " + (double) sum / (double) nr);

	}

}
