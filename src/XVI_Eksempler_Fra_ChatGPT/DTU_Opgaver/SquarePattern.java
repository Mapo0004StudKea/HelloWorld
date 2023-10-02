package XVI_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*Skriv et program der tager en integer X som input og udskriver en kvadrat der er X*X stor.
F.eks. hvis “X=3” skal der printes:
###
###
###
 */

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast et heltal X: ");
        int X = scanner.nextInt();

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print("#");
            }
            System.out.println(); // Ny linje for at starte en ny række
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en for-løkke til at iterere X gange for at oprette rækkerne i kvadraten.
    Inden for den ydre løkke bruger vi en anden for-løkke til at udskrive "#" X gange for at oprette hver række.
    Vi bruger System.out.println(); for at starte en ny række efter hver række med "#" er udskrevet.

Når du indtaster et heltal som X, vil programmet udskrive en kvadrat, der er X * X stort, med "#" i hver celle.
 */