package Arrays;

import java.util.Arrays;

public class ArrayTrial1 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 33, 5, 77, 10, 66, 4, 99 };

		for (int i = 0; i < array.length; i++) {
			System.out.println("Array step " + i +" is " + array[i]);

		}

		Arrays.sort(array);
		System.out.println("Array sorted in order (smallest to biggest) " + Arrays.toString(array));

	}

}
