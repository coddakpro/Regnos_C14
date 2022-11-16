package Assignments;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 29; i--)

            System.out.printf("%dtimes %d is %d%n", number,(i * number));
    }
}
