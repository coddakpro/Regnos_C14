package chapterSeven;

    public class Card {
    private final String face;  //    face of Card ("Ace","Deuce", ...)
    private  final String suit;  //    suit of card ("hearts", "Diamonds", ...)

        //    two-argument constructor initializes card's face and suit
        public Card(String cardFace,String cardSuit) {
            this.face = cardFace;//         initialize face of card
            this.suit = cardSuit;//          initialize face of card
        }
//return String representation of card
        public String toString() {
         return  face + "of" + suit;
        }


    }  