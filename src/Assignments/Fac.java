package Assignments;

import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = Sc.nextInt();
        for (int counter = number-1; counter >= 1; counter--){
            System.out.println(number +"*"+ counter);
            number = number * counter;
            System.out.println(number);
        }
        System.out.println("factorial is " + number);
    }
}
