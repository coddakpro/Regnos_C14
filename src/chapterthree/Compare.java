package chapterthree;

import java.util.Scanner;

public class Compare{

public static void main(String[] args){


Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

if (number > 100){
System.out.println("Number is greater than 100");
}

if (number < 100){
System.out.println("Number is less than 100");
}

if (number != 100){
System.out.println("Number is not equal to 100");
}

if (number == 100){
System.out.println("Number is equals to 100");
}

}

   }