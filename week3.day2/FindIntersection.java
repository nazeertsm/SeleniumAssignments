package week3.day2;
/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FindIntersection {

	public static void main(String[] args) {

		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		// get the length of the arrays

		int arr1_len = arr1.length;
		int arr2_len = arr2.length;

		for (int i = 0; i < arr1_len; i++) {

			for (int j = 0; j < arr2_len; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.println("arr1: "+ arr1[i] + " " +"arr2: "+ arr2[j]);

				}

			}

		}

	}

}
