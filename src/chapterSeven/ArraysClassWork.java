package chapterSeven;

import java.io.OptionalDataException;
import java.util.Scanner;

public class ArraysClassWork {
    private Object[] elementData;

    public static void main(String[] args) {
        boolean addAll = true;
        int numNew;
        int size;
        int modCount;
        String[] noisemakers = new String[5];
        noisemakers[0] = "Helen";
        noisemakers[1] = "mary";
        noisemakers[2] = "david";
        noisemakers[3] = "peter";
         Scanner scanner = new Scanner(System.in);
    }


    public boolean addAll(int index) {
        rangeCheckForAdd(index);


        int modCount = 0;
        modCount++;
        OptionalDataException a = null;
        int numNew = a.length;
        if (numNew == 0)
            return false;
        Object[] elementData;
        final int s;
        int size = 0;
        if (numNew > (elementData = this.elementData).length - (s = size))
            elementData = grow(s + numNew);
        System.out.println("elementData " + modCount);

        int numMoved = s - index;
        if (numMoved > 0)
            System.arraycopy(elementData, index,
                    elementData, index + numNew,
                    numMoved);
        System.arraycopy(a, 0, elementData, index, numNew);
        size = s + numNew;
        return true;
    }

    public static void rangeCheckForAdd(int index) {
        boolean addAll;
        int size;
        int numNew;
        int modCount;

    }

    public static Object[] grow(int i) {
        return new Object[0];
    }
}
