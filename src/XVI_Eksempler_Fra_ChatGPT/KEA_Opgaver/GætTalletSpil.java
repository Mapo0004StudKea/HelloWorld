package XVI_Eksempler_Fra_ChatGPT.KEA_Opgaver;

import java.util.Random;
import java.util.Scanner;

/*
Lav spillet "Gæt hvilket tal jeg tænker på": Lav et program, der husker et tal fra 1 til 20, som brugeren
skal gætte. Her er et forslag til dialogen med brugeren:
Gæt et tal: 8
Tallet jeg tænker på er højere.
Gæt et tal: 13
Tallet jeg tænker på er lavere.
Gæt et tal: 11
Det er det rigtige tal! Du brugte 3 forsøg.
Vink: Et tilfældigt tal mellem 1 og 20 kan fås
 */
public class GætTalletSpil {
    public static void main(String[] args) {
        // Opret en tilfældig generator
        Random random = new Random();

        // Generer et tilfældigt tal mellem 1 og 20
        int hemmeligtTal = random.nextInt(20) + 1;

        // Initialiser variabler til at tælle forsøg
        int forsøg = 0;

        // Opret en Scanner til at læse brugerens gæt
        Scanner scanner = new Scanner(System.in);

        // Velkomstbesked
        System.out.println("Velkommen til Gæt Tallet spillet!");
        System.out.println("Jeg tænker på et tal mellem 1 og 20.");

        // Start spillet
        while (true) {
            System.out.print("Gæt et tal: ");
            int gæt = scanner.nextInt();
            forsøg++;

            if (gæt < hemmeligtTal) {
                System.out.println("Tallet jeg tænker på er højere.");
            } else if (gæt > hemmeligtTal) {
                System.out.println("Tallet jeg tænker på er lavere.");
            } else {
                System.out.println("Det er det rigtige tal! Du brugte " + forsøg + " forsøg.");
                break; // Afslut spillet, når brugeren gætter det rigtige tal
            }
        }

        // Luk scanneren
        scanner.close();
    }
}
/*
Dette program genererer et tilfældigt tal mellem 1 og 20, som brugeren skal gætte.
Programmet holder styr på antallet af forsøg, indtil brugeren gætter det rigtige tal.
Når spillet er slut, udskriver det antallet af forsøg, det tog brugeren at gætte det rigtige tal.
 */