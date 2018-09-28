package Input_Output;

import java.util.Scanner;
public class trial7 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int a, b, c;
		
		a = 10; 
		b= 25;
		
		System.out.println(" " + a + " " + b);
		
		c = a; 
		a = b;
		b = c;
		System.out.println(" " + a + " " + b);
 
	}

}
