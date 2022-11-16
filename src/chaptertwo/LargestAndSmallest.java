package chaptertwo;

import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the Second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter the Third number: ");
        int thirdNumber = input.nextInt();
        System.out.println("Enter the Fourth number: ");
        int fourthNumber = input.nextInt();
        System.out.println("Enter the Last number: ");
        int lastNumber = input.nextInt();

        if (firstNumber > secondNumber & firstNumber > thirdNumber &
                firstNumber > fourthNumber & firstNumber > lastNumber) {
            System.out.printf("The largest number is %d%n", firstNumber);
        } else if (secondNumber > firstNumber & secondNumber > thirdNumber &
                secondNumber > fourthNumber & secondNumber > lastNumber) {
            System.out.printf("The largest number is %d%n", secondNumber);
        } else if (thirdNumber > firstNumber & thirdNumber > secondNumber &
                thirdNumber > fourthNumber & thirdNumber > lastNumber) {
            System.out.printf("The largest number is %d%n", thirdNumber);
        } else if (fourthNumber > firstNumber & fourthNumber > secondNumber &
                fourthNumber > thirdNumber & fourthNumber > lastNumber) {
            System.out.printf("The largest number is %d%n", fourthNumber);
        } else {
            System.out.printf("The largest number is %d%n", lastNumber);
        }


        if (firstNumber < secondNumber & firstNumber < thirdNumber &
                firstNumber < fourthNumber & firstNumber < lastNumber) {
            System.out.printf("The smallest number is %d%n", firstNumber);
        } else if (secondNumber < firstNumber & secondNumber < thirdNumber &
                secondNumber < fourthNumber & secondNumber < lastNumber) {
            System.out.printf("The smallest number is %d%n", secondNumber);
        } else if (thirdNumber < firstNumber & thirdNumber < secondNumber &
                thirdNumber < fourthNumber & thirdNumber < lastNumber) {
            System.out.printf("The smallest number is %d%n", thirdNumber);
        } else if (fourthNumber < firstNumber & fourthNumber < secondNumber &
                fourthNumber < thirdNumber & fourthNumber < lastNumber) {
            System.out.printf("The smallest number is %d%n", fourthNumber);
        } else if (lastNumber < firstNumber & lastNumber < secondNumber &
                lastNumber < thirdNumber & lastNumber < fourthNumber) {
            System.out.printf("The smallest number is %d%n", lastNumber);
        }
    }
}

