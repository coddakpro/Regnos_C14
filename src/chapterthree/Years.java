package chapterthree;

import java.util.Scanner;

public class Years {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
           
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

        long minute = 0;
        minutes = (int) (minute / 60);
        int days = 0;
        int years = days % 24 / 365;

        int number = 0;
        if(number > 1440 && number < 525600){

                int day = number / 1440;
                int hour = number % 120;
                 minute = number % 60;
                System.out.printf("%dday%dhour%dminutes",day,hour,minute);

            } 




		System.out.println(minutes + " minutes is approximately " + years
			+ " years and " + days + " days");
	}
}


