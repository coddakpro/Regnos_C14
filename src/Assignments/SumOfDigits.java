package Assignments;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
//        create new  scanner object
        Scanner obj = new Scanner(System.in);

//     prompt user to enter a number between 0 and 1000
        System.out.println("Enter a number between 0 and 1000: ");
        int number = obj.nextInt();

//        compute the sum of the digits in the integer.
        int lessThan10 = number % 10;                 //        Extract the digits less than 10
        number /= 10;                                  //        remove the extracted digit
        int tens = number % 10;                      //     Extract the digit between 10 to 99
        number /= 10;                                 //        remove the extracted digit
        int hundreds = number % 10;                 //     Extract the digit between 100 to 999
        number /= 10;                               //        remove the extracted digit
        int sum = hundreds + tens + lessThan10;

//        Display result
        System.out.println("The sum of the digits is " + sum);


    }
}
