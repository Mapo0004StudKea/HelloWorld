package XVI_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Skriv et program, der givet en integer som input, udskriver pyramider på følgende måde:
3					//Inputtet
Pyramid 1
#
Pyramid 2
.#.
###
Pyramid 3
..#..
.###.
#####
Første pyramide er 1 høj - nr 2 er 2 høj osv.
 */

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast et heltal: ");
        int X = scanner.nextInt();

        for (int i = 1; i <= X; i++) {
            System.out.println("Pyramid " + i);
            for (int j = 1; j <= i; j++) {
                // Udskriv punktum først (til venstre for midten)
                for (int k = 1; k <= i - j; k++) {
                    System.out.print(".");
                }

                // Udskriv # (midten)
                for (int k = 1; k <= 2 * j - 1; k++) {
                    System.out.print("#");
                }

                // Udskriv punktum efter # (til højre for midten)
                for (int k = 1; k <= i - j; k++) {
                    System.out.print(".");
                }

                System.out.println(); // Ny linje for at gå til næste række
            }
            System.out.println(); // Tom linje mellem pyramider
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en ydre for-løkke til at iterere fra 1 til X for at oprette pyramider.
    For hver pyramide bruger vi en anden for-løkke til at opbygge hver række.
    Vi bruger tre indre løkker til at udskrive punktummer før, efter og rundt om "#" i midten af hver række.
    Vi tilføjer en tom linje mellem pyramiderne for at adskille dem visuelt.

Når du indtaster et heltal som X, vil programmet udskrive pyramider, hvor hver pyramide er X høj og opfylder mønsteret som beskrevet.
 */