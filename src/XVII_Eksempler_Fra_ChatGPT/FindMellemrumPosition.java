package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, der finder positionen af det første mellemrum i en streng.
(vink: Brug metoden indexOf(" "))
 */
public class FindMellemrumPosition {
    public static void main(String[] args) {
        // Opret en Scanner til at indlæse brugerens input
        Scanner scanner = new Scanner(System.in);

        // Indlæs en streng fra brugeren
        System.out.print("Indtast en streng: ");
        String inputStreng = scanner.nextLine();

        // Find positionen af det første mellemrum
        int førsteMellemrumPosition = inputStreng.indexOf(" ");

        if (førsteMellemrumPosition != -1) {
            System.out.println("Positionen af det første mellemrum er: " + førsteMellemrumPosition);
        } else {
            System.out.println("Der er ingen mellemrum i strengen.");
        }

        // Luk scanneren
        scanner.close();
    }
}
/*
Dette program bruger indexOf(" ") til at finde positionen af det første mellemrum i den indtastede streng.
Hvis der ikke er nogen mellemrum, udskriver programmet en passende besked.
 */