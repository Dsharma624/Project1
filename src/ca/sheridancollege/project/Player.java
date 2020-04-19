/*
 * Arianna Biernacki & Devi Sharma
 * Software Design
 * Deliverable 3
 * Winter Term - 2020
 *
 */
package Game;

/**
 *
 * @author arian
 */
public abstract class Player extends Deck{
    Deck deck = new Deck() {};
    
    private String name;
    
    public Player(String playerName){
        this.name = playerName;
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
}
