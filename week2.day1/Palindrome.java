package week2.day1;

public class Palindrome {
    //Build a logic to find the given string is palindrome or not

    /*
     * Pseudo Code

     * a) Declare A String value as"madam"

     * b) Declare another String rev value as ""
     * c) Iterate over the String in reverse order
     * d) Add the char into rev
     * e) Compare the original String with the reversed String, if it is same then print palinDrome

     * Hint: Use .equals or .equalsIgnoreCase when you compare a String
     */


    String printreverse1(String strgval) {
        String rev = "";

        for (int i = strgval.length ( ) - 1; i >= 0; i--) {
            char charr = strgval.charAt (i);
            rev = rev + charr;
        }

        return rev;
    }

    void isPalindrome(String act, String rev1) {
        if ( act.equals (rev1) ) {
            System.out.println ("String " + act + " is palindrome");
        } else {

            System.out.println ("String " + act + " is not palindrome");
        }

    }

    public static void main(String[] args) {
        String act = "madam";

        Palindrome obj = new Palindrome ( );
        String rev = obj.printreverse1 (act);
        obj.isPalindrome (act, rev);


    }
}

