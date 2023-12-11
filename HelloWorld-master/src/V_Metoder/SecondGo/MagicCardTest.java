package V_Metoder.SecondGo;

import java.util.Scanner;

public class MagicCardTest {
    public static void main(String[] args) {
        /*
        MagicCard("Lightning Bolt", ManaValue, "Sorcery", "Deals 3 damage to any target", "n/a", "n/a");
        MagicCard("Demonic Tutor", "Sorcery", "You may search your library for a card and put it unto your hand, shuffle your library afterwards", "n/<", "n/<");

         */
    }
    public static void MagicCard(String name, String ManaValue, String type, String cardText, String flavorText, String PD) {
        System.out.println(name);
        //ManaValue = add.Mana(ManaValue);
        System.out.println(type);
        System.out.println(cardText);
        System.out.println(flavorText);
        System.out.println(PD);
    }
    static String Mana(String Manacost) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mana value");
        Manacost = scanner.nextLine();
        return Manacost;
    }
}
