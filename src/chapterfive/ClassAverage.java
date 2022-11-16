package chapterfive;

import java.util.Scanner;

public class ClassAverage {

        public ClassAverage() {
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int total = 0;

            int grade;
            for(int gradeCounter = 1; gradeCounter <= 10; total += grade) {
                ++gradeCounter;
                System.out.print("Enter Grades: ");
                grade = input.nextInt();
            }

            grade = total / 10;
            System.out.printf("%nTotal of all 10 grades is %d%n", total);
            System.out.printf("Class average is %d%n", grade);
        }
    }


