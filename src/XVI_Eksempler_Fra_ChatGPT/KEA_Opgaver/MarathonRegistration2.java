package XVI_Eksempler_Fra_ChatGPT.KEA_Opgaver;

import java.util.Random;
import java.util.Scanner;

/*
Lav et program der kan udskriv bekræftelser på registreringer til Copenhagen Marathon.
Programmet skal indeholde en metode, der modtager oplysninger om en deltager, og udskriver registreringsoplysninger til deltageren.
Metoden kaldes fra hovedprogrammet main() for hver deltager. Den samlede udskrift skal se således ud:

Dear Peter Adams ! We are happy to receive your registration. Your start number is: 1556 You start in start group: D Please check in 10 minutes before start.
Dear Omar Farooq ! We are happy to receive your registration. Your start number is: 1699 You start in start group: D Please check in 10 minutes before start.
Dear Lotte Nybo ! We are happy to receive your registration. Your start number is: 843 You start in start group: B Please check in 10 minutes before start.
Dog skal det siges at navnene skal kunne ændres (man skal selv kunne indtaste navne).
 */
public class MarathonRegistration2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Indtast antal deltagere: ");
        int numberOfParticipants = scanner.nextInt();
        scanner.nextLine(); // Fjern newline

        for (int i = 0; i < numberOfParticipants; i++) {
            System.out.print("Indtast deltagerens navn: ");
            String ParticipantsName = scanner.nextLine();

            int startNumber = random.nextInt(1000) + 1;
            char startGruppe = (char) (random.nextInt(4) + 'A');

            udskrivBekraeftelse(ParticipantsName, startNumber, startGruppe);
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
/*
Dette program giver dig mulighed for at indtaste antallet af deltagere og derefter indtaste navnene på deltagerne.
For hver deltager genereres et tilfældigt startnummer og en tilfældig startgruppe,
og bekræftelsesbeskeden udskrives med deltagerens navn, startnummer og startgruppe.

Nu kan du indtaste navnene på deltagerne, og programmet vil generere bekræftelser baseret på de indtastede oplysninger.
 */