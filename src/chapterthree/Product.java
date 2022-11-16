package chapterthree;

import java.util.Scanner;

public class Product {

   void main(String[] args){

     Scanner input = new Scanner(System.in);

     System.out.print("Enter first integer: ");
     int x = input.nextInt();

     System.out.print("Enter second integer: ");
     int y = input.nextInt();

     System.out.print("Enter third integer: ");
     int z = input.nextInt();

     int result = x * y * z;

     System.out.printf("product is %d%n", result);

    }

}