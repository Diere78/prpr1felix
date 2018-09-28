package Input_Output;

import java.util.Scanner;

public class trial5 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter nr: ");		
	    double nr1 = inputScanner.nextDouble(); 
		System.out.println("Enter nr: ");		
		double nr2 = inputScanner.nextDouble(); 
		System.out.println("Enter nr: ");
		double nr3 = inputScanner.nextDouble();
		
		System.out.println("Average is " + (nr1 + nr2 + nr3 ) / 3);

	}

}
