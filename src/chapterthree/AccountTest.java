package chapterthree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

//        create an account object and assign it to myAccount
         Account Account1 = new Account("John Rico",50.00);
         Account Account2 = new Account("John Rico", -7.53);


//      display  initial balance of each object
        System.out.printf("%s balance: $%.2f%n",
                Account1.getName(), Account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                Account2.getBalance(), Account2.getBalance());


//        prompt user for and read name
        System.out.println("Enter deposit amount for account1:");
        Scanner scan = new Scanner(System.in);
        double depositAmount = scan.nextDouble();    //        obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        Account1.deposit(depositAmount);   //        add to account1's balance

//        Display balances
        System.out.printf("%s balance: $%.2f%n",
                Account1.getName(), Account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                Account2.getName(), Account2.getBalance());

    }
}
