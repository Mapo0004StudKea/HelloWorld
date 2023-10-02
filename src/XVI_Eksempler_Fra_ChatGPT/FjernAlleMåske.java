package XVI_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, der finder og fjerner alle forekomster af ordet "måske" fra en tekst,
uanset om det er skrevet med store eller små bogstaver.
 */
public class FjernAlleMåske {
    public static void main(String[] args) {
        // Opret en Scanner til at indlæse brugerens input
        Scanner scanner = new Scanner(System.in);

        // Indlæs en tekststreng fra brugeren
        System.out.print("Indtast en tekst: ");
        String inputTekst = scanner.nextLine();

        // Konverter teksten til små bogstaver (case-insensitive)
        String tekstILowerCase = inputTekst.toLowerCase();

        // Fjern alle forekomster af ordet "måske"
        String tekstUdenMåske = tekstILowerCase.replace("måske", "");

        // Udskriv teksten uden "måske"
        System.out.println("Tekst uden 'måske':");
        System.out.println(tekstUdenMåske);

        // Luk scanneren
        scanner.close();
    }
}
/*
Dette program konverterer først teksten til små bogstaver ved hjælp af toLowerCase()-metoden for at sikre,
at det er case-insensitivt. Derefter bruger det replace-metoden til at fjerne alle forekomster af ordet "måske"
fra den konverterede tekst. Til sidst udskriver programmet teksten uden "måske".
 */