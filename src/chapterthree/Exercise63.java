package chapterthree;

import java.util.Scanner;

public class Exercise63 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.println("Result: "+result(a, b));
    }
	public static int result(int x, int y)
     {  
	if(x == y)
		return 0;
	if(x % 6 == y % 6)
		    return Math.min(x, y);
	    return Math.max(x, y);
     }
}