package Assignments;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
//        create Scanner object
        Scanner scanner = new Scanner(System.in);

//        prompt user to enter a degree in celsius
        System.out.println("Enter a degree in celsius: ");
       double celsius = scanner.nextDouble();

//       compute fahrenheit
       double fahrenheit = celsius * 9.0 / 5 + 32;

//       Display result
        System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit " );


    }
}
