package Assignments;

public class seeTest {
    public static void main(String[] args) {
        int a = 6;
        int b = a++;
        int i = 10;
        int newNum = 10 * (++i);
        System.out.print("i is " + i + ", newNum is " + newNum);
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
