package chapterfive;

public class SavingsAccount {
    public static void main(String[] args) {
//        initialize variables
        double principalAmount = 1000.0;    //     initial amount before interest
        double annualInterestRate = 0.05;    //        interest rate
        double amount;     //        amount on deposit at the end of each year

//        display herder
        System.out.printf("%s%18s%n", " Year", " Amount on deposit");

//        calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year){

//            calculate new amount for specified year
            amount = principalAmount*Math.pow(1.0 + annualInterestRate, year);

            System.out.printf("%4d%, 20.2f%n", year, amount);
        }
    }
}
