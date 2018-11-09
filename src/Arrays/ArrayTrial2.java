package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayTrial2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int[] array = { 11, 22, 33, 43, 55, 66, 77, 87, 98, 10};
		
		System.out.println(Arrays.toString(array));
		System.out.println("  0,  1,  2,  3,  4,  5,  6,  7,  8,  9");
		System.out.println("Write a number from 0 to 9, excluding decimals: ");
		int i = scanner.nextInt();
		System.out.println("Write another number from 0 to 9, excluding decimals, to add with the old one: ");
		int o = scanner.nextInt();		
		
		System.out.println("step " + i + ": " + array[i] + "; + step " +  o + ": " + array[o] + "; = " +( array[i] + array[o]));
		
	}

}
