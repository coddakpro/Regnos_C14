package chapterthree;

public class SeperatingDigits
{

	public static void main(String[] args) 
	{
		// Initialize variable
		int num1 = 1;	// first number set to 1
		int num2 = 2;	// second number set to 2
		int num3 = 3;	// third number set to 3
		int num4 = 4;	// fourth number set to 4
		
		
		System.out.println("Part (a)");
		System.out.println(num1+" "+num2+" "+num3+" "+num4);
		
		System.out.println();
		
		System.out.println("Part (b)");
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		System.out.print(num3+" ");
		System.out.print(num4);
		
		System.out.println("\n");
		
		System.out.println("Part (c)");
		System.out.printf("%d %d %d %d", num1,num2,num3,num4);
		
	}	
	
}	