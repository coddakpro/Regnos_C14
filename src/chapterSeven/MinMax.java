package chapterSeven;

public class MinMax<result> {
    public static String findMinMax(int firstNumber, int secondNumber, int thirdNumber) {

        int Minimum = Integer.MIN_VALUE;
        int Maximum = Integer.MAX_VALUE;

        if (firstNumber < Minimum) {
            Minimum = firstNumber;
        }

        if (firstNumber > Maximum) {
            Maximum = firstNumber;
        }

        if (secondNumber < Minimum) {
            Minimum = secondNumber;
        }

        if (secondNumber > Maximum) {
            Maximum = secondNumber;
        }

        if (thirdNumber < Minimum) {
            Minimum = thirdNumber;
        }

        if (thirdNumber > Maximum) {
            Maximum = thirdNumber;
        }


      String result = String.format(" %d, %d", Minimum, Maximum);
                return result;

    }

}