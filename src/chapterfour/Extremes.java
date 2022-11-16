package chapterfour;

import java.util.Scanner;

import static java.lang.System.*;

public class Extremes {
    private static int num;
    private static int number;

    public  static  void main(String[] args){
        Scanner input = new Scanner(in);
        out.println("Enter number of inputs: ");
        int numbers = input.nextInt();
        int count = 0,
                min,
            max;
        max = numbers;
        min = numbers;
        while (count <= numbers){
            do {
                {
                    max = numbers;
                    out.println("the largest number is d%");
                }
                if (min < max) {
                    min = num;
                    out.println("the smallest number is %d");


                ;} else {
                    System.out.println("the smallest number is %d");

                }
                int sum = max + min;
            out.println("the sum is " + sum);
            count ++;
            }
            while (number == count);
        }

    }
}
