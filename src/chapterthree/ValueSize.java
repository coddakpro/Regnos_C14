package chapterthree;

import java.util.Scanner;

public class ValueSize{

public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Input the first number: ");
int firstNumber = input.nextInt();

System.out.print("Input the second number: ");
int secondNumber = input.nextInt();

int result;

if(firstNumber > secondNumber){
result = firstNumber;
}
if(firstNumber < secondNumber){
result = secondNumber;
}
else{
result = 0;
}
if(firstNumber % 6 == secondNumber % 6 && firstNumber < secondNumber){
result = secondNumber;
}
System.out.println(result);

}

  }