package Function;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		while (true)
		leapYear(in());


	}
	public static int in() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		return year;
	}
	public static void leapYear(int year){
		boolean leapyear = ( year % 4 == 0  && year % 100 != 0 || year % 400 == 0 ); 
		if (leapyear){
			System.out.println( year + " Is a leap year");
		}else{
			System.out.println(year + " Is not a leap year");
		}
	}

}
