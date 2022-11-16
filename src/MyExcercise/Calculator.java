package MyExcercise;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;
        number2 = 6;

        System.out.print("Enter value ");
        number1 = input.nextInt();
        number1 = number1 + number2;
        number2 = number1 / number2;
        System.out.println("result = " + number2);

    }
}
