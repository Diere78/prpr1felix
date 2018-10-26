package Arrays;

import java.util.Arrays;
public class ArrayTrail4 {

	public static void main(String[] args) {
		int[] array = {1, 5, 10, 80, 2, 7, 9};
		int sum = 0;
		
		for (int i = 0; i < array.length; i++){
			sum += array[i];
	
			
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Average is: " + sum + " / " + array.length + " = " + ((double) sum / (double)(array.length)));

	}

}
