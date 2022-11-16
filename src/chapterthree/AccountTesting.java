package  chapterthree;

import java.util.Scanner;

public class AccountTesting {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        Account account1 = new Account();
        Account account2 = new Account();


        System.out.printf("account1 name is: %s%n", account1.getName());

        System.out.printf("account2 name is: %s%n", account2.getName());
    }
}
