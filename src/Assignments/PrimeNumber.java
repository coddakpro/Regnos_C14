package Assignments;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = Scan.nextInt();


        if (isPrime(number))
            System.out.println(number + " is a prime number.");
         else
            System.out.println(number +" is not a prime number.");

        }



     static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){

            return false;

            }
        }
         return true;
     }

}
