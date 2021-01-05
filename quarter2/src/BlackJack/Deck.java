package BlackJack;
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
        cards = new ArrayList<Card>();

        //2. Create 52 cards - 4 suits, 13 of each suit...
        for(int r = 1; r < 14; r++){
            for(int s = 0; s < 4; s++){
                Card newCard = new Card(r,s);
                cards.add(newCard);
            }
        }

    }

    public void printDeck(){
        for (Card card: cards) {
            System.out.println(card.toString());
        }
    }

    /*1. shuffle.  Randomizes the order of the cards.
        There are a few ways to do this.  See what you can come up with.
    */
    public void shuffle(){
        // my way:
        for(int t = 0; t < 100; t++) {
            for (int i = 0; i < 52; i++) {
                int place = (int) (Math.random() * 52);
                Card c = cards.get(i);
                Card s = cards.get(place);
                cards.set(i, s);
                cards.set(place, c);
            }
        }

        //hopps way:
//        for (int i = 0; i < 100; i++) {
//            int a = (int)(Math.random() * cards.size());
//            Card cardA = cards.remove(a);
//            int randIndex = (int)(Math.random() * cards.size());
//            cards.add(randIndex, cardA);
//        }

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
