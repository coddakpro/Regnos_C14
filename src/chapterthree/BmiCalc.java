package chapterthree;

import java.util.Scanner;

public class BmiCalc {

    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter your weight in pounds: " );
        double weightInPounds = input.nextDouble();

        System.out.print( "Enter your height in inches: " );
        double heightInInches = input.nextDouble();

        double bmi = ( ( weightInPounds * 703 ) / ( heightInInches * heightInInches ) );

        System.out.printf( "\nBMI VALUES\n" );
        System.out.println( "Underweight: less than 18.5" );
        System.out.println( "Normal:      between 18.5 and 24.9" );
        System.out.println( "Overweight:  between 25 and 29.9" );
        System.out.println( "Obese:       30 or greater" );

        System.out.printf( "\nYour BMI is %.1f\n", bmi );
    }
}


