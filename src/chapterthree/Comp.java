package chapterthree;

import java.util.Scanner;

public class Comp{

public static void main(String... args){


Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int highestNumber = input.nextInt();
int lowestNumber = 0;

System.out.println("Enter second number: ");
int userInput = input.nextInt();
if(userInput >  highestNumber) highestNumber = userInput;
if(userInput < lowestNumber) lowestNumber = userInput;

System.out.println("Enter third number: ");
userInput = input.nextInt();
if(userInput >  highestNumber) highestNumber = userInput;
if(userInput < lowestNumber) lowestNumber = userInput;

System.out.println("Enter fourth number: ");
userInput = input.nextInt();
if(userInput >  highestNumber) highestNumber = userInput;
if(userInput < lowestNumber) lowestNumber = userInput;

System.out.printf("Lowest number is:%d%n", lowestNumber);

System.out.printf("highest number is:%d%n", highestNumber);


}

  }