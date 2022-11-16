package Assignments;

public class AverageAcceleration {
    public static void main(String[] args) {
        String s1 = "BALLOON";
        char[] charArray = new char[7];

        System.out.printf(" : %s", s1);

        System.out.printf("%nThe String reversed is: ");

        for (int count = s1.length() -1; count >= 0; count--)
            System.out.printf("%c ", s1.charAt(count));


        s1.getChars(0, 6, charArray, 0);

        for (char character : charArray)
            System.out.print(character);

        System.out.println();


    }

}
