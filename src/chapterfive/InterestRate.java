package chapterfive;

public class InterestRate {
    public static void main(String[] args) {

        double amountInvested;   //      amount on deposit at the end of each year
        double principal = 1000.0;   //        initial amount before interest
        double interestRate = 0.05;  //        interest rate

//          display headers
        System.out.printf("%s%20%s%n", "year", "Amount on deposit");

//        calculate amount on deposit for each of the ten years
        for (int year = 1; year <= 10; ++year)
        {

//            calculate new amount for specified year
            amountInvested = principal * Math.pow(1.0 + interestRate, year);

//            display the year and the amount
            System.out.printf("%4d%, 20.2f%n", year, amountInvested);


        }

    }
}
