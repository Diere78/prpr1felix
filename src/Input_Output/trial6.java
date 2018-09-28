package Input_Output;

import java.util.Scanner;
public class trial6 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner (System.in);
		
		System.out.println("Enter Height: ");		
		double H = inputScanner.nextDouble(); 
		System.out.println("Enter Width: ");		
		double W = inputScanner.nextDouble();
		
		System.out.println("Area is " + 2*(H + W));
		System.out.println("Perimeter is " + (H * W));
		

	}

}
