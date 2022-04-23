package week2.day1;

public class CharOccurance {

    public static void main(String[] args) {
        // Check number of occurrences of a char (eg 'e') in a String
/*
        // declare and initialize a variable count to store the number of occurrences
        // convert the string into char array
        //get the length of the array
        // traverse from 0 till the array length
        // Check the char array has the particular char in it
        // if is has increment the count
        // print the count out of the loop
*/
        String str = "welcome to chennai";
        int count = 0;
        // Print the number of e in the string e=2
        int length = str.length ( );
        char ex = 'e';
        for (int i = 0; i < length; i++) {
            str.charAt (i);
            // System.out.println(text1.charAt(i));
            if ( str.charAt (i) == ex ) {
                count = count + 1;

            }

        }
        System.out.println (count);
    }

}

