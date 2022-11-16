package chapterthree;

import java.util.Scanner;

public class Arithemetic {
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        int firstNumber;
        int secondNumber;

        System.out.print( "Enter first integer: " );
        firstNumber = input.nextInt();

        System.out.print( "Enter second integer: ");
        secondNumber = input.nextInt();

        System.out.printf( "%d + %d = %d\n", firstNumber, secondNumber, firstNumber + secondNumber );
        System.out.printf( "%d * %d = %d\n", firstNumber, secondNumber, firstNumber * secondNumber );
        System.out.printf( "%d - %d = %d\n", firstNumber, secondNumber, firstNumber - secondNumber );
        System.out.printf( "%d / %d = %d\n", firstNumber, secondNumber, firstNumber / secondNumber );
    }
}
