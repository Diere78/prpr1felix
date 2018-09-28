package Input_Output;

import java.util.Scanner;
public class trial4 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter nr: ");		
		double nr = inputScanner.nextDouble(); 
		
		System.out.println("Perimiter is around " + nr * 3.14159265359d * 2);
		System.out.println("Area is around " + nr*nr * 3.14159265359d);

		

	}

}
