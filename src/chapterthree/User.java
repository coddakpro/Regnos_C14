package chapterthree;

import java.util.Scanner;

public class User{

   public static void main(String... args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if(number == 1){
    System.out.println(0);
   }else if(number == 0){
   System.out.println(1);
  
}
  }

}