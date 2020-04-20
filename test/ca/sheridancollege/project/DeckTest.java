/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import Game.Deck;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createDeck method, of class Deck.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        Deck instance = new DeckImpl();
        instance.createDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDeck method, of class Deck.
     */
    @Test
    public void testShowDeck() {
        System.out.println("showDeck");
        Deck instance = new DeckImpl();
        instance.showDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleDeck method, of class Deck.
     */
    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        Deck instance = new DeckImpl();
        instance.shuffleDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealToPlayer method, of class Deck.
     */
    @Test
    public void testDealToPlayer() {
        System.out.println("dealToPlayer");
        Deck instance = new DeckImpl();
        instance.dealToPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealToDealer method, of class Deck.
     */
    @Test
    public void testDealToDealer() {
        System.out.println("dealToDealer");
        Deck instance = new DeckImpl();
        instance.dealToDealer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class Deck.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Deck instance = new DeckImpl();
        ArrayList expResult = null;
        ArrayList result = instance.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeck method, of class Deck.
     */
    @Test
    public void testSetDeck() {
        System.out.println("setDeck");
        ArrayList deck = null;
        Deck instance = new DeckImpl();
        instance.setDeck(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerCards method, of class Deck.
     */
    @Test
    public void testGetPlayerCards() {
        System.out.println("getPlayerCards");
        Deck instance = new DeckImpl();
        ArrayList expResult = null;
        ArrayList result = instance.getPlayerCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerCards method, of class Deck.
     */
    @Test
    public void testSetPlayerCards() {
        System.out.println("setPlayerCards");
        ArrayList playerCards = null;
        Deck instance = new DeckImpl();
        instance.setPlayerCards(playerCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDealerCards method, of class Deck.
     */
    @Test
    public void testGetDealerCards() {
        System.out.println("getDealerCards");
        Deck instance = new DeckImpl();
        ArrayList expResult = null;
        ArrayList result = instance.getDealerCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDealerCards method, of class Deck.
     */
    @Test
    public void testSetDealerCards() {
        System.out.println("setDealerCards");
        ArrayList dealerCards = null;
        Deck instance = new DeckImpl();
        instance.setDealerCards(dealerCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class Deck.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Deck instance = new DeckImpl();
        String expResult = "";
        String result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuit method, of class Deck.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        String suit = "";
        Deck instance = new DeckImpl();
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class Deck.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Deck instance = new DeckImpl();
        int expResult = 0;
        int result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRank method, of class Deck.
     */
    @Test
    public void testSetRank() {
        System.out.println("setRank");
        int rank = 0;
        Deck instance = new DeckImpl();
        instance.setRank(rank);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showPlayerCards method, of class Deck.
     */
    @Test
    public void testShowPlayerCards() {
        System.out.println("showPlayerCards");
        Deck instance = new DeckImpl();
        instance.showPlayerCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDealerCards method, of class Deck.
     */
    @Test
    public void testShowDealerCards() {
        System.out.println("showDealerCards");
        Deck instance = new DeckImpl();
        instance.showDealerCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPlayerHand method, of class Deck.
     */
    @Test
    public void testCheckPlayerHand() {
        System.out.println("checkPlayerHand");
        Deck instance = new DeckImpl();
        int expResult = 0;
        int result = instance.checkPlayerHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDealerHand method, of class Deck.
     */
    @Test
    public void testCheckDealerHand() {
        System.out.println("checkDealerHand");
        Deck instance = new DeckImpl();
        int expResult = 0;
        int result = instance.checkDealerHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DeckImpl extends Deck {
    }
    
}
