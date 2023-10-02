package XVI_Eksempler_Fra_ChatGPT.Metoder;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random rng = new Random();
        int hemmeligtTal = rng.nextInt(100) + 1;
        System.out.println("Jeg tænker på et tal mellem 1 og 100. prøv at gætte dette tal.");
        gætEtTalSpil(hemmeligtTal);
    }

    public static void gætEtTalSpil(int hemmeligtNummer) {
        int gæt;
        Scanner scanner = new Scanner(System.in);
        int forsøg = 0;
        while (true) {
            forsøg++;
            System.out.println("indtast dit gæt: ");
            gæt = scanner.nextInt();

            if (gæt == hemmeligtNummer) {
                System.out.println("Tillykke! Du har gættet rigtigt.");
                System.out.println("Du har brug "+forsøg+" forsøg.");
                break;
            } else if (gæt < hemmeligtNummer) {
                System.out.println("Tallet jeg tænker på er højere, prøv igen.");
            } else {
                System.out.println("Tallet jeg tænker på er lavere, prøv igen.");
            }
        }

        scanner.close();
    }
}
