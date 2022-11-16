package javaCodeLesson1;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final  double PI = 3.14159;     //   Declare a constant

       //     create a scanner object
        Scanner scan = new Scanner(System.in);

//        prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = scan.nextDouble();

//   compute area
        double area = radius * radius * PI;

//    Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
