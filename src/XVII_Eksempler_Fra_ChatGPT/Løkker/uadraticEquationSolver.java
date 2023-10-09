package XVII_Eksempler_Fra_ChatGPT.Løkker;
/*
Skriv et program som finder eventuelle reelle rødder i 2. gradsligningen Ax²+Bx+C=0. Inputtet skal indlæses fra
konsollen som tre doubles (A B C) adskilt af mellemrum - eks: 1.2 3.4 5.6
Hvis der er to rødder skal de udskrives med et mellemrum i mellem eks: 1.5 6.7
Hvis der kun er én rod skal den kun udskrives én gang! eks: 1.9
Hvis der ingen rødder er skal teksten "Ingen rødder" udskrives. Ingen rødder
 */

import java.util.Scanner;

public class uadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Indlæs værdierne for A, B og C
        System.out.println("Indtast værdierne for A, B og C (adskilt af mellemrum):");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Beregn diskriminanten
        double discriminant = B * B - 4 * A * C;

        // Find rødderne
        if (discriminant > 0) {
            // To reelle rødder
            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);
            System.out.println(root1 + " " + root2);
        } else if (discriminant == 0) {
            // Én reel rod
            double root = -B / (2 * A);
            System.out.println(root);
        } else {
            // Ingen reelle rødder
            System.out.println("Ingen rødder");
        }

        scanner.close();
    }
}
/*
Dette program indlæser værdierne for A, B og C fra konsollen og beregner diskriminanten. Derefter bruges diskriminanten til at finde rødderne:

    Hvis diskriminanten er positiv, er der to reelle rødder, og de udskrives med et mellemrum imellem.
    Hvis diskriminanten er nul, er der én reel rod, og den udskrives en gang.
    Hvis diskriminanten er negativ, er der ingen reelle rødder, og teksten "Ingen rødder" udskrives.
 */