/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author megha,2019
 * @modifier Sehyun, 2019
 * @modifier Kowsiya, 2019
 */

package project;

import java.util.ArrayList;
import java.util.Collections;

public class Player {

    //properties of Player class
    private final String name;
    private ArrayList<Card> cards;
    private int shuffleTiming;

    //constructor of player class
    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }
    
    //method that returns the player name
    public String getPlayerName() {
        return name;
    }
    
    //method the sets the cards
    public void setCards(ArrayList<Card> cards) {
        addCards(cards);
        shuffleTiming = this.cards.size();
    }

    //method that returns the cards
    public ArrayList<Card> getCardInfo() {
        return this.cards;
    }
    
    //method to get a card
    public Card getOneCard() {
        if (shuffleTiming == 0) {
            shuffle();
        }
        shuffleTiming--;
        return this.cards.remove(0);
    }
    
    //method to add a card to cards 
    public void addCards(ArrayList<Card> cards) {
        for (Card c : cards) {
            this.cards.add(c);
        }
    }
    
    //method to suffle the cards
    public void shuffle() {
        Collections.shuffle(this.cards);
        shuffleTiming = this.cards.size();
    }
    
    //pverridden method the return string of card class
    @Override
    public String toString() {
        String format = "%s has %d cards.";
        return String.format(format, name, this.cards.size());
    }

}
