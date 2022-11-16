package chapterthree;

public class Factorial {


    public static void main(String... args) {
        System.out.println(factorial(9));
    }

    public static int factorial(int factorial){

        int j = 1;
        for (int i = factorial; i > 0; i--) {
            j*=i;
        }
        return j;
    }
}