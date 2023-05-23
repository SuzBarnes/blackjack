package main;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> hand = new ArrayList<Card>();
    int points; //total number of points in hand
    int bet;
    boolean isBusted;//is bust >21
    boolean isNatural; //blackjack



    public void hit(Card card){
       hand.add(card);
    };



    public int calculatePointsInHand(){
        int handValue = 0;
        for(int i=0; i<hand.size(); i++){
            if (hand.get(i).isAce && handValue>=11){
                hand.get(i).pointValue = 1;
                handValue += hand.get(i).pointValue;
            }

            handValue += hand.get(i).pointValue;
        }
        return points = handValue;
    }
    public void stand(){
        //
    };
    //cards
    //points
    //bet
    //bust >21, loses
    // blackJack - hand = 21 with 2 cards
    //method hit()
    //method stand()
    int totalValue = 0;
}
