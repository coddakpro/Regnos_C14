package chapterSeven;

public class ArrayOne {
   private int [] array = new int[5];

    public static int[] firstArray(){
        int[] array;
        array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        return  array;
    }

    public void setFirstArray(){
        array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
    }

    public int[] getArray() {
        return array;
    }

    public static void main(String[] args) {

    }
}
