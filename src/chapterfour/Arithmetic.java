package chapterfour;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        int product;
        int qustient;

        System.out.print("Enter first int number! ");
        num1 = input.nextInt();
        System.out.print("Enter second number! ");
        num2 = input.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        qustient = num1 % num2;
        System.out.printf("sum is %d%n", sum);
        System.out.printf("product is %d%n", product);
        System.out.printf("qustient is %d%n", qustient);
    }
}
