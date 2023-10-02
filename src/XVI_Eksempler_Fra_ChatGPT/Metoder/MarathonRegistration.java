package XVI_Eksempler_Fra_ChatGPT.Metoder;

import java.util.Random;
import java.util.Scanner;

public class MarathonRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Indtast antal deltagere: ");
        int antalDeltagere = scanner.nextInt();
        scanner.nextLine(); // Fjern newline

        for (int i = 0; i < antalDeltagere; i++) {
            System.out.print("Indtast deltagerens navn: ");
            String deltagerNavn = scanner.nextLine();

            int startNummer = random.nextInt(1000) + 1;
            char startGruppe = (char) (random.nextInt(4) + 'A');

            udskrivBekraeftelse(deltagerNavn, startNummer, startGruppe);
        }
        scanner.close();
    }
    public static void udskrivBekraeftelse(String deltagerNavn, int startNummer, char startGruppe) {
        System.out.println("Dear " + deltagerNavn + " ! We are happy to receive your registration.");
        System.out.println("Your start number is: " + startNummer);
        System.out.println("You start in start group: " + startGruppe);
        System.out.println("Please check in 10 minutes before start.\n");
    }
}
