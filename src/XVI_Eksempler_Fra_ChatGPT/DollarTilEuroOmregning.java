package XVI_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, som omregner et beløb fra dollar til euro (f.eks. kurs 95).
 */
public class DollarTilEuroOmregning {
    public static void main(String[] args) {
        // Opret en Scanner til at læse brugerinput
        Scanner scanner = new Scanner(System.in);

        // Indtast beløbet i dollar
        System.out.print("Indtast beløbet i dollar: ");
        double dollarBeløb = scanner.nextDouble();

        // Indtast kursen
        System.out.print("Indtast kursen (f.eks. 0.95): ");
        double kurs = scanner.nextDouble();

        // Luk scanneren, da vi ikke længere har brug for den
        scanner.close();

        // Omregn beløbet til euro
        double euroBeløb = dollarBeløb * kurs;

        // Udskriv resultatet
        System.out.println("Beløbet i euro er: " + euroBeløb);
    }
}
/*
Dette program bruger Scanner til at indsamle brugerinput for beløbet i dollar og kursen.
Derefter omregner det beløbet til euro ved at multiplicere det med kursen og udskriver resultatet.
 */