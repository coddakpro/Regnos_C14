package chapterfive;

import java.util.Scanner;

public class letterGrades {
    public static void main(String[] args) {

        int total = 0;     //        sum of grades
        int gradeCounter = 0;   //        number of grades entered
        int aCount = 0;   //    count of A grades
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n  %s%n  %s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:", "On UNIX/linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");

//        loop until user enters the end-of-file indicator
        while (input.hasNext())
        {
            int grade = input.nextInt();    //       read grade
            total += grade;    //         add grade to total
            ++gradeCounter;  //          increment number of grade

//            increment appropriate letter-grade counter
            switch (grade / 10)
            {
                case 9:        //        grade was between 90
                case 10:        //           and 100, inclusive
                    ++aCount;
                    break;    //           exists switch

                case 8:       //       grade was between 80 and 89
                    ++bCount;
                    break;     //          exist switch

                case 7:
            }
        }

    }
}
