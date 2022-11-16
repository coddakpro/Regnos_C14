package Assignments;

import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = obj.nextInt();

        if (number % 5 == 0)
            System.out.println("HiFive");

        if (number % 2 == 0)
            System.out.println("HiEven");


    }
}
