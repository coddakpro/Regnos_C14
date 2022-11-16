package chapterthree;

import java.util.Scanner;

public class HeartRatesTest
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter your first name: ");
      String firstName = input.nextLine();

      System.out.print( "Enter your last name: ");
      String lastName = input.nextLine();

      System.out.print( "Enter your age: ");
      int age = input.nextInt();

      HeartRates person1 = new HeartRates( firstName, lastName, age );

      System.out.printf( "Calculations for %s %s age %d\n", 
         person1.getFirstName(), person1.getLastName(), person1.getAge() );

      System.out.printf( "Maximum Heart Rate: %d BPM (beats per minute)\n", person1.getMaxHeartRate() );

      System.out.print( "Target Heart Rate Range is: ");
      person1.displayTargetHeartRateRange();
      System.out.println();
   }
}
