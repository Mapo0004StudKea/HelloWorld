package III_Betingelser.II_III_III_Opgaver;

import java.util.Scanner;

public class veksleprogram {
    public static void main(String[] args) {
        double Mængde;
        double dollar, euro;
        int Valg;


        //DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Der er nu følgende muligheder; ");
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Euro");

        System.out.println("\nVælg fra de to muligheder");
        Valg = sc.nextInt();

        System.out.println("indtast det mængde du ønsker konverteret");
        Mængde = sc.nextFloat();

        switch (Valg) {
            case 1: // dollar konvertering.
                euro = Mængde * 0.87;
                System.out.println(Mængde + " Doller = " + euro + " Euro");
                break;

            case 2: // euro konvertering
                dollar = Mængde * 1.14;
                System.out.println(Mængde + " Euro = " + dollar + " Dollar");
                break;

            //default case
            default:
                System.out.println("ugyldigt input");
        }
    }
}
