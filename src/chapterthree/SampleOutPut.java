package chapterthree;

import java.util.Scanner;

public class SampleOutPut{

public static void main(String... args){

int firstNumber = 45;
int secondNumber = 75;

Scanner input = new Scanner(System.in);

System.out.print("Input the first number: ");
firstNumber = input.nextInt();

System.out.print("Input the second number: ");
secondNumber = input.nextInt();

if(firstNumber < 25){
System.out.println("false");
}
if(secondNumber< 25){
System.out.println("false");
}
else if(firstNumber <= 75 && firstNumber >= 25){
System.out.println("return: true");
}
else if(secondNumber <=75 && secondNumber >= 25){
System.out.println("result: true");
}else{
System.out.println("oga oga oga!!");
}

}
  }