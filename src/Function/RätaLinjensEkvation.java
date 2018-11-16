package Function;

import java.util.Scanner;

public class RätaLinjensEkvation {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("y = kx + m");
		System.out.println("What value do you want to find (singular): ");
		char find = enter.nextLine().charAt(0);
		if (find == 'y') {
			yValue(inputKXM());
		} else if (find == 'x') {
			xValue(inputYKM());
		} else if (find == 'm') {
			mValue(inputYKX());
		} else if (find == 'k') {
			kValue(inputYX());
		} else
			System.out.println("Not an option try again");
	}

	public static double[] inputKXM() {
		double[] kxm = new double[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter k value: ");
		kxm[0] = scanner.nextDouble();
		System.out.println("Enter x value: ");
		kxm[1] = scanner.nextDouble();
		System.out.println("Enter m value: ");
		kxm[2] = scanner.nextDouble();

		return kxm;
	}

	public static double[] inputYKM() {
		double[] ykm = new double[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter y value: ");
		ykm[0] = scanner.nextDouble();
		System.out.println("Enter k value: ");
		ykm[1] = scanner.nextDouble();
		System.out.println("Enter m value: ");
		ykm[2] = scanner.nextDouble();

		return ykm;
	}

	public static double[] inputYKX() {
		double[] ykx = new double[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter y value: ");
		ykx[0] = scanner.nextDouble();
		System.out.println("Enter k value: ");
		ykx[1] = scanner.nextDouble();
		System.out.println("Enter x value: ");
		ykx[2] = scanner.nextDouble();

		return ykx;
	}

	public static double[] inputYX() {
		double[] delta = new double[4];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first y variable: ");
		delta[0] = scanner.nextDouble();
		System.out.println("Enter first x variable: ");
		delta[1] = scanner.nextDouble();
		System.out.println("Enter second y variable: ");
		delta[2] = scanner.nextDouble();
		System.out.println("Enter second x variable: ");
		delta[3] = scanner.nextDouble();
		return delta;
	}

	public static void kValue(double[] delta) {
		double m = 0;
		double k = (delta[2] - delta[0]) / (delta[3] - delta[1]);
		System.out.println("k " + "= " + delta[2] + " - " + delta[0] + " / " + delta[3] + " - " + delta[1] + " = " + k);
		m = delta[0] - k * delta[1];
		System.out.println("Function is: y = " + k + " x " + "+ " + m);

	}

	public static void mValue(double[] ykx) {
		double m = ykx[0] - ykx[1] * ykx[2];
		System.out.println("" + ykx[0] + " = " + ykx[1] + " * " + ykx[2] + " + " + "m");
		System.out.println("m = " + ykx[0] + " - " + ykx[1] + " * " + ykx[2] + " = " + m);
		System.out.println(" The function: " + " y " + "= " + ykx[1] + "x " + "+ " + m);
	}

	public static void xValue(double[] ykm) {
		System.out.println("" + ykm[0] + " = " + ykm[1] + "x " + " + " + ykm[2]);
		System.out.println("" + "x" + " = " + " (" + ykm[0] + " - " + ykm[1] + ") " + "/ " + ykm[2] + " = "
				+ ((ykm[0] - ykm[1]) / ykm[2]));
		System.out.println(" The function: " + " y " + "= " + ykm[1] + "x " + "+ " + ykm[2]);
	}

	public static void yValue(double[] kxm) {
		double y = 0;
		y = kxm[0] * kxm[1] + kxm[2];
		System.out.println("" + "y " + " = " + kxm[0] + " * " + kxm[1] + " + " + kxm[2] + " = " + y);
		System.out.println(" The function: " + " y " + "= " + kxm[0] + "x " + "+ " + kxm[2]);
	}

}
