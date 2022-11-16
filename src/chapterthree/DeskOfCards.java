package chapterthree;//DeskOfCards class represents a desk of playing cards.

import java.security.SecureRandom;

public class DeskOfCards {
    //     random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;     //Constant # of Cards
    private Card[] desk = new Card[NUMBER_OF_CARDS];   //CARDS REFERENCE
    private int count;
    private int currentCard = 0;     //index of next card to be dealt (0- 51)
    private int[] deck;

    //        constructor fills desk of cards
    public DeskOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "six", "seven", "Eight", "nine", "Ten", "Queen", "king"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

//        populate desk with card objects
         for (int count = 0; count < desk.length; count++) {
            desk[count] = desk[faces.length];
            desk[count] = desk[suits.length];
                    new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public  void shuffle() {
//        next call to method dealCard should start at deck[0] again
         currentCard = 0;
//        for each Card, pick another random card (0-51) and swap them
        for (int i = 0; i < desk.length ; i++) {
//            select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

//            swap current card with randomly selected Card
            Card temp = desk[second];
            Card card = desk[i];
            desk[second] = temp;



        }
    }

//    deal one Card

    public Card dealCard() {
//        determine whether cards remain to be dealt
       if (currentCard < desk.length){
           return desk[currentCard++];  //           return card Array
       }
       else
           return  null;  // return null to indicate that all cards were dealt

    }
}