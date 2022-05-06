package week3.day2;
import java.util.Arrays;

/*
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it
 */

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		for(int i=0; i<data.length; i++) {
			
			System.out.println(data[i]);
			
			
		}
		System.out.println("second element from the above list:  "+ data[1]);

	}

}
