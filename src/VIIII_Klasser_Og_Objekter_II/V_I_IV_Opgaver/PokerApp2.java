package VIIII_Klasser_Og_Objekter_II.V_I_IV_Opgaver;
import java.util.ArrayList;

public class PokerApp2 {
    public static void main(String[] args) {

        PokerPlayer2 pp1 = new PokerPlayer2("Gitte");
        PokerPlayer2 pp2 = new PokerPlayer2("Søren");
        ArrayList<Card2> deck = new ArrayList<>();
        char[] suits = {'s', 'k', 'h', 'r'};
        int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for (int i : ranks) {
            for (char c : suits) {
                deck.add(new Card2(c, i));
            }
        }
        System.out.println(deck);
    }
}

class PokerPlayer2 {
    String name;
    PokerPlayer2(String n) {
        name = n;
    }
}

class Card2 {
    char c;
    int i;
    Card2(char suit, int rank) {
        c = suit;
        i = rank;
    }
    public String toString(){
        return "("+c+","+i+")";
    }
}