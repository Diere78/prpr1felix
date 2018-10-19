package Input_Output;

import java.util.Scanner;

public class trial8 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int bin4C = 0;
		int bin2C = 0;
		int bin1C = 0;

		System.out.print("Enter a binary number using 3 digits: ");

		int binA = inputScanner.nextInt();

		System.out.print("Enter a binary number using 3 digits: ");

		int binB = inputScanner.nextInt();

		int bin4A = (int) Math.floor(binA / 100);
		int bin2A = (int) Math.floor(binA - bin4A * 100) / 10;
		int bin1A = (int) Math.floor(binA - (bin4A * 100 + bin2A * 10));

		int bin4B = (int) Math.floor(binB / 100);
		int bin2B = (int) Math.floor(binB - bin4B * 100) / 10;
		int bin1B = (int) Math.floor(binB - (bin4B * 100 + bin2B * 10));

		if (bin4A == 1) {
			bin4C = 1;

		}

		if (bin2A == 1) {
			bin2C = 1;

		}

		if (bin1A == 1) {
			bin1C = 1;

		}

		if (bin4B == 1) {
			bin4C = 1;

		}

		if (bin2B == 1) {
			bin2C = 1;

		}

		if (bin1B == 1) {
			bin1C = 1;

		}

		if (bin4B * bin4A == 1) {
			System.out.println("Format not supported. Only three digits. " + "Max Bin is 111");
			System.exit(0);
		}

		if (bin2B == 1 && bin2A == 1 && bin4C == 0) {
			bin4C = 1;
			bin2C = 0;

		} else if (bin2B == 1 && bin2A == 1 && bin4C == 1) {
			System.out.println("Format not supported. Only three digits. " + "Max Bin is 111");
			System.exit(0);
		}

		if (bin1B == 1 && bin1A == 1 && bin2C == 0) {
			bin2C = 1;
			bin1C = 0;

		} else if (bin1B == 1 && bin1A == 1 && bin2C == 1) {
			bin4C = 1;
			bin2C = 0;
			bin1C = 0;

		} else if (bin1B == 1 && bin1A == 1 && bin2C == 1 && bin4C == 1) {
			System.out.println("Format not supported. Only three digits. " + "Max Bin is 111");
			System.exit(0);
		}
		if (binA == 111 || binB == 111) {
			System.out.println("Format not supported. Only three digits. " + "Max Bin is 111");
			System.exit(0);

		}

		System.out.println(" " + bin4C + bin2C + bin1C);

	}

}
