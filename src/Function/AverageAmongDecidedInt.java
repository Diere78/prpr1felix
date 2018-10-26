package Function;

import java.util.Scanner;

public class AverageAmongDecidedInt {

	public static void main(String[] args) {
		System.out.println("Average among decided integers");
		averageAmongDecided(input());

	}

	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int o = 0;
		System.out.println("Number of Steps in the Array: ");
		o = scanner.nextInt();
		int[] inputs = new int[o];
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Enter Int for " + i + ": ");
			inputs[i] = scanner.nextInt();
		}

		return inputs;
	}

	public static void averageAmongDecided(int[] inputs) {
		int sum = 0;
		for (int i = 0; i < inputs.length; i++) {
			sum += inputs[i];
		}
		System.out.println("Average is: " +  sum + " / " + inputs.length + " = " + ((double)sum / (double)inputs.length));

	}

}
