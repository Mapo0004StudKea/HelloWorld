package XVII_Eksempler_Fra_ChatGPT.Metoder;
/*
Lav et program der kan udskriv bekræftelser på registreringer til Copenhagen Marathon.
Programmet skal indeholde en metode, der modtager oplysninger om en deltager, og udskriver registreringsoplysninger til deltageren.
Metoden kaldes fra hovedprogrammet main() for hver deltager. Den samlede udskrift skal se således ud:
Dear Peter Adams ! We are happy to receive your registration. Your start number is: 1556 You start in start group: D Please check in 10 minutes before start.
Dear Omar Farooq ! We are happy to receive your registration. Your start number is: 1699 You start in start group: D Please check in 10 minutes before start.
Dear Lotte Nybo ! We are happy to receive your registration. Your start number is: 843 You start in start group: B Please check in 10 minutes before start.
 */

public class CopenhagenMarathonRegistration {
    public static void main(String[] args) {
        // Registrer deltagerne ved at kalde metoden med deres oplysninger
        registerParticipant("Peter Adams", 1556, "D");
        registerParticipant("Omar Farooq", 1699, "D");
        registerParticipant("Lotte Nybo", 843, "B");
    }
    // Metode til at udskrive registreringsoplysninger
    public static void registerParticipant(String name, int startNumber, String startGroup) {
        System.out.println("Dear " + name + " ! We are happy to receive your registration.");
        System.out.println("Your start number is: " + startNumber);
        System.out.println("You start in start group: " + startGroup);
        System.out.println("Please check in 10 minutes before start.\n");
    }
}
