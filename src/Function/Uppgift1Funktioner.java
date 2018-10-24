package Function;

import java.util.Scanner;

public class Uppgift1Funktioner {

	public static void main(String[] args) {
		System.out.println("The Smallest and Largest Among Three");
		compareAmongThree(input());
		

	}

	public static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.println("Input First Number: ");
		inputs[0] = scanner.nextInt();
		System.out.println("Input Second Number: ");
		inputs[1] = scanner.nextInt();
		System.out.println("Input Third Number: ");
		inputs[2] = scanner.nextInt();
		return inputs;
	}

	public static void compareAmongThree(int[] inputs) {
		int temp;
		if (inputs[0] < inputs[1]) {
			temp = inputs[0];

		} else {
			temp = inputs[1];
		}
		if (temp < inputs[2]) {
			System.out.println("Smallest is :" + temp);
		} else {
			System.out.println("Smallest is :" + inputs[2]);
		}
		if (inputs[0] > inputs[1]) {
			temp = inputs[0];

		} else {
			temp = inputs[1];
		}
		if (temp > inputs[2]) {
			System.out.println("Largest is: " + temp);
		} else {
			System.out.println("Largest is: " + inputs[2]);
		}

	}

}
