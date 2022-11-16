package chapterfive;

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


