package XVIII_Andre_Eksempler_Og_Tests;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amount;
        double dollar, euro;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Der er nu følgende muligheder; ");
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Euro");

        System.out.println("\nVælg fra de to muligheder");
        choice = sc.nextInt();

        System.out.println("indtast det mængde du ønsker konverteret");
        amount = sc.nextFloat();

        switch (choice) {
            case 1: // dollar konvertering.
                euro = amount * 0.87;
                System.out.println(amount + " Doller = " + f.format(euro) + " Euro");
                break;

            case 2: // euro konvertering
                dollar = amount * 1.14;
                System.out.println(amount + " Euro = " + f.format(dollar) + " Dollar");
                break;

            //default case
            default:
                System.out.println("ugyldigt input");
        }

    }
}
