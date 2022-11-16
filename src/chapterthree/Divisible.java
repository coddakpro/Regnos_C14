package chapterthree;

import java.util.Scanner;

public class Divisible{

public static void main(String[] args){


Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
double number = input.nextDouble();

if(number % 3 == 0){
System.out.print("number is divisible");
}else{
System.out.println("number not divisible");
}
  }
}