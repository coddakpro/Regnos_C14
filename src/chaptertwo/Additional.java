package chaptertwo;

import java.util.Scanner;

public class Additional {
    public static void main(String[] args) {

        System.out.println("Enter First Number");
        Scanner Eric;
        int FirstNumber = 1;
        Eric = new Scanner(System.in);
        int firstNumber = Eric.nextInt();
        System.out.println("Enter Second Number");
        int SecondNumber = 2;
        int secondNumber = Eric.nextInt();
        int sum = (FirstNumber + secondNumber);
        System.out.printf("sum of %d and %d is %d", firstNumber, + secondNumber, sum);
    }
}
