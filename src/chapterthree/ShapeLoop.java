package chapterthree;

public class ShapeLoop {
    public static void main(String... args) {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.print(" *  *  ");
        }
    }
}