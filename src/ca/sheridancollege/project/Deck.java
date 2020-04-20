/*
 * Arianna Biernacki & Devi Sharma
 * Software Design
 * Deliverable 3
 * Winter Term - 2020
 *
 */
package Game;


//Import
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author arian
 */
public abstract class Deck extends Card {

    ArrayList deck = new ArrayList();
    ArrayList playerCards = new ArrayList();
    ArrayList dealerCards = new ArrayList();

    //Create the deck
    public void createDeck() {
        String[] suits = new String[]{"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 13; i++) {
                Card card = new Card() {};
                card.suit = suits[j];
                card.rank = i;
                deck.add(card);
            }
        }
    }

    //Print the deck
    public void showDeck() {
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    //Shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
        }
    }

    //Deal a card to the player
    public void dealToPlayer() {
        Card card = (Card) deck.remove(0);
        playerCards.add(card);
    }

    //Deal a card to the dealer
    public void dealToDealer() {
        Card card = (Card) deck.remove(0);
        dealerCards.add(card);
    }

    public ArrayList getDeck() {
        return deck;
    }

    public void setDeck(ArrayList deck) {
        this.deck = deck;
    }

    public ArrayList getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(ArrayList playerCards) {
        this.playerCards = playerCards;
    }

    public ArrayList getDealerCards() {
        return dealerCards;
    }

    public void setDealerCards(ArrayList dealerCards) {
        this.dealerCards = dealerCards;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    //Print's players hand
    public void showPlayerCards() {
        System.out.println("");
        System.out.println("YOUR HAND: ");
        for (int i = 0; i < playerCards.size(); i++) {
            Card card = (Card) playerCards.get(i);
            if (card.rank == 1 || card.rank >= 11) {
                switch (card.rank) {
                    case 1:
                        System.out.println("   Ace of " + card.suit);
                        break;
                    case 11:
                        System.out.println("   Jack of " + card.suit);
                        break;
                    case 12:
                        System.out.println("   Queen of " + card.suit);
                        break;
                    case 13:
                        System.out.println("   King of " + card.suit);
                        break;
                }
            } else {
                System.out.println("   " + card.rank + " of " + card.suit);
            }
        }
        
        //Prints the sum of the player's hand
        System.out.println("The player's hand sum is " + checkPlayerHand());
        
        //If the hand is over 21 the player busts and system exits
        if (checkPlayerHand() > 21) {
            System.out.println("You Busted. Dealer won!");
            System.exit(0);
        }
    }

    //Prints dealers hand
    public void showDealerCards() {
        System.out.println("");
        System.out.println("DEALER'S HAND: ");
        for (int i = 0; i < dealerCards.size(); i++) {
            Card card = (Card) dealerCards.get(i);
            if (card.rank == 1 || card.rank >= 11) {
                switch (card.rank) {
                    case 1:
                        System.out.println("   Ace of " + card.suit);
                        break;
                    case 11:
                        System.out.println("   Jack of " + card.suit);
                        break;
                    case 12:
                        System.out.println("   Queen of " + card.suit);
                        break;
                    case 13:
                        System.out.println("   King of " + card.suit);
                        break;
                }
            } else {
                System.out.println("   " + card.rank + " of " + card.suit);
            }
        }
        
        //prints the sum of the dealer's hand
        System.out.println("The dealer's hand sum is " + checkDealerHand());
    }
    
    //Calculates player's hand sum
    public int checkPlayerHand() {
        int playerHandSum = 0;
        for (int i = 0; i < playerCards.size(); i++) {
            Card c = (Card) playerCards.get(i);
            playerHandSum += (c.rank < 10 ? c.rank : 10);
        }
        return playerHandSum;
    }

    //Calculates dealer's hand sum
    public int checkDealerHand() {
        int dealerHandSum = 0;
        for (int i = 0; i < dealerCards.size(); i++) {
            Card c = (Card) dealerCards.get(i);
            dealerHandSum += (c.rank < 10 ? c.rank : 10);
        }
        return dealerHandSum;
    }
}
