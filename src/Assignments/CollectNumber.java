package Assignments;

import java.util.Scanner;

public class CollectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int largestNumber = number;
        int smallestNumber = number;

        while (number!=0)

        if (largestNumber > number)
            largestNumber = number;
        if (smallestNumber < number)
            smallestNumber = number;

            System.out.printf("largest number is %d%n", largestNumber);
            System.out.printf("smallest number is %d%n", smallestNumber);


    }
}
