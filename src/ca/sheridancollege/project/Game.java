/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public class Game {

    //Import Constructors
    ArrayList deck = new ArrayList();
    ArrayList playerCards = new ArrayList();
    ArrayList dealerCards = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void start() {
        createDeck();
        shuffleDeck();
        dealToPlayer();
        dealToPlayer();
        dealToDealer();
        dealToDealer();
        showPlayerCards();
        showDealerCards();
        game();
    }

    private void game() {
        while (true) {

            System.out.println();
            if (checkDealerHand() > 21) {
                System.out.println("Dealer's hand sum is " + checkDealerHand());
                System.out.println("Dealer Busted. You won!");
                System.exit(0);
            }

            if (checkPlayerHand() > 21) {
                System.out.println("Player's hand sum is " + checkPlayerHand());
                System.out.println("You Busted. Dealer won!");
                System.exit(0);
            }

            System.out.println("---------------------------------------------------------");
            System.out.println("                     YOUR TURN                     ");
            OUTER_LOOP:
            while (true) {
                System.out.println("Hit or stay?");
                String playerAns = input.nextLine();
                if (playerAns.equals("h")) {
                    dealToPlayer();
                    showPlayerCards();
                } else {
                    break OUTER_LOOP;
                }
            }

            OUTER_LOOP:
            while (true) {
                if (checkDealerHand() < 16) {
                    System.out.println("---------------------------------------------------------");
                    System.out.println("                   DEALER'S TURN                   ");
                    dealToDealer();
                    showDealerCards();
                }
                break;
            }

            if (checkDealerHand() > 21) {
                System.out.println("Dealer Busted. You won!");
                System.exit(0);
            }

            if (checkDealerHand() >= checkPlayerHand()) {
                System.out.println("Dealers hand is " + checkDealerHand() + ", Your hand sum is " + checkPlayerHand());
                System.out.println("Dealer won!");
                System.exit(0);
            } else {
                System.out.println("Your hand sum is " + checkPlayerHand() + ", Dealer's hand sum is " + checkDealerHand());
                System.out.println("You won!");
                System.exit(0);
            }
        }
    }

    private void createDeck() {
        String[] suits = new String[]{"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 13; i++) {
                Card card = new Card();
                card.suit = suits[j];
                card.rank = i;
                deck.add(card);
            }
        }
    }

    private void showDeck() {
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
        }
    }

    private void dealToPlayer() {
        Card card = (Card) deck.remove(0);
        playerCards.add(card);
    }

    private void dealToDealer() {
        Card card = (Card) deck.remove(0);
        dealerCards.add(card);
    }

    private void showPlayerCards() {
        System.out.println("");
        System.out.println("YOUR HAND: ");
        for (int i = 0; i < playerCards.size(); i++) {
            Card card = (Card) playerCards.get(i);
            if (card.rank == 1 || card.rank >= 11) {
                switch (card.rank) {
                    case 1:
                        System.out.println("Ace of " + card.suit);
                        break;
                    case 11:
                        System.out.println("Jack of " + card.suit);
                        break;
                    case 12:
                        System.out.println("Queen of " + card.suit);
                        break;
                    case 13:
                        System.out.println("King of " + card.suit);
                        break;
                }
            } else {
                System.out.println(card.rank + " of " + card.suit);
            }
        }
        System.out.println("The player's hand sum is " + checkPlayerHand());
        if (checkPlayerHand() > 21) {
            System.out.println("You Busted. Dealer won!");
            System.exit(0);
        }
    }

    private void showDealerCards() {
        System.out.println("");
        System.out.println("DEALER'S HAND: ");
        for (int i = 0; i < dealerCards.size(); i++) {
            Card card = (Card) dealerCards.get(i);
            if (card.rank == 1 || card.rank >= 11) {
                switch (card.rank) {
                    case 1:
                        System.out.println("Ace of " + card.suit);
                        break;
                    case 11:
                        System.out.println("Jack of " + card.suit);
                        break;
                    case 12:
                        System.out.println("Queen of " + card.suit);
                        break;
                    case 13:
                        System.out.println("King of " + card.suit);
                        break;
                }
            } else {
                System.out.println(card.rank + " of " + card.suit);
            }
        }
        System.out.println("The dealer's hand sum is " + checkDealerHand());
    }

    private int checkPlayerHand() {
        int playerHandSum = 0;
        for (int i = 0; i < playerCards.size(); i++) {
            Card c = (Card) playerCards.get(i);
            playerHandSum += (c.rank < 10 ? c.rank : 10);
        }
        return playerHandSum;
    }

    private int checkDealerHand() {
        int dealerHandSum = 0;
        for (int i = 0; i < dealerCards.size(); i++) {
            Card c = (Card) dealerCards.get(i);
            dealerHandSum += (c.rank < 10 ? c.rank : 10);
        }
        return dealerHandSum;
    }
}//end class
