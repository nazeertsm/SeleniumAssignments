package week1.day1.assignments;

public class ConverNegativeToPositiveNumber {

    public static void main(String[] args) {

        int num = -40;

        if(num<0){

            int psnum = -(num);
            System.out.println("the number "+ num+" is converted to "+psnum);
        }

        else {

            System.out.println(num+" Number is positive");
        }

    }
}