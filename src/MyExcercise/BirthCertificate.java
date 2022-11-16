package MyExcercise;

import java.util.Scanner;

public class BirthCertificate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int Year = 0;
        int age, bornIn;
        System.out.print("How old are you this year?" );
        age = input.nextInt();
        bornIn = Year + age;
        System.out.println("I think you where born in " + bornIn);
    }
}
