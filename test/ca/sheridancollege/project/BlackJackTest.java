/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import Game.BlackJack;
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
public class BlackJackTest {
    
    public BlackJackTest() {
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
     * Test of start method, of class BlackJack.
     */
   @Test
   public void userInputGood(){
       System.out.println("Good input");
   String s = "Hit";
   boolean expResult= true;
   boolean result = BlackJack.userInput(s);
   assertEquals(expResult,result);
   }
    @Test
   public void userInputBad(){
       System.out.println("Bad input");
   String s = "$it";
   boolean expResult= false;
   boolean result = BlackJack.userInput(s);
   assertEquals(expResult,result);
   
   
   
   }
    @Test
   public void userInputBoundary(){
       System.out.println("Boundary input");
   String s = "S";
   boolean expResult= true;
   boolean result = BlackJack.userInput(s);
   assertEquals(expResult,result);
   
   
   
   }
   
   
   
   
}
