package Blackjack;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Game {

    private Deck deck;
    private ArrayList<Card> player, dealer;

    public Game(){
        deck = new Deck();
        player = new ArrayList<Card>();
        dealer = new ArrayList<Card>();
    }

    public void dealCards(){ //DONE
        deck.shuffle();
        for (int i = 0; i < 2; i++) {
            player.add(deck.dealCard());
        }
        for (int i = 0; i < 2; i++) {
            dealer.add(deck.dealCard());
        }
    }

    public int scoreHand(ArrayList<Card> hand){ //DONE
        int score = 0;
        int aceCount = 0;

        for (Card card: hand)
        {
            if(card.getRank() >= 10){
                score += 10;
            }
            else if(card.getRank() == 1){
                score += 11;
                aceCount++;
            }
            else{
                score += card.getRank();
            }
        }

        while(score > 21 && aceCount > 0){
            score -= 10;
            aceCount--;
        }
        return score;
    }

    public void playerTurn(){ //DONE
        Scanner input = new Scanner(System.in);

        while(scoreHand(player) < 21) {
            System.out.println("\nhit or stay?");

            String choice = input.next();
            choice = choice.toLowerCase();
            if(choice.startsWith("stay")) {
//                System.out.println("Player stays.");
                return;
            }
            else if(choice.startsWith("hit")){
//                System.out.println("Player hits.");
                player.add(deck.dealCard());
                printState();
            }
            else {
                System.out.println("Enter hit or stay, please :)");
            }

        }
    }

    public void dealerTurn(){ //DONE
        while(scoreHand(dealer) < 17){
            dealer.add(deck.dealCard());
        }
    }

    public void playRound() {
        dealCards();
        printState();

        if(scoreHand(player) == 21) {
            System.out.println("\nYOU WIN!");
            return;
        }
        playerTurn();

        if(scoreHand(player) > 21) {
            System.out.println("\nYOU LOSE!");
            return;
        }

        dealerTurn();

        printEndState();

        if(scoreHand(dealer) > 21){
            System.out.println("\nYOU WIN!");
            return;
        }

        if(scoreHand(player) > scoreHand(dealer)){
            System.out.println("\nYOU WIN!");
            return;
        }

        if(scoreHand(player) < scoreHand(dealer)){
            System.out.println("\nYOU LOSE!");
            return;
        }
        if(scoreHand(player) == scoreHand(dealer)){
            System.out.println("\nTIE!");
            return;
        }
    }

    public void printState(){
        System.out.println();
        System.out.println("Dealer hand: " + dealer.get(0) + " *");
        System.out.println("Player hand: " + player);
    }

    public void printEndState(){
        System.out.println();
        System.out.println("Dealer hand: " + dealer);
        System.out.println("Player hand: " + player);
        System.out.println();
    }

    /*
    Dealer hand: 8 of Hearts *
    Player hand: 10 of Spades, 3 of Hearts
    Player has 13.

    1 for Hit 2 for Stay:
    1
    Player gets a 5 of Diamonds
    Player has 18.
    1 for Hit 2 for Stay:
    2

    Dealer ....

     */


}
