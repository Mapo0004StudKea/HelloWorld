package XVII_Eksempler_Fra_ChatGPT.KEA_Opgaver;

import java.util.Random;
import java.util.Scanner;

/*
kan du ændre programmet Copenhagen Marathon tidere men hvor man kan indtaste navn i stedet for det er faste navne?
 */
public class MarathonRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Indtast deltagerens navn: ");
        String deltagerNavn = scanner.nextLine();

        int startNummer = random.nextInt(1000) + 1;
        char startGruppe = (char) (random.nextInt(4) + 'A');

        System.out.println("Kære " + deltagerNavn + "! Vi har modtaget din registrering.");
        System.out.println("Dit startnummer er: " + startNummer);
        System.out.println("Du starter i startgruppe: " + startGruppe);
        System.out.println("Mød op 10 minutter før start.");

        scanner.close();
    }
}
/*
I dette program indlæser vi deltagerens navn ved hjælp af Scanner.
Derefter genereres et tilfældigt startnummer mellem 1 og 1000 samt en tilfældig startgruppe fra 'A' til 'D'.
Til sidst udskriver programmet en bekræftelse med deltagerens navn, startnummer og startgruppe.

Nu kan du køre programmet og indtaste deltagerens navn, og det vil generere en bekræftelse baseret på det indtastede navn.
 */