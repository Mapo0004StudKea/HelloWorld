package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, der tæller antallet af mellemrum i en tekst.
 */
public class TælMellemrum {
    public static void main(String[] args) {
        // Opret en Scanner til at indlæse brugerens input
        Scanner scanner = new Scanner(System.in);

        // Indlæs en tekststreng fra brugeren
        System.out.print("Indtast en tekststreng: ");
        String inputTekst = scanner.nextLine();

        // Initialiser en tæller til antallet af mellemrum
        int antalMellemrum = 0;

        // Gennemgå hver karakter i tekststrengen
        for (int i = 0; i < inputTekst.length(); i++) {
            char karakter = inputTekst.charAt(i);
            if (karakter == ' ') {
                antalMellemrum++;
            }
        }

        System.out.println("Antallet af mellemrum i teksten er: " + antalMellemrum);

        // Luk scanneren
        scanner.close();
    }
}
/*
Dette program bruger en for-løkke til at gennemgå hver karakter i den indtastede tekststreng og
tælle antallet af mellemrum ved at sammenligne hver karakter med mellemrumstegnet ' '.
Til sidst udskriver programmet antallet af mellemrum i teksten.
 */