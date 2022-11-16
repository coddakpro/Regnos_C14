package chapterthree;

import java.util.Scanner;
public class Minutes {
   

        public static void main(String[] args){

            Scanner sammuel = new Scanner(System.in);

            System.out.println("Enter the number of minutes to be converted: ");
            int userInput = sammuel.nextInt();

            if(userInput < 60){

                System.out.println("Invalid input");

            }

            if(userInput == 60){

                System.out.println("1 Hour");

            }

            if(userInput > 60 && userInput < 1440){
                int hour = userInput / 60;
                int minute = userInput % 60;
                System.out.printf("%dhour%dminutes",hour,minute);
            }

            if(userInput == 1440){

                System.out.println("1 Day");

            }

            if(userInput > 1440 && userInput < 525600){

                int day = userInput/1440;
                int hour = userInput / 60;
                int minute = userInput % 60;
                System.out.printf("%dday%dhour%dminutes",day,hour,minute);

            }

            if(userInput == 525600){

                System.out.println("1 Year");

            }

            if(userInput > 525600){

                int year = userInput/525600;
                int year2 = userInput%525600;
                int day = year2/1440;
                int day2 = year2%1440;
                int hour = day2/ 60;
                int hour2 = day2%60;
                int minute = hour2% 60;
                System.out.printf("%d%nyear%d%ndays%d%nhours%d%nminute",year, day, hour, minute);

            }

        }
   
}