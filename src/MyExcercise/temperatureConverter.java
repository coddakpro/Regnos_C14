package MyExcercise;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println ("Enter a degree in Celsius:");

        double celsius= console.nextDouble();


        double fahrenheit= 32+(9.0/5)*celsius;


        System.out.printf("%f Celsius is %f Fahrenheit", celsius, fahrenheit );


    }




}

