package XVIII_Andre_Eksempler_Og_Tests;

import java.util.Random;
import java.util.Scanner;

/**
 * Make a program that generates a random number in the interval [1,100].
 * The user tries to guess and the program must then tell whether the guess is greater than, less than, or equal to the secret number.
 * This is repeated until the number is guessed. Finally, the program must tell how many guesses the user has used.
 */

public class TestAFGuessANumberMedMetoder {
    //public static int hentbrugerensGæt(Scanner scanner) {

    //}

    public static void main(String[] args) {
        Random rng = new Random();
        int hemmeligtNummer = rng.nextInt(100)+1;
        int gæt;
        int forsøg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tallet er: " + hemmeligtNummer);
        while (true) {
            forsøg++;
            System.out.println("Indtast hvad du tror tallet er: ");
            gæt = scanner.nextInt();
            if (hemmeligtNummer == gæt) {
                System.out.println("Du har gættet rigtigt, Hurra!");
                System.out.println("Det har taget dig " + forsøg + " forsøg.");
                break;
            } else if (hemmeligtNummer < gæt) {
                System.out.println(" Tallet jeg tænker på er lavere, prøv igen");
            } else {
                System.out.println("Tallet jeg tænker på er højere, prøv igen");
            }
        }
    }

}
