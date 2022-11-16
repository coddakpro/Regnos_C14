package chapterthree;

import java.util.Scanner;

public class TemCelciusAndFa {

        public void temperatureConverter() {
        }

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter a degree in Celsius:");
            double celsius = console.nextDouble();
            double fahrenheit = 32.0 + 1.8 * celsius;
            System.out.printf("%f Celsius is %f Fahrenheit", celsius, fahrenheit);
        }
    }


