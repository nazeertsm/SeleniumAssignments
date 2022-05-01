package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class NoOfOccurence {

	/*
	 * 1. [1,2,3,1,4,5,1,6] - How many no of 1? 
	 *
	 */

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(6);

		int count = 0;
		int size = list.size();
		System.out.println("length of list is " + size);
		for (int i = 0; i < size; i++) {
			Integer integer = list.get(i);
			// System.out.println(integer);
			if (list.get(i) == 1) {

				count = count + 1;

			}
		}
		System.out.println("total number of 1 occurence is " + count);
	}
}
