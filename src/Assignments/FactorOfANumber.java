package Assignments;

import java.util.Scanner;

public class FactorOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println(number + " has " + result(number) + " factors.");
    }

    public static int result(int x) {
        int fac = 0;
        for (int i = 1; i <= (int)Math.sqrt(x); i++) {
            if (x % i == 0 && i * i != x) {
                fac += 2;
            } else if (i * i == x) {
                x++;
            }
        }
        return fac;
    }
}



