package chapterthree;

import java.util.Scanner;

public class SeperateDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a valid number: ");
        int digits = input.nextInt();
        int firstDigits = digits / 10000;
        System.out.println(firstDigits);
        int secondDigit = (digits%10000)/1000;
        System.out.println(secondDigit);
        int thirdDigit = (digits%1000)/100;
        System.out.println(thirdDigit);
        int fourthDigit = (digits%100)/10;
        System.out.println(fourthDigit);
        int fifthDigit = (digits%10)/1;
        System.out.println(fifthDigit);

        System.out.printf(" %d  %d   %d   %d   %d-", firstDigits,secondDigit,thirdDigit,fourthDigit,fifthDigit );

    }
}

