package XVII_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Skriv et program der tager en integer X som input og udskriver en halv pyramide/trekant, f.eks. hvis “X=3” skal der printes
#
##
###
Og hvis “X=4” skal der printes
#
##
###
####
 */

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast et heltal X: ");
        int X = scanner.nextInt();

        for (int i = 1; i <= X; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println(); // Ny linje for at gå til næste række
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en for-løkke til at iterere fra 1 til X for at oprette rækkerne i pyramiden.
    Inden for den ydre løkke bruger vi en anden for-løkke til at udskrive "#" i stigende antal fra 1 til i for hver række.
    Vi bruger System.out.println(); for at gå til næste linje og starte en ny række efter hver række er udskrevet.

Når du indtaster et heltal som X, vil programmet udskrive en halv pyramide eller trekant, hvor hver række har flere "#" end den foregående, indtil den når X.
 */