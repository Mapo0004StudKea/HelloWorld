package XII_Abstraktion_og_delegering.Opgaver.DiceGame;

import java.util.Random;

public class Dice {
    static Random gen = new Random(); //deles om den samme generator.
    int roll() {
        return gen.nextInt(6)+1;
    }

    //Used for testing, is irrelevant in the final program
    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i=1; i <=10; i++) {
            System.out.println(dice.roll());
        }
    }
}
