package week2.day1;

public class ReverseEvenWords {

    //Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		/* Pseudo Code:

			 * Declare the input as Follow
		    String test = "I am a software tester";
			a) split the words and have it in an array
			b) Traverse through each word (using loop)
			c) find the odd index within the loop (use mod operator)
			d)split the words and have it in an array
			e)print the even position words in reverse order using another loop (nested loop)
			f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		*/

    String printreverse1(String strgval) {
        String rev = "";

        for (int i = strgval.length ( ) - 1; i >= 0; i--) {
            char charr = strgval.charAt (i);
            rev = rev + charr;
        }

        return rev;
    }

    public static void main(String[] args) {
        ReverseEvenWords obj = new ReverseEvenWords ( );

        String test = "I am a software tester";
        String[] words = test.split ("\\W+");
        for (int i = 0; i < words.length; i++) {

            if ( i % 2 == 0 ) {

            } else {

                words[i] = obj.printreverse1 (words[i]);

            }

            System.out.println (words[i]);
        }

    }
}