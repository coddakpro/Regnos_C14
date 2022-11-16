package Assignments;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
//        create  new scanner object
        Scanner obj = new Scanner(System.in);

//        prompt user to enter the subtotal and gratuity rate
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subTotal = obj.nextDouble();
        double gratuityRate = obj.nextDouble();

//        calculate gratuity and total
         double gratuity = subTotal * (gratuityRate / 100);
         double total = subTotal * gratuity;

//        Display result
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

    }
}
