package Assignments;

import java.util.Scanner;

public class MultiplyNumber {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Scan.nextInt();

        for (int i = 1; i <= 12; i++){
            System.out.println(number+" times "+i+" is "+(number*i));
        }

    }
}
