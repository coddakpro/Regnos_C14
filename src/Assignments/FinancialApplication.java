package Assignments;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
//        create a Scanner object
        Scanner obj = new Scanner(System.in);

//        prompt the user to enter a number
        System.out.println("Enter balance and interest rate: ");
        double balance = obj.nextDouble();

//        compute the interest on the monthly payment
        double annualInterestRate = 3;
        double interest;
        double monthlyPayment = 0;
        interest =  monthlyPayment + balance * (annualInterestRate/1200);

//        Display result
        System.out.println("The interest is: " + interest + monthlyPayment + annualInterestRate);

    }
}
