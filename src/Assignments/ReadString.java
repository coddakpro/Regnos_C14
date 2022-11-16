package Assignments;

import java.util.Scanner;

public class ReadString {
        public static void main(String args[]){
            // initialize and declare here.
            int id;
            String name;

            // create scanner class object.
            Scanner scanner = new Scanner(System.in);

            // enter the detail.
            System.out.print("Enter Employeeid : ");
            id=(scanner.nextInt());
            System.out.print("Enter EmployeeName : ");
            name=(scanner.next());
            System.out.print("Id : " +id+ "\nName : " +name);
        }
    }


