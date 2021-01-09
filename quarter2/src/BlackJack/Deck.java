package Blackjack;
import java.util.*;

public class Deck {

    /*Instance Fields.
    You'll need to have an ArrayList of cards.
     */
    private ArrayList<Card> cards;

    /*constructor.
    Make sure to create an ArrayList object!
    Add all 52 cards to the ArrayList.
     */
    public Deck(){
        //1. set cards to a new ArrayList.
        cards = new ArrayList<>();
        //2. Create 52 cards - 4 suits, 13 of each suit...
        for (int s = 0; s < 4; s++) {
            for (int r = 1; r < 14; r++) {
                Card c = new Card(r, s);
                cards.add(c);
            }
        }
    }

    /*1. shuffle.  Randomizes the order of the cards.
        There are a few ways to do this.  See what you can come up with.
    */
    public void shuffle(){
        //Math.random() [0.0,1.0)
        //remove a random card...add that card to a random location...repeat 100x
        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() * cards.size());
            Card cardA = cards.remove(a);
            int randIndex = (int) (Math.random() * cards.size());
            cards.add(randIndex, cardA);
        }
    }
    //2. dealCard().  Removes and returns the top card (from index 0) from the deck.
    public Card dealCard(){
        return cards.remove(0);
    }

    public boolean hasCards(){
        if(cards.size() > 0)
            return true;
        return false;
    }

}
