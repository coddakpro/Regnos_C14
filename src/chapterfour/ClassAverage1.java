package chapterfour;

public class ClassAverage1 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
//     initialization phase
        int gradeCounter = 0;    //        initialize # of grade entered so far
        int total = 0;       //        initialize sum of grade

//        processing phase
        System.out.print("Enter grade or -1 to quit");     //        prompt user and read grade from user
        int grade = input.nextInt();

//        loop until sentinel value read from user
        while (grade != -1){
            total = total + grade;      //            add grade to total
            gradeCounter += 1;    //          increment counter

//       prompt for input and read next grade from user
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

//        termination phase
//        if user entered at least one grade...
        if (gradeCounter != 0)
        {
//            use number with decimal point to calculate average of grades
            double average = (double) total / gradeCounter;

//            display total and average (with two digits of precision)
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else   //        no grade were entered, so output appropriate message
            System.out.println("No grade were entered");
    }

}