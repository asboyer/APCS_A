package BlackJack;

public class CardTest {
    public static void main(String[] args) {

        //make a deck.
        Deck newDeck = new Deck();
        //print every card in the deck - make sure all 52 are there.
        System.out.println("Not shuffled:\n");
        newDeck.printDeck();
        System.out.println("\nShuffled:\n");
        newDeck.shuffle();
        newDeck.printDeck();
        System.out.println("\n");
        System.out.println(newDeck.dealCard()+"\n\n");
        while(newDeck.hasCards()){
            Card a = newDeck.dealCard();
            System.out.println(a.toString());
        }
        //shuffle the deck, print them all again, make sure they are randomized.

    }
}
