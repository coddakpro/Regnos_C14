package chapterSeven;

import java.util.Scanner;

public class StringSeperation {

    public static void main(String... args) {
        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();

        String numberAsString = String.valueOf(number);
        String result = "   ";

        for (int i = 0; i < numberAsString.length(); i++){
            result = result+ "   " + numberAsString.charAt(i);
        }
        System.out.println(result.trim());
    }
}
