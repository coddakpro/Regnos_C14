package Assignments;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        //     create a scanner object
        Scanner scan = new Scanner(System.in);
//        double radius;    //         Declare
//        double area;//    assign area
      //    Assign a radius
//        radius = 2.0;       //        radius is now 20
       //     compute area
//        area = radius * radius * 3.144159;
//        compute average
        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double average = (number1 + number2 + number3) / 3;
        //prompt the user to enter three numbers
//         System.out.print("Enter three numbers: ");
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();
        number3 = scan.nextDouble();
//        radius = scan.nextDouble();
////
     //    Display results
        System.out.println(" The average of " +
                number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
