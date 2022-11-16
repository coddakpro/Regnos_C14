package chapterthree;

import java.util.Scanner;

public class ProgramStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Let`s try if we can travel to the method world:");
        greet();

        System.out.println("Looks like we can, let`s try again::");
        greet();
        greet();
        greet();
    }

   
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }
}