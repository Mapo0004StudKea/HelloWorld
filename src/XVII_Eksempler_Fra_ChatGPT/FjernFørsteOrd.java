package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, der fjerner det første ord i en sætning (indtil første mellemrum).
 */
public class FjernFørsteOrd {
    public static void main(String[] args) {
        // Opret en Scanner til at indlæse brugerens input
        Scanner scanner = new Scanner(System.in);

        // Indlæs en sætning fra brugeren
        System.out.print("Indtast en sætning: ");
        String inputSætning = scanner.nextLine();

        // Find positionen af det første mellemrum
        int førsteMellemrumPosition = inputSætning.indexOf(" ");

        if (førsteMellemrumPosition != -1) {
            // Fjern det første ord ved at udtrække den resterende del af sætningen
            String resterendeSætning = inputSætning.substring(førsteMellemrumPosition + 1);

            System.out.println("Sætning uden det første ord: " + resterendeSætning);
        } else {
            System.out.println("Sætningen indeholder kun ét ord eller er tom.");
        }

        // Luk scanneren
        scanner.close();
    }
}
/*
Dette program bruger indexOf(" ") til at finde positionen af det første mellemrum i den indtastede sætning og
 derefter substring-metoden til at udtrække den resterende del af sætningen uden det første ord.
 Hvis sætningen kun indeholder ét ord eller er tom, udskriver programmet en passende besked.
 */