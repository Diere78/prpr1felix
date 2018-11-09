package Function;

import java.util.Scanner;

public class ComputeFuture {

	public static void main(String[] args) {
		future(input());

	}

	public static double[] input() {
		double[] array = new double[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount of investment: ");
		array[0] = scanner.nextDouble();
		System.out.println("Enter Intrest: ");
		array[1] = scanner.nextDouble();
		System.out.println("Enter Amount of Years: ");
		array[2] = scanner.nextDouble();
		return array;

	}

	public static void future(double[] array) {
		array[1] = array[1] / 100 + 1;
		for (int i = 1; i <= array[2]; i++) {
			double totItrest = (Math.pow(array[1], i));
			System.out.println(array[0] * totItrest);
		}
	}

}
