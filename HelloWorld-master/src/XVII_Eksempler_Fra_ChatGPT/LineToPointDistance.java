package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;
/*
Lav et program, som (1) læser ligningen for en ret linje (a og b) ind samt koordinaterne for et punkt og (2)
beregner og udskriver afstanden mellem linjen og punktet.
Linjen angives på den gængse formel: y = a ∙x + b, punktet som P: (x0 , y0)
hvorefter afstanden mellem linjen og punktet er givet ved følgende formel:
 */

public class LineToPointDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Indlæs ligningskoefficienterne for den rette linje (a og b)
        System.out.print("Indtast koefficienten 'a' for den rette linje: ");
        double a = scanner.nextDouble();

        System.out.print("Indtast koefficienten 'b' for den rette linje: ");
        double b = scanner.nextDouble();

        // Indlæs koordinaterne for punktet (x0, y0)
        System.out.print("Indtast x-koordinaten for punktet: ");
        double x0 = scanner.nextDouble();

        System.out.print("Indtast y-koordinaten for punktet: ");
        double y0 = scanner.nextDouble();

        // Beregn afstanden mellem linjen og punktet
        double distance = Math.abs(a * x0 - y0 + b) / Math.sqrt(a * a + 1);

        // Udskriv resultatet
        System.out.println("Afstanden mellem linjen og punktet er: " + distance);

        scanner.close();
    }
}
