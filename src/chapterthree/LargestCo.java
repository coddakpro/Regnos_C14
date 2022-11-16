package chapterthree;

import java.util.Scanner;

public class LargestCo {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter FirstNumber: ");
int firstNumber = input.nextInt();

System.out.println("Enter second number: ");
int secondNumber = input.nextInt();

int no1 = firstNumber % 6;
int no2 = secondNumber % 6;

if(no1 == no2 && firstNumber != secondNumber){
 System.out.println(Math.min(firstNumber, secondNumber));
}
else if (firstNumber > secondNumber || secondNumber > firstNumber){
System.out.println(Math.max(firstNumber,secondNumber));
}
else if (firstNumber == secondNumber){ 
System.out.println(0);}

  }

}