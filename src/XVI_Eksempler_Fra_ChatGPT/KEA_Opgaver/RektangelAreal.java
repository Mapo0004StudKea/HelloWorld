package XVI_Eksempler_Fra_ChatGPT.KEA_Opgaver;
/*
Skriv et program, som ud fra længde og bredde på et rektangel udskriver dets areal.
 */

import java.util.Scanner;

public class RektangelAreal {
    public static void main(String[] args) {
        // Opret en Scanner til at læse brugerinput
        Scanner scanner = new Scanner(System.in);

        // Indtast længden og bredden af rektanglet
        System.out.print("Indtast længden af rektanglet: ");
        double længde = scanner.nextDouble();

        System.out.print("Indtast bredden af rektanglet: ");
        double bredde = scanner.nextDouble();

        // Luk scanneren, da vi ikke længere har brug for den
        scanner.close();

        // Beregn arealet af rektanglet
        double areal = længde * bredde;

        // Udskriv resultatet
        System.out.println("Arealet af rektanglet er: " + areal);
    }
}
/*
Dette program bruger Scanner til at indsamle brugerinput for længden og bredden af rektanglet.
Derefter beregner det arealet ved at multiplicere længden med bredden og udskriver resultatet.
 */