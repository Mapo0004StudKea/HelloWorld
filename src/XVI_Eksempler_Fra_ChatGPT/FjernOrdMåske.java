package XVI_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, der fjerner den første forekomst af ordet "måske" fra en tekst.
Ændr derefter programmet, så det fjerner alle forekomster af ordet (brug en løkke).
 */
public class FjernOrdMåske {
    public static void main(String[] args) {
        // Opret en Scanner til at indlæse brugerens input
        Scanner scanner = new Scanner(System.in);

        // Indlæs en tekststreng fra brugeren
        System.out.print("Indtast en tekst: ");
        String inputTekst = scanner.nextLine();

        // Først fjern den første forekomst af ordet "måske"
        String tekstUdenMåske = inputTekst.replaceFirst("måske", "");

        System.out.println("Tekst uden den første forekomst af 'måske':");
        System.out.println(tekstUdenMåske);

        // Derefter fjern alle forekomster af ordet "måske" ved hjælp af en løkke
        String[] ord = inputTekst.split(" ");
        StringBuilder tekstUdenAlleMåske = new StringBuilder();

        for (String ordet : ord) {
            if (!ordet.equals("måske")) {
                tekstUdenAlleMåske.append(ordet).append(" ");
            }
        }

        System.out.println("Tekst uden alle forekomster af 'måske':");
        System.out.println(tekstUdenAlleMåske.toString().trim());

        // Luk scanneren
        scanner.close();
    }
}
/*
Dette program bruger først replaceFirst-metoden til at fjerne den første forekomst af ordet "måske".
Derefter bruger det en løkke til at fjerne alle forekomster af ordet ved at opdele teksten i ord og kun tilføje de ord,
der ikke er "måske", til en ny streng.
 */
