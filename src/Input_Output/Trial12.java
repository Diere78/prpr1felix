package Input_Output;

import java.util.Scanner;

public class Trial12 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Write an integer number between 1 and 64: ");

		int octa = inputScanner.nextInt();
		
		int octa1 = octa / 8;
		int octa2 = octa % 8;

		if (octa1 == 8) {
			octa1 = 10;
		}
		
		if (octa > 64){
			System.out.println("Not Valid Number");
			System.exit(0);
		}

		if (octa1 == 0) {
			System.out.println(octa2);

		} else
			System.out.println("" + octa1 + octa2); 
		
	} 

}
