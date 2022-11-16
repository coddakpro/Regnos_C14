package chapterthree;

import java.util.Scanner;

public class Palindrome{
      private static Scanner sc;
	public static void main(String[] args) {
		int number = 0, Temp, Reminder, Reverse = 0;

		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number to Check : ");
		int Number = sc.nextInt();
		
		Temp = Number;
		while(Temp > 0) {
			Reminder = Temp % 10;
			Reverse = Reverse * 10 + Reminder;
			Temp = Temp / 10;
		}
		System.out.format("Reverse of entered Number is = %d\n", Reverse);
		if(number == Reverse) {
			System.out.format("%d is Palindrome Number. ", Number);
		}
		else  {
			System.out.format("%d is Not.", Number);
		}
	}
}
 


    

