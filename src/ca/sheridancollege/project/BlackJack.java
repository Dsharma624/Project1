/*
 * Arianna Biernacki & Devi Sharma
 * Software Design
 * Deliverable 3
 * Winter Term - 2020
 *
 */
package Game;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Collections;

public abstract class BlackJack extends Deck{

    //Import Constructors
    String playerName;
    Deck deck = new Deck() {};
    Player  player = new Player(playerName) {};
    ArrayList playerCards = new ArrayList();
    ArrayList dealerCards = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void start() {
        deck.createDeck();
        deck.shuffleDeck();
        deck.dealToPlayer();
        deck.dealToPlayer();
        deck.dealToDealer();
        deck.dealToDealer();
        deck.showPlayerCards();
        deck.showDealerCards();
        game();
    }

    private void game() {
        
        while (true) {

            System.out.println();
            if (deck.checkDealerHand() > 21) {
                System.out.println("Dealer's hand sum is " + deck.checkDealerHand());
                System.out.println("Dealer Busted. You won!");
                System.exit(0);
            }

            if (player.checkPlayerHand() > 21) {
                System.out.println("Your hand sum is " + deck.checkPlayerHand());
                System.out.println("You Busted. Dealer won!");
                System.exit(0);
            }

            System.out.println("---------------------------------------------------------");
            System.out.println("                     YOUR TURN                     ");
            OUTER_LOOP:
            while (true) {
                System.out.println("Hit or stay?");
                String playerAns = input.nextLine();
                if (playerAns.equals("h") || playerAns.equals("hit") || playerAns.equals("H") || playerAns.equals("Hit") || playerAns.equals("HIT")) {
                    deck.dealToPlayer();
                    deck.showPlayerCards();
                } else if(playerAns.equals("s") || playerAns.equals("stay") || playerAns.equals("S") || playerAns.equals("Stay") || playerAns.equals("STAY")){
                    break OUTER_LOOP;
                }
            }

            OUTER_LOOP:
            while (true) {
                if (deck.checkDealerHand() < 16) {
                    System.out.println("---------------------------------------------------------");
                    System.out.println("                   DEALER'S TURN                   ");
                    dealToDealer();
                    deck.showDealerCards();
                }
                break;
            }

            if (deck.checkDealerHand() > 21) {
                System.out.println("Dealer Busted. You won!");
                System.exit(0);
            }

            if (deck.checkDealerHand() >= deck.checkPlayerHand()) {
                System.out.println("Dealers hand is " + deck.checkDealerHand() + ", Your hand sum is " + deck.checkPlayerHand());
                System.out.println("Dealer won!");
                System.exit(0);
            } else {
                System.out.println("Your hand sum is " + deck.checkPlayerHand() + ", Dealer's hand sum is " + deck.checkDealerHand());
                System.out.println("You won!");
                System.exit(0);
            }
        }
    }
}
