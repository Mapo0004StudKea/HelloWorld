package XVI_Eksempler_Fra_ChatGPT.KEA_Opgaver;

import java.util.Scanner;

/*
Skriv et program, der beregner porto for et brev. Inddata er brevets vægt (i gram). Uddata er prisen, for
at sende det som A-post i Danmark.
 */
public class PortoBeregning {
    public static void main(String[] args) {
        // Opret en Scanner til at læse brevets vægt fra brugeren
        Scanner scanner = new Scanner(System.in);

        // Indtast brevets vægt i gram
        System.out.print("Indtast brevets vægt i gram: ");
        int vægtIGram = scanner.nextInt();

        // Luk scanneren, da vi ikke længere har brug for den
        scanner.close();

        // Beregn portoen baseret på vægten
        double porto = beregnPorto(vægtIGram);

        // Udskriv portoen
        System.out.println("Portoen for at sende brevet som A-post er: " + porto + " kr.");
    }

    public static double beregnPorto(int vægtIGram) {
        double porto;

        if (vægtIGram <= 50) {
            porto = 10.0; // Pris for brev op til 50 gram
        } else if (vægtIGram <= 100) {
            porto = 20.0; // Pris for brev op til 100 gram
        } else if (vægtIGram <= 250) {
            porto = 30.0; // Pris for brev op til 250 gram
        } else if (vægtIGram <= 500) {
            porto = 40.0; // Pris for brev op til 500 gram
        } else {
            porto = 0.0; // Brevet er for tungt til A-post
        }

        return porto;
    }
}
/*
Dette program bruger Scanner til at indsamle brugerinput for brevets vægt i gram.
Derefter kaldes beregnPorto-metoden, som beregner portoen baseret på vægten og returnerer den.
Resultatet udskrives som portoen for at sende brevet som A-post i Danmark.
 */