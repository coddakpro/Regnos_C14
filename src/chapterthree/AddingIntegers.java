package chapterthree;

import java.util.Scanner;

public class AddingIntegers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int numberone;
         int numbertwo;
         int sum;
         System.out.println("Enter a number of your choice:  ");
         numberone = input.nextInt();
         System.out.println("Enter a number of your choice:  ");
         numbertwo= input.nextInt();

         sum = numberone + numbertwo;

         System.out.printf("The addition of %d and %d is %d%n",
         numberone,numbertwo,sum);
         System.out.printf(" %d + %d = %d%n",
         numberone,numbertwo,sum);

        System.out.println("Enter a number of your choice:  ");
        numberone = input.nextInt();
        System.out.println("Enter a number of your choice:  ");
         numbertwo= input.nextInt();

        if(numberone == numbertwo ){
            System.out.printf("%d Equals %d%n", numberone,numbertwo);
        }
        if (numberone != numbertwo ){
            System.out.printf("%d not Equals to %d%n",numberone,numbertwo );
        }
        if (numberone > numbertwo ){
            System.out.printf("%d greater than %d%n",numberone,numbertwo );
        }
        if (numberone < numbertwo ){
            System.out.printf("%d less than %d%n",numberone,numbertwo );
        }
        if (numberone <= numbertwo ){
            System.out.printf("%d less than equals to %d%n",numberone,numbertwo );
        }
        if (numberone >= numbertwo ){
            System.out.printf("%d greater than Equals to %d%n",numberone,numbertwo );
        }

        System.out.printf("*****%n*   *%n");


        System.out.println("Enter a number of your choice:  ");
        int numberthree= input.nextInt();
        System.out.println("Enter a number of your choice:  ");
        int numberfour= input.nextInt();
        System.out.println("Enter a number of your choice:  ");
        int numberfive=input.nextInt();

        if(numberthree > numberfour && numberthree > numberfive){
            System.out.printf(" %d is the largest  ", numberthree);
        }
        if(numberfour > numberthree && numberfour > numberfive){
            System.out.printf(" %d is the largest  ", numberfour);
        }
        if(numberfive > numberfour && numberfive > numberthree){
            System.out.printf(" %d is the largest  ", numberfive);
        }

        System.out.println("Enter a number of your choice:  ");
        int evennumber= input.nextInt();
        System.out.println("Enter a number of your choice:  ");
        int anumber= input.nextInt();
        if(evennumber % anumber== 0){
            System.out.printf("%d is an even number", evennumber);
        }
        else
        {
            System.out.printf("%d is an odd number",evennumber);
        }

        int a =5;
        a = 5 + a;
        System.out.println(a);

    }
}


