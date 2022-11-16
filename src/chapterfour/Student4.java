package chapterfour;

public class Student4 {
    int id;
    String name;

    Student4(int i , String n){
        id = i;
         name = n;
    }
    void display(){
        System.out.println(id + " " + name);}

    public static void main(String[] args) {
        Student4 S1 = new Student4(111, "eric");
        Student4 S2 = new Student4(222, "cole");

        S1.display();
        S2.display();
    }
}
