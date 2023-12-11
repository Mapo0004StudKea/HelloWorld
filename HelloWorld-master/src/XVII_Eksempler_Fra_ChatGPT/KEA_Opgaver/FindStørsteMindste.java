package XVII_Eksempler_Fra_ChatGPT.KEA_Opgaver;

import java.util.Scanner;

/*
Skriv et program, som finder det største og det mindste af tre tal.
 */
public class FindStørsteMindste {
    public static void main(String[] args) {
        // Opret en Scanner til at læse brugerinput
        Scanner scanner = new Scanner(System.in);

        // Indtast de tre tal
        System.out.print("Indtast det første tal: ");
        double tal1 = scanner.nextDouble();

        System.out.print("Indtast det andet tal: ");
        double tal2 = scanner.nextDouble();

        System.out.print("Indtast det tredje tal: ");
        double tal3 = scanner.nextDouble();

        // Luk scanneren, da vi ikke længere har brug for den
        scanner.close();

        // Find det største og det mindste af de tre tal
        double største = findStørste(tal1, tal2, tal3);
        double mindste = findMindste(tal1, tal2, tal3);

        // Udskriv resultaterne
        System.out.println("Det største tal er: " + største);
        System.out.println("Det mindste tal er: " + mindste);
    }

    public static double findStørste(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    public static double findMindste(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
}
/*
Dette program bruger Scanner til at indsamle brugerinput for de tre tal.
Derefter kaldes findStørste- og findMindste-metoderne, som finder henholdsvis det største og
det mindste af de tre tal ved hjælp af Math.max og Math.min. Resultaterne udskrives derefter.
 */