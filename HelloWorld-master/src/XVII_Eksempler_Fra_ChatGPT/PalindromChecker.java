package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, der undersøger, om en tekst er et palindrom,
dvs. med samme stavning forfra og bagfra (som f.eks. "regninger", "russerdressur", "vær dog god ræv").
(vink: Træk de enkelte tegn ud af strengene med substring(n,n+1) og husk,
at strengobjekter skal sammenlignes med .equals()-metoden: s1.equals(s2)).
 */
public class PalindromChecker {
    public static void main(String[] args) {
        // Opret en Scanner til at indlæse brugerens input
        Scanner scanner = new Scanner(System.in);

        // Indlæs en tekststreng fra brugeren
        System.out.print("Indtast en tekst: ");
        String inputTekst = scanner.nextLine();

        // Fjern mellemrum og konverter teksten til små bogstaver (case-insensitive)
        String rensetTekst = inputTekst.replaceAll("\\s", "").toLowerCase();

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
Dette program fjerner først mellemrum fra teksten og konverterer den til små bogstaver (case-insensitive)
ved at bruge replaceAll-metoden. Derefter bruger det en metode erPalindrom til at undersøge,
om den rensede tekst er et palindrom ved at sammenligne tegn fra starten og slutningen af teksten.
Hvis teksten er et palindrom, udskriver programmet en passende besked.
 */