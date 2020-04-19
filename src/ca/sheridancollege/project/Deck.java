/*
 * Arianna Biernacki & Devi Sharma
 * Software Design
 * Deliverable 3
 * Winter Term - 2020
 *
 */
package Game;

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

    public void showDeck() {
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
        }
    }

    public void dealToPlayer() {
        Card card = (Card) deck.remove(0);
        playerCards.add(card);
    }

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
        System.out.println("The player's hand sum is " + checkPlayerHand());
        if (checkPlayerHand() > 21) {
            System.out.println("You Busted. Dealer won!");
            System.exit(0);
        }
    }

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
        System.out.println("The dealer's hand sum is " + checkDealerHand());
    }
    
    public int checkPlayerHand() {
        int playerHandSum = 0;
        for (int i = 0; i < playerCards.size(); i++) {
            Card c = (Card) playerCards.get(i);
            playerHandSum += (c.rank < 10 ? c.rank : 10);
        }
        return playerHandSum;
    }

    public int checkDealerHand() {
        int dealerHandSum = 0;
        for (int i = 0; i < dealerCards.size(); i++) {
            Card c = (Card) dealerCards.get(i);
            dealerHandSum += (c.rank < 10 ? c.rank : 10);
        }
        return dealerHandSum;
    }
}
