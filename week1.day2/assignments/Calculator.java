package week2.day2.assignments;

public class Calculator {

    //Method to add three integers values
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

    //Method to subtract two integers values
    int sub(int num1, int num2) {

        return num1 - num2;

    }

    //Method to multiply two double values
    double mul(double num1, double num2) {

        return num1 * num2;

    }

    //Method to return devision of two float values
    float devisionn(float num1, float num2) {
        return (num1 / num2);

    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int additionOfvalues = obj.add(5, 8, 9);
        System.out.println("the sum of the integer variables " + additionOfvalues);


        int subtractionOfvalues = obj.sub(15, 4);
        System.out.println("the subtraction of the integer variables " + subtractionOfvalues);

        double multiplicationOfvalues = obj.mul(123.42323232323232, 100.523232323232323223323);
        System.out.println("the multiplication of the double variables " + multiplicationOfvalues);

        float devisionnOftwovalues = obj.devisionn(123.23f, 345.45f);
        System.out.println("the devesion of the float variables " + devisionnOftwovalues);


    }

}
