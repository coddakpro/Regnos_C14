package chapterthree;

import java.util.Scanner;

public class CalculateAverage {

    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int average = firstNumber + secondNumber + thirdNumber;

        System.out.println("Average number is: " + average);



    }

}

