package week2.day1;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Anagram {
    /*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

    //a) Check length of the strings are same then (Use A Condition)
    String stringlength(String text1, String text2) {
        /* a) Check length of the strings are same then (Use A Condition) */
        if ( text1.length ( ) == text2.length ( ) ) {
            return "length of the strings are same";

        } else {
            return "length of the strings are not same";
        }
    }

    //b) Convert both Strings in to characters
    char covertStringtoChar(String textTochar) {

        System.out.println ("String: " + textTochar + " to char");
        int length1 = textTochar.length ( );
        for (int i = 0; i < length1; i++) {
            char charr = textTochar.charAt (i);
            System.out.println (textTochar.charAt (i));
        }

        return 0;
    }

    String sortarrays(String textToSort) {
        System.out.println ("Before sort:  " + textToSort);

        char[] chars = textToSort.toCharArray ( );
        Arrays.sort (chars);
        String str = new String (chars);
        System.out.println ("After sort:  " + str);
        return str;

    }

    boolean twoArrEqual(int arr1[], int arr2[]) {

        if ( arr1.length != arr2.length )
            return false;

        sort (arr1);
        sort (arr2);

        for (int i = 0; i < arr1.length; i++)
            if ( arr1[i] != arr2[i] ) {
                System.out.println ("Both arrays not equal" );
                return false;
            }


        System.out.println ("Both arrays are equal" );
        return true;
    }

        public static void main ( String[]args){
            String text1 = "stops";
            String text2 = "potss";
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {2, 4, 6, 8, 10};
            Anagram obj = new Anagram ( );

            String lengthOfString = obj.stringlength (text1, text2);
            System.out.println (text1 + "   and  " + text2 + lengthOfString);
            System.out.println ("*****************************");
            obj.covertStringtoChar (text1);
            System.out.println ("*****************************");
            obj.covertStringtoChar (text2);
            System.out.println ("*****************************");
            obj.sortarrays (text1);
            System.out.println ("*****************************");
            
            obj.twoArrEqual (arr1, arr2);

        }

    }