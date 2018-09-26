package prpr1felix;


import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter name: ");		
		String name = inputScanner.nextLine();         
		System.out.println("Hello " + name);
		
		System.out.println("Enter your age: ");		
		int age = inputScanner.nextInt(); 
		
		if (age > 120) {
			System.out.println("You lying S.O.B");
		}else if(age < 10){
			System.out.println("You too young" );
			System.exit(0);
		}
		
		else System.out.println("So your age is " + age);
		
		System.out.println("Enter your weight: ");		
		double weight = inputScanner.nextDouble();
		if (weight > 200) {
			System.out.println("You Fatass");
		}
		else System.out.println("So your weight is " + weight);
	}

}
