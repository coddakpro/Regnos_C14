package Assignments;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
//         create new scanner object
        Scanner obj = new Scanner(System.in);

//     prompt user to enter the number of minutes
        System.out.println("Enter the number of minutes: ");
        int minutes = obj.nextInt();

//        compute number of years and days
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

//         Display results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");



    }
}
