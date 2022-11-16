package chaptertwo;

import java.util.Scanner;

public class ComparingIntegers {

        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int first_number = scan.nextInt();

            System.out.println("Enter the second number: ");
            int second_number = scan.nextInt();

            System.out.println("Enter the third number: ");
            int third_number = scan.nextInt();

            int sum = first_number + second_number + third_number;
            System.out.printf("%d + %d + %d = %d%n%n",
                    first_number,second_number,third_number,sum);
            int average = (first_number + second_number + third_number)/3;
            System.out.printf("The average is %d%n%n", average);
            int product = first_number * second_number * third_number;
            System.out.printf("%d * %d * %d = %d%n",
                    first_number,second_number,third_number,product);

            if(first_number > second_number & first_number > third_number){
                System.out.printf("The largest number is %d%n",first_number);
            }
            else if(second_number > first_number & second_number > third_number){
                System.out.printf("The largest number is %d%n",second_number);
            }


            else{
                System.out.printf("The largest number is %d%n",third_number);
            }

            if(first_number < second_number & first_number < third_number){
                System.out.printf("The smallest number is %d%n",first_number);
            }
            else if(second_number < first_number & second_number < third_number){
                System.out.printf("The smallest number is %d%n",second_number);
            }
            else {
                System.out.printf("The smallest number is %d%n",third_number);
            }
        }
    }

