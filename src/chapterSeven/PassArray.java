package chapterSeven;

public class PassArray {
    public static void main(String... args) {

        int[] array = {1, 2, 3, 4, 5, };
        System.out.printf("Effects of passing refrence to entire array:%n" + "The value of the original array are:%n");

// output original array elements
        for (int value : array)
            System.out.printf("%d", value);

        modifyArray(array);   // pass array reference
        System.out.printf("%n%nThe values of the modified array are:%n");

//        output modified array elements
        for (int value : array)
            System.out.printf("   %d, value");

        System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] before modifyElement: n%d%n", array[3]);

        modifyElement(array[3]);// attempt to modify array[3]
        System.out.printf("array[3] after modifyElement: %d%8%n", array[3]);

        modifyElement(array[3]);   // attempt to modify array[3]
        System.out.printf("array[3] after modifyElement: %d%8%n", array[3]);
    }
//modify argument by 2
    private static void modifyElement(int i) {
        i *= 2;
        System.out.printf("value of element in mofdifyElement: %d%n", i);
//        i is also known as element
    }

    private static void modifyArray(int[] array) {
        int[] array2 = new int[0];
        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] *=2;
    }
}
