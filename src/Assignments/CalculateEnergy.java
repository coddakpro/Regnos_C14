package Assignments;

import java.util.Scanner;

public class CalculateEnergy {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

//        create new Scanner object
        Scanner obj = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");

        int number = obj.nextInt();
        int answer = 1;
        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }
}
