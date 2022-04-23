package week2.day1;

public class Stringeg {

	public static void main(String[] args) {
		String text1 = "testleaf";
		int count = 0;
		// Print the number of e in the string e=2
		int length = text1.length();
		char ex = 'e';
		for (int i = 0; i < length; i++) {
			text1.charAt(i);
			// System.out.println(text1.charAt(i));

			char e = 'e';
			if (text1.charAt(i) == e) {
				count = count + 1;

			}

		}
		System.out.println(count);

		String text2 = "Testleaf is situated in twin towers teynampet";
		// print the words that starts 't' or 'T'
		
		String substring = text2.substring(3);
		System.out.println(substring);
		

	}

}
