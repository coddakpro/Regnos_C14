package chapterthree;

import java.util.Scanner;

public class OyaDisplay{

public static void main(String... args){

Scanner scan = new Scanner(System.in);

System.out.println("What is your name");
String name = scan.nextLine();

System.out.println("\nWelcome " + name);

}

  }