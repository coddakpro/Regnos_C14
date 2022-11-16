package chapterthree;

import java.util.Scanner;

public class NegativeValue {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = scan.nextInt();
            System.out.println("Enter the third number: ");
            int num3 = scan.nextInt();
            System.out.println("Enter the fourth number: ");
            int num4 = scan.nextInt();
            System.out.println("Enter the last number: ");
            int num5 = scan.nextInt();

            int count =  0;
            int counts = 0;

            if(num1 < 0){
                count ++;
            }
            if(num2 < 0){
                count++;
            }
            if (num3 < 0){
                count ++;
            }
            if (num4 < 0){
                count++;
            }
            if(num5 < 0){
                count++;
            }

            System.out.println("The number of negative values is " + count);
            if(num1 > 0){
                counts ++;
            }
            if(num2 > 0){
                counts++;
            }
            if (num3 > 0){
                counts ++;
            }
            if (num4 > 0){
                counts++;
            }
            if(num5 > 0){
                counts++;
            }

            System.out.println("The number of positive values is " + counts);


        }

    }

