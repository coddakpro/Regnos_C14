package chaptertwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the user weight in Kilograms");
            double weightInKilograms = scan.nextDouble();

            System.out.println("Enter the user height in meters");
            double heightInMeters = scan.nextDouble();

            double BMI = weightInKilograms / (heightInMeters * heightInMeters);

            System.out.println(BMI);

            if (BMI < 18.5){
                System.out.println("Underweight");
            }
            else if(BMI >= 18.5 & BMI <=24.9){
                System.out.println("Normal!!!!!");
            }
            else if(BMI >= 25 & BMI <= 29.9){
                System.out.println("Overweight!!!!!");
            }
            else{
                System.out.println("Obese!!!!!!!!");
            }

        }
    }

