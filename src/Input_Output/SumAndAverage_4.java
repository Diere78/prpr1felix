package Input_Output;

import java.util.Scanner;

public class SumAndAverage_4 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		System.out.println("Enter Starting Number: ");
		int j = inputScanner.nextInt();
		System.out.println("Enter Big Number: ");
		int nr = inputScanner.nextInt();
		
		

		for (int i = j; i <= nr; i++) {

			sum += i;
			System.out.println(sum);
	
		}
		count = Math.abs(nr - j) + 1;
		
		System.out.println("Average = " + sum + " / " + count + " = " + (double) sum / (double) count);

	}

}
