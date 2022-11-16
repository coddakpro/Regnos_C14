package Assignments;

import java.util.Scanner;

public class FeetIntoMeters {
    public static void main(String[] args) {
//        create Scanner object
        Scanner obj = new Scanner(System.in);
        final  double PI = 0.305;

//        prompt user to enter the value for feet
        System.out.println("Enter a value for feet: ");
        double feet = obj.nextDouble();

//        compute meters and feet
        double meters = feet * feet * PI;

//        Displays result
        System.out.println("feet is " + meters / feet + " meters " );
    }
}
