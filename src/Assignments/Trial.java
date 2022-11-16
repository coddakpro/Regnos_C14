package Assignments;

public class Trial {

    private int[] array = new int[10];

    public int runArray(){
        int d = 0;
        for (int i = 0; i <= array.length; i++) {
            d += i;
        }
        return d;
    }
}


