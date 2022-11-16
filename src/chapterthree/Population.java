package chapterthree;

import java.util.Scanner;

public class Population
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter the current world population (exclude commas): ");
      double currentPopulation = input.nextDouble();

      System.out.print( "Enter the annual world population growth rate (in percent): ");
     float growthRate = input.nextFloat();
      growthRate = growthRate / 100;

     double yearOne = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "\nWorld population after one year: %.0f\n", yearOne );

      currentPopulation = yearOne;
      
      double yearTwo = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "                after two years: %.0f\n", yearTwo );

      currentPopulation = yearTwo;

      double yearThree = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "              after three years: %.0f\n", yearThree );

      currentPopulation = yearThree;
      
      double yearFour = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after four years: %.0f\n", yearFour );

      currentPopulation = yearFour;

      double yearFive = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after five years: %.0f\n", yearFive );
   }
}