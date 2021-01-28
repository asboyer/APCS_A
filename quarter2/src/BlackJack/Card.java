package BlackJack;

public class Card {

    //ranks go from 1 to 13.  1 is an Ace.  11, 12, 13 are Jack, Queen, King.

    private int rank, suit;

    public static final int SPADES = 3, HEARTS = 2, CLUBS = 1, DIAMONDS = 0;

    public Card(int r, int s) {
        rank = r;
        suit = s;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    /*
    Returns a String of the format: "RANK of SUIT"
    Ex) "2 of spades" "Queen of hearts" "Ace of diamonds" "10 of clubs"
     */
    public String toString() {
        String str = "";
        String strSuit = "";

        if (rank == 1) {
            str = "Ace of";
        } else if (rank == 11) {
            str = "Jack of";
        } else if (rank == 12) {
            str = "Queen of";
        } else if (rank == 13) {
            str = "King of";
        } else {
            str += rank + " of";
        }

        if (suit == DIAMONDS) {
            strSuit = " ♦Diamonds♦";
        } else if (suit == CLUBS) {
            strSuit = " ♣Clubs♣";
        } else if (suit == HEARTS) {
            strSuit = " ♥Hearts♥";
        } else if (suit == SPADES) {
            strSuit = " ♠Spades♠";
        }

        return str + strSuit;
    }
}