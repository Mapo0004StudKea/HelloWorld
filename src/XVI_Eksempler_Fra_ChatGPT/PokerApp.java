package XVI_Eksempler_Fra_ChatGPT;

/*
public class PokerApp {
    public static void main(String[] args) {
        ArrayList<CardVersion2> deck = new ArrayList<>();
        for (String suit : CardVersion2.SUITS) {
            for (String rank : CardVersion2.RANKS) {
                deck.add(new CardVersion2(suit, rank));
            }
        }
        Collections.shuffle(deck); // Shuffle the deck

        PokerPlayerVersion2 player1 = new PokerPlayerVersion2("Player 1"); // Create two players
        PokerPlayerVersion2 player2 = new PokerPlayerVersion2("Player 2");

        // Deal five cards to each player from the shuffled deck
        for (int i = 0; i < 5; i++) {
            player1.addCard(deck.remove(0)); // Remove and add the top card to player 1
            player2.addCard(deck.remove(0)); // Remove and add the top card to player 2
        }

        System.out.println(player1); // Print player information
        System.out.println(player2);
    }
}

class PokerPlayer {
    private String name;
    private ArrayList<CardVersion2> hand;

    public PokerPlayer(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(CardVersion2 card) {
        hand.add(card);
    }

    public CardVersion2 highestCard() {
        CardVersion2 highest = hand.get(0);
        for (CardVersion2 card : hand) {
            if (card.compareTo(highest) > 0) {
                highest = card;
            }
        }
        return highest;
    }

    public int noOfSpades() {
        int count = 0;
        for (CardVersion2 card : hand) {
            if (card.getSuit().equals("Spades")) {
                count++;
            }
        }
        return count;
    }

    public int noOfSuit(String suit) {
        int count = 0;
        for (CardVersion2 card : hand) {
            if (card.getSuit().equals(suit)) {
                count++;
            }
        }
        return count;
    }

    public boolean flush() {
        String suit = hand.get(0).getSuit();
        for (CardVersion2 card : hand) {
            if (!card.getSuit().equals(suit)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return name + ": " + hand;
    }
}

class Card implements Comparable<CardVersion2> {
    public static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
    public static final String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public int compareTo(CardVersion2 otherCard) {
        int rank1 = java.util.Arrays.asList(RANKS).indexOf(rank); // Compare cards based on their ranks
        int rank2 = java.util.Arrays.asList(RANKS).indexOf(otherCard.rank);
        return Integer.compare(rank1, rank2);
    }
}

 */