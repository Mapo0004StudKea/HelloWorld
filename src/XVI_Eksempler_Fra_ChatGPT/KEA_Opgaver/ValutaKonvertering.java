package XVI_Eksempler_Fra_ChatGPT.KEA_Opgaver;

import java.util.Scanner;

/*
Lav et veksleprogram fra dollar til euro. Det skal påregne en kommission på 2 %, dog mindst 0,5 euro.
 */
public class ValutaKonvertering {
    public static void main(String[] args) {
        // Opret en Scanner til at læse brugerinput
        Scanner scanner = new Scanner(System.in);

        // Indtast beløbet i dollars
        System.out.print("Indtast beløbet i dollars: ");
        double dollarBeløb = scanner.nextDouble();

        // Luk scanneren, da vi ikke længere har brug for den
        scanner.close();

        // Konstant for kommissionen (2 %)
        final double KOMMISSION_PROCENT = 2.0;

        // Minimum kommission (0,5 euro)
        final double MINIMUM_KOMMISSION = 0.5;

        // Konverter dollars til euro
        double euroBeløb = dollarBeløb * 0.95; // 1 dollar = 0.95 euro (efter kommission)

        // Beregn kommissionen (2 % af dollarBeløb eller MINIMUM_KOMMISSION, alt efter hvad der er større)
        double kommission = Math.max(dollarBeløb * (KOMMISSION_PROCENT / 100), MINIMUM_KOMMISSION);

        // Tilføj kommissionen til euroBeløb
        euroBeløb += kommission;

        // Udskriv resultatet
        System.out.println("Beløbet i euro efter konvertering med kommission er: " + euroBeløb);
    }
}
/*
Dette program bruger Scanner til at indsamle brugerinput for beløbet i dollars.
Det konverterer derefter dollars til euro med en kommission på 2 % (eller mindst 0,5 euro).
Kommissionen beregnes ved at tage 2 % af dollarbeløbet eller minimumskommissionen på 0,5 euro,
afhængigt af hvad der er større. Til sidst tilføjes kommissionen til eurobeløbet, og resultatet udskrives.
 */