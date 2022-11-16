package chapterfour;

import java.util.Scanner;

class GradeQuiz {

        public GradeQuiz() {
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int total = 0;
            int gradeCounter = 1;
            System.out.print("Enter grade or -1 to quit: ");

            for(int grade = input.nextInt(); grade != -1; grade = input.nextInt()) {
                total += gradeCounter;
                ++gradeCounter;
                System.out.print("Enter Grade or -1 to quit: ");
            }

            if (gradeCounter != 0) {
                double average = (double)total / (double)gradeCounter;
                System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class average is %.2f%n", average);
            } else {
                System.out.println("No grade was entered: ");
            }

        }
    }


