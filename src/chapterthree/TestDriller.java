package src.ChapterThree;

    //Get the number of copies a user want to buy
//if the copies is in the range of one to four copies it would be #2000 per copy
//If the copies is in the range of five to nine copies the price should be #1800 per copy
//If the copies is in the range of ten to twenty nine copies the price is going to be #1600 per copy
//If the copies is in the range of thirty to fourty nine the price is going to be #1500 per copy
//If the copies is in the range of fifty to ninety nine the price is going to be #1300 per copy
////If the copies is in the range of one hundred to one hundred and ninety nine the price is going to be #1200 per copy
//If the copies is in the range of two hundred to four hundred and ninety nine the price is going to be #1100 per copy
//If the copies is more than 500 the price is going to be #1000 per copy
//Calculate the amount to be paid by the user i.e quantity * price per copy
import java.util.Scanner;
    public class TestDriller{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of copies: ");
            int quantity = scan.nextInt();
            int price;


            if(quantity >= 1){
                if(quantity <= 4){
                    price = quantity * 2000;
                    System.out.printf("The reseller would pay #%d", price);
                }
            }
            if(quantity >= 5){
                if(quantity <= 9){
                    price = quantity * 1800;
                    System.out.printf("The reseller would pay #%d",price);
                }
            }
            if(quantity >= 10){
                if(quantity <= 29){
                    price = quantity * 1600;
                    System.out.printf("The reseller would pay #%d",price);
                }
            }
            if(quantity >= 30){
                if(quantity <= 49){
                    price = quantity * 1500;
                    System.out.printf("The reseller would pay #%d",price);
                }
            }
            if(quantity >= 50){
                if(quantity <= 99){
                    price = quantity * 1300;
                    System.out.printf("The reseller would pay #%d",price);
                }
            }
            if(quantity >= 100){
                if(quantity <= 199){
                    price = quantity * 1200;
                    System.out.printf("The reseller would pay #%d",price);
                }
            }
            if(quantity >= 200){
                if(quantity <= 499){
                    price = quantity * 1100;
                    System.out.printf("The reseller would pay #%d",price);
                }
            }
            if(quantity >= 500){

                price = quantity * 1000;
                System.out.printf("The reseller would pay #%d",price);

            }



        }
    }

