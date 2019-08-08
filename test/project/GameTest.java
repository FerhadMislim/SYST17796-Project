/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static project.Card.Suit.*;
import static project.Card.Value.*;

/**
 *
 * @author Kowsiya , Sehyun, Yui and Jennie
 */
public class GameTest {
    
    public GameTest() {
    }

    /**
     * Test of checkFinalWinner method, of class Game.
     */
    @Test
    public void testCheckFinalWinnerGood() {
        System.out.println("checkFinalWinner Good");
        Player p1 = new Player("player1");
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CLUB, ACE));
        p1.setCards(cards);
        Player p2 = new Player("player2");
        Game instance = new Game("War Game");
        String expResult = "player1";
        String result = instance.checkFinalWinner(p1, p2);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkFinalWinner method, of class Game.
     */
    @Test
    public void testCheckFinalWinnerBad() {
        System.out.println("checkFinalWinner Bad");
        Player p1 = new Player("player1");
        Player p2 = new Player("player2");
        ArrayList<Card> cards = new ArrayList<>();
        ArrayList<Card> cards2 = new ArrayList<>();
        cards.add(new Card(CLUB, ACE));
        cards2.add(new Card(DIAMONDS, FIVE));
        p2.setCards(cards);
        p1.setCards(cards2);
        Game instance = new Game("War Game");
        String expResult = "No winner";
        String result = instance.checkFinalWinner(p1, p2);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkFinalWinner method, of class Game.
     */
    @Test
    public void testCheckFinalWinnerBoundary() {
        System.out.println("checkFinalWinner Boundary");
        Player p1 = new Player("player1");
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CLUB, ACE));
        cards.add(new Card(DIAMONDS, FIVE));
        cards.add(new Card(HEARTS, JACK));
        cards.add(new Card(SPADE, KING));
        cards.add(new Card(DIAMONDS, TEN));
        Player p2 = new Player("player2");
        p2.setCards(cards);
        Game instance = new Game("War Game");
        String expResult = "player2";
        String result = instance.checkFinalWinner(p1, p2);
        assertEquals(expResult, result);
    }
    /**
     * Test of checkNumCards method, of class Game.
     */
    @Test
    public void testCheckNumCardsGood() {
        System.out.println("checkNumCards Good");
        Player p1 = new Player("p1");
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CLUB, ACE));
        cards.add(new Card(HEARTS, FIVE));
        cards.add(new Card(SPADE, QUEEN));
        p1.setCards(cards);
        Player p2 = new Player("p2");
        cards = new ArrayList<>();
        cards.add(new Card(HEARTS, TWO));
        cards.add(new Card(SPADE, TWO));
        cards.add(new Card(CLUB, TWO));
        p2.setCards(cards);
        Game instance = new Game("War Game");;
        boolean expResult = true;
        boolean result = instance.checkNumCards(p1, p2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkNumCards method, of class Game.
     */
    @Test
    public void testCheckNumCardsBad() {
        System.out.println("checkNumCards Bad");
        Player p1 = new Player("p1");
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CLUB, ACE));
        p1.setCards(cards);
        Player p2 = new Player("p2");
        Game instance = new Game("War Game");;
        boolean expResult = false;
        boolean result = instance.checkNumCards(p1, p2);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkNumCards method, of class Game.
     */
    @Test
    public void testCheckNumCardsBoudary() {
        System.out.println("checkNumCards Boundary");
        Player p1 = new Player("p1");
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(CLUB, ACE));
        p1.setCards(cards);
        Player p2 = new Player("p2");
        cards = new ArrayList<>();
        cards.add(new Card(CLUB, TWO));
        p2.setCards(cards);
        Game instance = new Game("War Game");;
        boolean expResult = true;
        boolean result = instance.checkNumCards(p1, p2);
        assertEquals(expResult, result);
    }

}
