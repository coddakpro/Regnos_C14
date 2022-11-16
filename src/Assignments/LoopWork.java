package Assignments;

import java.util.Scanner;

public class LoopWork {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter v0, v1, and t: ");
        double v1 = obj.nextDouble();
        double v0 = obj.nextDouble();

        double time_In_Seconds = 0;
        double meters_Per_Seconds =1.0;
        double averageAcceleration =  (v1 - v0) * time_In_Seconds / meters_Per_Seconds;

        System.out.println("The average acceleration is " + averageAcceleration * (time_In_Seconds + meters_Per_Seconds));

    }
}
