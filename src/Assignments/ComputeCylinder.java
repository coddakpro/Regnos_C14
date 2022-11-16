package Assignments;

import java.util.Scanner;

public class ComputeCylinder {
    public static void main(String[] args) {
//        create scanner object
        Scanner obj = new Scanner(System.in);
        final double PI = 3.14159256359;

//        prompt user to enter the length of a cylinder
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = obj.nextDouble();
        double length = obj.nextDouble();

//        Compute the area and volume
        double area = radius * radius * PI;
        double volume = area * length;

//        Display results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}
