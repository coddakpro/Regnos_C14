package chapterthree;

import java.util.Scanner;

public class YearsNumbers{

public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
int minutes = input.nextInt();

int years = 24 / 365;
int days = (1440 / 365) / minutes;

System.out.println(minutes  + " minutes is approximately " +   years + " Years and " +   days + " days. ");




}

   }