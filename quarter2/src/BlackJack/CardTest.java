package BlackJack;

public class CardTest {
    public static void main(String[] args) {

        //make a deck.
        Deck test = new Deck();
        //print every card in the deck - make sure all 52 are there.
        test.shuffle();
        int count = 0;
        while(test.hasCards()){
            count++;
            Card a = test.dealCard();
            System.out.println(a.toString());
        }
        System.out.println(count);

    }
}
