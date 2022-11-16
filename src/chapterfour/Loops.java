package chapterfour;

public class Loops {
    public static void main(String... args) {
        System.out.println(Loops(5));
    }
    public static int Loops(int Loops){
        int j = 1;
        for (int i = 0; Loops <= 1; i++){
            j *= i;
        }
        return j;
    }
}
