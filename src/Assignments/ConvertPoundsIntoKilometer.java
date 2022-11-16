package javaCodeLesson1;

import java.util.Scanner;

public class ConvertPoundsIntoKilometer {
    public static void main(String[] args) {
        //    create Scanner object
        Scanner obj = new Scanner(System.in);

//        prompt user to enter number in pounds
        System.out.println("Enter a number in pounds: ");
        double pounds = obj.nextDouble();
//         create constant value
       final double kilogram_per_pound = 0.454;
        //        converting pounds into kilometers
        double kilograms = pounds * kilogram_per_pound;

//        Display result
        System.out.println("pounds is " + kilograms + " kilograms ");


    }
}