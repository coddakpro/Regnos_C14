package chapterfive;

import java.util.Arrays;

public class ArrayLen {
    public static void main(String... args) {
        int[] myIntArray = new int[23];

        for (int i = 0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        for (int i = 0; i<myIntArray.length; i++) {
            System.out.println("Element " + "value is " + Arrays.toString(myIntArray));
        }
    }
}
