package Assignments;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {

//        create new scanner object
        Scanner obj = new Scanner(System.in);

//        prompt user to enter the time offset of GMT
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = obj.nextInt();

//        Obtain the total milliseconds since midnight, jan 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();

//        Obtain the total seconds since midnight, jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;

//        computes the current seconds in the minutes in the hour
        long currentSeconds = totalSeconds % 60;

//        computes the total minutes

//        compute the total current minutes
        long currentMinutes = 0;

//        compute the total hours

//        compute the current hour
        long currentHour = 0;

        currentHour = currentHour + offset;

//        Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
    }
}
