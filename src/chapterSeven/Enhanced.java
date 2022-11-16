package chapterSeven;

public class Enhanced {
    public static void main(String... args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        for (int i : numbers) {
        }
        System.out.print(numbers + " ");
    }
}