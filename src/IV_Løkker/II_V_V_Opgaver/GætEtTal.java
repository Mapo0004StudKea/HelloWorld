package IV_Løkker.II_V_V_Opgaver;

import java.util.Random;
import java.util.Scanner;

public class GætEtTal {
    public static void main(String[] args) {
        Random rng = new Random();
        int tal = rng.nextInt(20) + 1;
        int gaet;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Tallet er: " + tal);
        while (true) {
            System.out.println("Indtast hvad du tror tallet er: \n");
            gaet = scanner.nextInt();
            if (tal == gaet) {
                System.out.println("Du har gættet rigtigt, Hurra!");
                break;
            } else if (tal < gaet) {
                System.out.println(" Tallet jeg tænker på er lavere, prøv igen");
            } else {
                System.out.println("Tallet jeg tænker på er højere, prøv igen");
            }
        }
    }
}
