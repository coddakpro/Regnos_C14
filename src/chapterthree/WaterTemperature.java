package chapterthree;

import java.util.Scanner;

public class WaterTemperature{

public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of water in kilograms: ");
double kilograms = input.nextDouble();

System.out.print("Enter the initial temperature: ");
double initialTemperature = input.nextDouble();

System.out.print("Enter the finalTemperature: ");
double finalTemperature = input.nextDouble();

double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

System.out.println("The energy needed is " + energy);




   }
  
}