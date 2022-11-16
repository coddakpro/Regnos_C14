package chapterthree;

import java.util.Scanner;
public class CountYear
{
    
    public static void main(String... args){
        long day;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of minutes: ");
       long minute = (long) scanner.nextDouble();
        
        
        long year= 365;

        day = (minute- year*525600)/(24*60);
        day = (int)day;
        
        System.out.println(" " + "minutes is approximately " + year + " and " + day + " days");
        
            
    }
}