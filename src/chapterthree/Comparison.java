package chapterthree;

import java.util.Scanner;

public class Comparison{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int number1 = input.nextInt();

System.out.print("Enter the second number: ");
int number2 = input.nextInt();

if (number1 == number2){
   System.out.print("%d == %d%n");
}

if (number1 != number2) {
System.out.print("%d%n");
}

if (number1 < number2) {
System.out.print("%d%n");
}

if (number1 > number2) {
System.out.print("%d%n");
}

if (number1 >= number2) {
System.out.print("%d%n");
}

if (number1 <= number2) {
System.out.print("%d%n");
}

   }
}