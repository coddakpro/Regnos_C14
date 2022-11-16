package chapterfive;

import java.util.Scanner;
    public class Palindrome{

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a five digits value");
            int number = input.nextInt();

            int lastDigit = (number % 10);


            int fourthDigit = (number % 100)/10;


            int thirdDigit = (number % 1000)/100;


            int secondDigit = (number % 10000)/1000;


            int firstDigit = (number /  10000);


            System.out.printf("%d%d%d%d%d%n",lastDigit,fourthDigit,thirdDigit,secondDigit,firstDigit);

            if(lastDigit == firstDigit){
                if(fourthDigit == secondDigit){
                    System.out.printf("It is a palindrome number%n");
                }
            }

            System.out.println("It is not a palindrome number!!!!!!!");

        }
    }

