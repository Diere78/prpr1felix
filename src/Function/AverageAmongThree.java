package Function;

import java.util.Scanner;

public class AverageAmongThree {

	public static void main(String[] args) {
		System.out.println("Average among three decided integers");
		averageAmongThree(input());

	}

	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.println("First Number: ");
		inputs[0] = scanner.nextInt();
		System.out.println("First Second: ");
		inputs[1] = scanner.nextInt();
		System.out.println("First Third: ");
		inputs[2] = scanner.nextInt();

		return inputs;
	}

	public static void averageAmongThree(int[] inputs) {
		int sum = 0;
		for (int i = 0; i < inputs.length; i++) {
			sum += inputs[i];
		}
		System.out.println(sum / inputs.length);

	}

}
