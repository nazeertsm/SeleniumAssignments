package week1.day2.assignments;

public class MyCalculator {


    public static void main ( String[] args ) {

        Calculator obj = new Calculator ( );

        int additionOfvalues = obj.add ( 5 , 8 , 9 );
        System.out.println ( "the sum of the integer variables " + additionOfvalues );


        int subtractionOfvalues = obj.sub ( 15 , 4 );
        System.out.println ( "the subtraction of the integer variables " + subtractionOfvalues );

        double multiplicationOfvalues = obj.mul ( 123.42323232323232 , 100.523232323232323223323 );
        System.out.println ( "the multiplication of the double variables " + multiplicationOfvalues );

        float devisionnOftwovalues = obj.devisionn ( 123.23f , 345.45f );
        System.out.println ( "the devesion of the float variables " + devisionnOftwovalues );


    }

}
