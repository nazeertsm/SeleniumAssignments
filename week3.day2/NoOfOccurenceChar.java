package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class NoOfOccurenceChar {

	/* 2. [A,B,C,D,E,A,G,F,C] - Duplicate value of this -> A,C*/
	 	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		list.add('A');		list.add('B');  list.add('C');
		list.add('D');   	list.add('E');	list.add('A');
		list.add('G');  	list.add('F');	list.add('C');
		
		int count_A = 0;
		int count_C = 0;

		int size = list.size();
		System.out.println("length of list is " + size);
		for (int i = 0; i < size; i++) {
			Character character = list.get(i);
			if (list.get(i).equals('A')) {

				count_A = count_A + 1;

			}

			else {
				if (list.get(i).equals('C')) {

					count_C = count_C + 1;
				}

			}
		}
		System.out.println("total number of A occurence is " + count_A);
		System.out.println("total number of C occurence is " + count_C);

	}
}
