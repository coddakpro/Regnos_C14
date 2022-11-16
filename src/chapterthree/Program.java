package chapterthree;

import java.util.Scanner;

public class Program {

    public static void main(String[] main) {
        
        Scanner reader = new Scanner(System.in);

        
        int first = Integer.parseInt(reader.nextLine());
        int second = Integer.parseInt(reader.nextLine());

        
        int product = first * second;

       
        System.out.println("The product of " + first + " and " + second + " is " + product);

        if(product > 1000){
        System.out.println("product legit and normal ");
  }else if (product < 100){
        System.out.println("Why Na!! ");
}else{
        System.out.println("use your head Ohh ");
  }

    }
}