package chapterthree;

import java.util.Scanner;

public class AirPlaneAcceleration {


        public static void main(String... args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter speed and acceleration: ");
            double speed = input.nextDouble();
            double acceleration = input.nextDouble();

            double length = Math.pow(speed, 2) / (2 * acceleration);

            System.out.println("The minimum runaway length for this airplane is " + length);


        }

    }

