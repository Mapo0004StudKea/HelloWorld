package XVII_Eksempler_Fra_ChatGPT;

import java.util.ArrayList;
import java.util.Collections;

public class PokerAppVersion2 {
    public static void main(String[] args) {
        // Create a deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // Create two players
        PokerPlayerVersion2 player1 = new PokerPlayerVersion2("Player 1");
        PokerPlayerVersion2 player2 = new PokerPlayerVersion2("Player 2");

        // Deal five cards to each player from the shuffled deck
        for (int i = 0; i < 5; i++) {
            player1.addToHand(deck.drawCard());
            player2.addToHand(deck.drawCard());
        }

        // Print player information
        System.out.println(player1);
        System.out.println(player2);
    }
}
class PokerPlayerVersion2 {
    private final String name;
    private final ArrayList<CardVersion2> hand;

    public PokerPlayerVersion2(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addToHand(CardVersion2 card) {
        hand.add(card);
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand;
    }
}

class CardVersion2 implements Comparable<CardVersion2> {
    private final String suit;
    private final String rank;

    public CardVersion2(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public int compareTo(CardVersion2 other) {
        // Compare cards based on rank (e.g., Ace < King < Queen < ...)
        return rank.compareTo(other.getRank());
    }
}

class Deck {
    private final ArrayList<CardVersion2> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new CardVersion2(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public CardVersion2 drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null; // No cards left in the deck
    }
}