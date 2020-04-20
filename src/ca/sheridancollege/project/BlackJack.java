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
        
        //infinite loop to run game
        while (true) {

            System.out.println();
            
            //Checks if the dealer's hand busts when game just begins
            if (deck.checkDealerHand() > 21) {
                System.out.println("Dealer's hand sum is " + deck.checkDealerHand());
                System.out.println("Dealer Busted. You won!");
                System.exit(0);
            }

            //Checks if the player's hand busts when game just begins
            if (player.checkPlayerHand() > 21) {
                System.out.println("Your hand sum is " + deck.checkPlayerHand());
                System.out.println("You Busted. Dealer won!");
                System.exit(0);
            }

            System.out.println("---------------------------------------------------------");
            System.out.println("                     YOUR TURN                     ");
            
            //Player's turn
            OUTER_LOOP:
           
            //infinite loop until player stays
            while (true) {
                System.out.println("Hit or stay?");
                
                //Scanner read's player's input to hit or stay
                String playerAns = input.nextLine();
                
                //test case
                if(BlackJack.userInput(playerAns)){
                    
                //If player chooses hit, deal a card to the player and show the new hand
                if (playerAns.equals("h") || playerAns.equals("hit") || playerAns.equals("H") || playerAns.equals("Hit") || playerAns.equals("HIT")) {
                    deck.dealToPlayer();
                    deck.showPlayerCards();
                } 
                    //If player chooses to stay, break out of the loop
                    else if(playerAns.equals("s") || playerAns.equals("stay") || playerAns.equals("S") || playerAns.equals("Stay") || playerAns.equals("STAY")){
                    break OUTER_LOOP;
                }
            }
                else{
                    System.out.println("Give valid input");
                    }
            }
            
            //Dealer's hand
            OUTER_LOOP:
            while (true) {
                
                //if dealer's hand is less than 16, deal a card to dealer and show the dealer's new hand
                if (deck.checkDealerHand() < 16) {
                    System.out.println("---------------------------------------------------------");
                    System.out.println("                   DEALER'S TURN                   ");
                    deck.dealToDealer();
                    deck.showDealerCards();
                }
                break;
            }

            //If dealer's hand is over 21, dealer busts and system exits
            if (deck.checkDealerHand() > 21) {
                System.out.println("Dealer Busted. You won!");
                System.exit(0);
            }

            //If dealer's hand is greater or equal to player's hand, dealer wins
            if (deck.checkDealerHand() >= deck.checkPlayerHand()) {
                System.out.println("Dealers hand is " + deck.checkDealerHand() + ", Your hand sum is " + deck.checkPlayerHand());
                System.out.println("Dealer won!");
                System.exit(0);
            } 
            
            //If player's hand is greater than dealer's hand, then player wins
            else {
                System.out.println("Your hand sum is " + deck.checkPlayerHand() + ", Dealer's hand sum is " + deck.checkDealerHand());
                System.out.println("You won!");
                System.exit(0);
            }
        }
    }
    
    //Test
    public static boolean userInput(String s){
    if(s.equalsIgnoreCase("Hit")||s.equalsIgnoreCase("h")||s.equalsIgnoreCase("Stay")||s.equalsIgnoreCase("s")){
    return true ;
    }
    return false;
    
    }
}
