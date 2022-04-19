package week1.day2.assignments;

public class FindIntersection {

    public static void main ( String[] args ) {
        /*
         * Pseudo Code

         * a) Declare An array for {3,2,11,4,6,7};
         * b) Declare another array for {1,2,8,4,9,7};
         * c) Declare for loop iterator from 0 to array length
         * d) Declare a nested for another array from 0 to array length
         * e) Compare Both the arrays using a condition statement

         *  f) Print the first array (should match item in both arrays)
         */

        //a) Declare An array for {3,2,11,4,6,7};
        int[] arr1 = { 3 , 2 , 11 , 4 , 6 , 7 };

        // b) Declare another array for {1,2,8,4,9,7};
        int[] arr2 = { 1 , 2 , 8 , 4 , 9 , 7 };

        int mat_Int = 0;


        // c) Declare for loop iterator from 0 to array length

        int len1 = arr1.length;
        int len2 = arr2.length;

        for ( int i = 0 ; i < len1 ; i++ ) {

            for ( int j = 0 ; j < len2 ; j++ ) {

                if ( arr1[i] == arr2[j] ) {
                    mat_Int = arr1[i];
                    i = arr1.length;
                    System.out.println ( "The first match array number is " + mat_Int );
                    break;


                }

            }

        }


    }

}