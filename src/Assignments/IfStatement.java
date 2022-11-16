package Assignments;
//
import static java.lang.Math.PI;
//
public class IfStatement {
    public static void main(String[] args) {


        boolean b;

        double radius = 0;
        if (radius >= 0){
           double area;
            area = radius * radius / (PI);
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
        else{
            System.out.println("Negative input");
        }
    }
}
