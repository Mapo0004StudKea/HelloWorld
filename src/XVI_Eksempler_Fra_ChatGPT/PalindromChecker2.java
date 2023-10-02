package XVI_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Udvid programmet til at tage højde for store/små bogstaver, tegnsætning og mellemrum,
sådan at de følgende palindromer også genkendes: "Selmas lakserøde garagedøre skal samles"
og "Åge lo, da baronesse Nora bad Ole gå".
 */
public class PalindromChecker2 {
    public static void main(String[] args) {
        // Opret en Scanner til at indlæse brugerens input
        Scanner scanner = new Scanner(System.in);

        // Indlæs en tekststreng fra brugeren
        System.out.print("Indtast en tekst: ");
        String inputTekst = scanner.nextLine();

        // Fjern tegnsætning og mellemrum, og konverter teksten til små bogstaver (case-insensitive)
        String rensetTekst = fjernTegnOgMellemrum(inputTekst).toLowerCase();

        // Undersøg om den rensede tekst er et palindrom
        boolean erPalindrom = erPalindrom(rensetTekst);

        if (erPalindrom) {
            System.out.println("Teksten er et palindrom.");
        } else {
            System.out.println("Teksten er ikke et palindrom.");
        }

        // Luk scanneren
        scanner.close();
    }

    // Metode til at fjerne tegnsætning og mellemrum fra en tekst
    public static String fjernTegnOgMellemrum(String tekst) {
        return tekst.replaceAll("[^a-zA-ZøæåØÆÅ]", "");
    }

    // Metode til at undersøge om en streng er et palindrom
    public static boolean erPalindrom(String tekst) {
        int længde = tekst.length();

        for (int i = 0; i < længde / 2; i++) {
            if (tekst.charAt(i) != tekst.charAt(længde - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
/*
Denne opdaterede version af programmet bruger fjernTegnOgMellemrum-metoden til at fjerne alle tegnsætningstegn og
mellemrum fra teksten ved hjælp af en regulær udtryk ([^a-zA-ZøæåØÆÅ]).
Derefter konverteres den rensede tekst til små bogstaver, før vi undersøger, om den er et palindrom.
Nu kan programmet genkende palindromer, der indeholder store og små bogstaver, tegnsætning og mellemrum.
 */