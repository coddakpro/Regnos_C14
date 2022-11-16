package chapterthree;

import java.util.Scanner;

public class LargestAndSmallest{

   public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter first integer: ");
   int a = input.nextInt();

   System.out.print("Enter Second integer: ");
   int b = input.nextInt();

   System.out.print("Enter third integer: ");
   int c = input.nextInt();		

   System.out.print("Enter fourth integer: ");
   int d = input.nextInt();

   System.out.print("Enter fifth integer: ");
   int e = input.nextInt();

  if (a > b && a >c && a > d && a > e){
	System.out.printf("The largest number is %d%n", a);
}

 if (b > a && b > c && b > d && b > e){
	System.out.printf("The largest number is %d%n", b);
}

 if (c > a && c > b && c > d && c > e){
	System.out.printf("The largest number is %d%n", c);
}

 if (d > a && d >b && d > c && d > e){
	System.out.printf("The largest number is %d%n", d);
}

if (e > a && e > b && e > c && e > d){
	System.out.printf("The largest number is: %d%n", e);
}
 	
 if (a < b && a < c && a < d && a < e){
	System.out.printf("The smallest number is %d%n", a);
}

 if (b < a && b < c && b < d && b < e){
	System.out.printf("The smallest number is %d%n", b);
}

 if (c < a && c < b && c < d && c < e){
	System.out.printf("The smallest number is %d%n", c);
}

 if (d < a && d < b && d < c && d < e){
	System.out.printf("The smallest number is %d%n", d);
}

if (e < a && e < b && e < c && e < d){
	System.out.printf("The smallest number is: %d%n", e);
}

 	int sum = a + b + c + d + e;

      double average = sum / 5;

      int product = a * b * c * d * e;

System.out.printf("Total number is:%d%n", sum);

System.out.printf("average number is:%f%n", average);

System.out.printf("Total product is:%d%n", product);

  }
}