package week2.day1;

public class FindTypes {

    // Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/


    String countThedataType(String textTochar) {

        // Here is what the count you need to find
        int letter = 0, space = 0, num = 0, specialChar = 0;

        System.out.println ("String: " + textTochar + " to char");
        int length1 = textTochar.length ( );
        for (int i = 0; i < length1; i++) {
            char charr = textTochar.charAt (i);
           // System.out.println (textTochar.charAt (i));

            if ( Character.isLetter (textTochar.charAt (i)) ) {

                letter = letter + 1;

            } else if ( Character.isSpaceChar (textTochar.charAt (i)) ) {

                space = space + 1;

            } else if ( Character.isDigit (textTochar.charAt (i)) ) {

                num = num + 1;

            } else {
                specialChar = specialChar + 1;

            }
        }

        return ( "string contains: "+"letter " + letter + "+ " + "space " + space + "+ " + "num " + num + "+" + "specialChar " + specialChar );

    }

    public static void main(String[] args) {
        // Here is the input
        String test = "$$ Welcome to 2nd Class of Automation $$ ";

        FindTypes obj = new FindTypes ( );

        // Print the count here
        System.out.println (obj.countThedataType (test));

    }

}



