package Assignments;

public class OddEven {

        public static void main(String[] args) {
            int start = 100;
            int limit = 200;

            while (start != limit) {
                if (start % 2 == 0) {
                    System.out.println(start);
                }

                start += 1;
            }
        }
    }

