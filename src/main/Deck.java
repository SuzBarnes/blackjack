package main;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public ArrayList<Card> deck = new ArrayList<>();

    public ArrayList<Card> shuffle() {
        System.out.println("Shuffled!");
        Collections.shuffle(deck);
        return deck;
    }
    public Card removeCard() {
        Card currCard = deck.get(0);   //  gets first card from deck
        deck.remove(0);
        return currCard;
    }
    public void generateDeck() {
        for (int i=2; i<=37; i++){ //changed to 2 for the value

            deck.add(new Card(i, false));
        }
        for (int i=1; i<=12; i++){
            deck.add(new Card(10,  false));

        }
        deck.add(new Card(11,  true));
        deck.add(new Card(11,  true));
        deck.add(new Card(11,  true));
        deck.add(new Card(11,  true));
    }
    public void dealCard() {

        deck.remove(removeCard());
        deck.remove(removeCard());
    }
}
