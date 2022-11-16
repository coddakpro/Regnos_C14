package chapterthree;

import java.util.Scanner;

public class FeetAndMeters{

public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a value for feet: ");
double feet = input.nextDouble();

double meter = 0.305 * feet;

System.out.println(feet + " feets is " + meter + " meters");



  }

}
