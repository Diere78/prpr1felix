package Input_Output;

import java.util.Scanner;

public class trial2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter nr: ");		
		int nr1 = inputScanner.nextInt(); 
		System.out.println("Enter operation: ");		
		String operation = inputScanner.next(); 
		System.out.println("Enter nr: ");		
		int nr2 = inputScanner.nextInt(); 
		
		if (operation == "+") {
			System.out.println(nr1 + nr2);
			
		}
		

	}

}
