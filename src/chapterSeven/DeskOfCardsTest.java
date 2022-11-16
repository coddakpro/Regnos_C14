package chapterSeven;


import chapterthree.DeskOfCards;

public class DeskOfCardsTest {

//    execute application
public static void main(String[] args) {

    DeskOfCards myDeskOfCards;
    myDeskOfCards = new DeskOfCards();
    myDeskOfCards.shuffle();  //    place cards in random order

//   print all 52 Cards in the order in which they are dealt
    for (int i = 1; i <= 52; i++){

// deal and display a card
        System.out.printf("%-19s", myDeskOfCards.dealCard());

        if (i % 4 == 0)   // output a newline after every fourth card
            System.out.println();
    }
}
}
