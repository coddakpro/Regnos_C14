package chapterSeven;
//given an array numbers = {3, 4, 2, 5, 1}; sum = 15;
//less 3 = 4+2+5+1 = 12;
//less 4 = 3+2+5+1 = 11;
//less 2 = 3+4+5+1 = 13;
//less 5 = 3+4+2=1 = 14;

//write function that take numbers and return maximum less 1 number and minimum less 1 number
//it'll add all the numbers together and returns the result of the minimum number and
//        the result of the maximum number less 1

public class ArrayArray {
    private static final int[] numbers = {3, 4, 2, 5, 1};

    public static int total() {
        int result = 0;
        for (int i : numbers) {
            result = result + i;
        }
        return result;

    }

    public static int maxOneLess() {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum)
                maximum = number;
        }
        return maximum;
    }

    public int miniOneLess() {
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number < minimum)
                minimum = number;
        }
        return minimum;
    }

    public static void main(String[] args) {
        ArrayArray arrayArray = new ArrayArray();

        int maximum = ArrayArray.maxOneLess();
        int minimum = ArrayArray.minOneLess();
        int total = ArrayArray.total();

        if (maximum < total) {
            maximum = total - minimum;
            System.out.println("maximum = " + maximum);
        }
        if (minimum > total) {
            minimum = total - maximum;
        }
        int newNumber = total + minimum;
        System.out.println("minimum = " + minimum);



    }

    private static int minOneLess() {
        return 0;
    }

    }




