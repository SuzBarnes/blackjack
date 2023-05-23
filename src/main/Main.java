package main;


public class Main {
    //need to figure out where balance is going to be placed. Seems like most likely to be in Player?
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        runGame();
//        hitOrStick();
        endGame();

    }

    //    int totalValue = 0;
    Console console = new Console();

    public void runGame() {
        int bet;
        System.out.println("Welcome to The Acme Casino." + "\nPlease place your bets!");
        bet = console.askUserForInt();
        System.out.println("You have bet £" + bet);

        Deck deck = new Deck();

        deck.generateDeck();

        deck.shuffle();

        Card c1 = deck.removeCard();
        System.out.println(c1.pointValue);
        Card c2 = deck.removeCard();
        System.out.println(c2.pointValue);


        Hand hand = new Hand();
        hand.hit(c1);
        hand.hit(c2);
        //hand takes a card into the array

        System.out.println(hand.points);

//
//        System.out.println("Your cards are " + hand);
    }

//    public void hitOrStick(){
//        System.out.println("Your total is: " + "\nEnter h to draw another card or anything else to stick.");
//        String hitOrStick = console.askUser();
//
//        if(hitOrStick == "h"){
//            hand.hit();
//        }
//        else {
//
//        }
//
//    }


    public void endGame() {
//        System.out.println("Dealer has: " + "You have: " + totalValue);
//        if(you win){
//        System.out.println("You win! Your total balance is " + balance );}
//        else(dealer wins){
//            System.out.println("You lose! Your total balance remains at " + balance);
//        }
    }

}
