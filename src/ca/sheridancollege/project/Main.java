/*
 * Arianna Biernacki & Devi Sharma
 * Software Design
 * Deliverable 3
 * Winter Term - 2020
 *
 */
package Game;

public class Main extends BlackJack{
    public static void main(String[] args){
        BlackJack game = new BlackJack() {};
        System.out.println("*********************************************************");
        System.out.println("***************   Welcome to the table!   ***************");
        System.out.println("*********************************************************");
        game.start();
    }
}
