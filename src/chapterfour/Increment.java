package chapterfour;
//prefix increment and postfix increment operators.

public class Increment {
    public static void main(String[] args) {

//        demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("   postincrement c: %d%n", c++);
        System.out.printf(" c after postincrement: %d%n", c);

        System.out.println();      //        skip a line

//        demonstrate prefix increment operator
        c = 5;
        System.out.printf(" c before preincrement: %d%n", c);
        System.out.printf("   preincrement: %d%n", ++c);
        System.out.printf("  c after pre increment: %d%n", c);
    }
}
