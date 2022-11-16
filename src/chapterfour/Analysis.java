package chapterfour;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

//        create object scanner to obtain  input from command window
        Scanner input = new Scanner(System.in);

//        initialize variables in declaration
        int passes = 0;     //     initialize passes to zero
        int failure = 0;     //      initialize failure to zero
        int studentCounter = 1;    //      initialize student counter to one

//        input the 10 exam results, and count passes and failures
        while (studentCounter <= 10){     //      while student counter is less than or equals to 10

//            prompt user for input and obtain value from user
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();   //     input the next exam result

            if (result ==1)   //         if the student passed
                ++passes;   //          add one to passes
            else
                ++failure;     //     add one to failures
            ++studentCounter;     //        add one to student counter
        }
//        print a summary of the exam result and decide whether a bonus should be paid
        System.out.printf("passes: %d%nFailed: %d%n", passes, failure);    //        print the number of passes and number of failures

        if (passes > 8)   //            determine whether more than eight students passed
            System.out.println("Bonus to instructor!");     //        print "bonus to instructor!"
    }
}
