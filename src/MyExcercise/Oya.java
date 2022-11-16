package MyExcercise;


import java.util.Scanner;

public class Oya {
    public static void main(String[] args) {

        int gradeCounter = 1;
        int total = 0;

       Scanner util = new Scanner(System.in);

       while (gradeCounter <= 10){
           System.out.print("Enter grade: ");
           int grade = util.nextInt();
           gradeCounter = gradeCounter + 1;
           total = total + grade;
       }
       int average = total / 10;

        System.out.printf("%nYour average is: %d%n", average);
        System.out.printf("%nTotal sum is: %d", total);
    }
}
