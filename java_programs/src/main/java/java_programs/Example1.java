//WAJP to Copy All Elements of One Array to Another Array

package java_programs;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {

		int[] arr1 = { -20, -10, 0, 10, 20 };

		// create new array arr1
		// having exactly same size of arr1
		int[] arr2 = new int[arr1.length];

		// Iterarte over arr1 and copy all elements
		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];
		}
		
		//print arr2
		System.out.println(Arrays.toString(arr2));
	}
}
