package test;
import main.Card;
import main.Deck;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MainTest {
        @Test
        public void testCardValue() {
            Card card = new Card(2, false);
            assertEquals(2, card.pointValue);
        }

        @Test
        public void checkSizeOfDeckGenerated() {
            Deck deck = new Deck();
            deck.generateDeck();
            assertEquals(52, deck.deck.size());
        }
    @Test
    public void checkValueOfFirstCard() {
        Deck deck = new Deck();
        deck.generateDeck();
        assertEquals(2, deck.deck.get(0).pointValue);
    }

    @Test
    public void checkShufflingWorks() {
        Deck deck = new Deck();
        deck.generateDeck();
        assertNotEquals(deck.deck.get(0), deck.shuffle().get(0));


         //next?
        // you want to volunteer?
        // DO NT BE RIDICULOUS!!
        //HAHA I will volunteer you and then i will mess your screen up in secret mwhahahaha
       // wow im shoked cant even type :D
        //mwhahahahaahaha, i like this codewithme thing though makes it a lot more fun
        //yep we should have teamed up earlier!
        //lesson learned. We will have to do that tomorrow :)
        //im in :)
        // wooooop, the arts and crafts thing is still on in the office tomorrow btw, if you want to come! :)
        // //i am meeting my brother a bit later though as he is visiting for 1 day lol
        //I think ill have to come got nothing on :) lol haha
        // ill see how i get on.. im back to stressing :D everyone was so good today
// hehe i was only joking :) yes people are good but at least we learned a lot! should defo have started sooner but i think
// everyone wanted to try
        //yeah :)
        //going to connect to VPN so might disconnect as i need to check a ticket i've got given////
    }

    // give me two secs to copy stuff over ok?
    // sure :) i can push to github if you want? or i can wait :)
    // yeah please github :) will be easier :)
    //obviuosly with comments make it public and share to tutors lol

}
