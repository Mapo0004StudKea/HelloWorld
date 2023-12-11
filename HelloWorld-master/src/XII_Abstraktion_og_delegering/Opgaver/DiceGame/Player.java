package XII_Abstraktion_og_delegering.Opgaver.DiceGame;

import java.util.Scanner;

public class Player {
    String Name;
    Cup cup = new Cup();
    int Points;

    Player (String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast navn på spiller: ");
        this.Name = name;
        Name = scanner.nextLine();
    }
    int count=0;
    int turn () {
        cup.roll();
        Points = Points+cup.getSum();
        count++;
        return count;
    }

    public static void main(String[] args) {
        Player p = new Player("Test");
        while (p.Points<100){
            p.turn();
            System.out.println(p.Points);
            ;
        }
    }
}
