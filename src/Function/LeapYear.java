package Function;

import java.util.Scanner;

/**
 * A class for checking if an entered year is a leap year
 * 
 * @author felix.ortlund
 *
 */

public class LeapYear {

	public static void main(String[] args) {
		/*
		 * automatically restarts the program so you don't have to manually
		 * start it each time
		 */
		while (true)
			/*
			 * executes the program
			 */
			leapYear(in());

	}

	/**
	 * Function for entering a year
	 * 
	 * @return
	 */
	public static int in() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		/*
		 * returns the entered value
		 */
		return year;
	}

	/**
	 * Function for calculating and printing if the year is a leap year.
	 * 
	 * @param year
	 */
	public static void leapYear(int year) {
		/*
		 * Boolean that creates a rule set for what counts as a leap year.
		 */
		boolean leapyear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		/*
		 * if the year qualifies for all the previous rules print the year and
		 * the coming string
		 */
		if (leapyear) {
			System.out.println(year + " Is a leap year");
			/*
			 * if the year doesn't qualify as a leap year then print the year
			 * and the coming string
			 */
		} else {
			System.out.println(year + " Is not a leap year");
		}
	}

}
