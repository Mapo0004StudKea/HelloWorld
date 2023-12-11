package VI_Menu_Program.Opgaver;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestAfValutaomregner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        int fromCurrency, toCurrency;

        DecimalFormat f = new DecimalFormat("##.##");

        while (true) {
            System.out.println("Velkommen til Valuta omregner.");
            System.out.println("Her kan du veksle mellem nordiske valutaer.");
            System.out.println("Vælg den valuta, du ønsker at veksle fra:");

            System.out.println("Tast 1 for danske kroner");
            System.out.println("Tast 2 for svenske kroner");
            System.out.println("Tast 3 for norske kroner");
            System.out.println("Tast 4 for finske mark");
            System.out.println("Tast 5 for islandske kroner");
            System.out.println("Tast 0 for at afslutte");
            System.out.print("\nVælg en valuta (fra): ");
            fromCurrency = scanner.nextInt();

            if (fromCurrency == 0) break;

            System.out.println("\nVælg den valuta, du ønsker at veksle til:");
            System.out.println("Tast 1 for danske kroner");
            System.out.println("Tast 2 for svenske kroner");
            System.out.println("Tast 3 for norske kroner");
            System.out.println("Tast 4 for finske mark");
            System.out.println("Tast 5 for islandske kroner");
            System.out.println("Tast 0 for at afslutte");
            System.out.print("\nVælg en valuta (til): ");
            toCurrency = scanner.nextInt();

            if (toCurrency == 0) break;

            System.out.print("\nIndtast beløb i den valgte valuta (fra): ");
            amount = scanner.nextDouble();

            double result = 0;


            if (fromCurrency == 1) {
                if (toCurrency == 2)
                    result = amount * 1.6;
                else if (toCurrency == 3)
                    result = amount * 1.53;
                else if (toCurrency == 4)
                    result = amount * 7.46;
                else if (toCurrency == 5)
                    result = amount * 19.27;
                else
                    System.out.println("Ugyldig valuta valgt.");
            } else if (fromCurrency == 2) {
                if (toCurrency == 1)
                    result = amount * 0.63;
                else if (toCurrency == 3)
                    result = amount * 0.96;
                else if (toCurrency == 4)
                    result = amount * 11.89;
                else if (toCurrency == 5)
                    result = amount * 0.083;
                else
                    System.out.println("Ugyldig valuta valgt.");
            } else if (fromCurrency == 3) {
                if (toCurrency == 1)
                    result = amount * 0.65;
                else if (toCurrency == 2)
                    result = amount * 1.04;
                else if (toCurrency == 4)
                    result = amount * 11.44;
                else if (toCurrency == 5)
                    result = amount * 12.56;
                else
                    System.out.println("Ugyldig valuta valgt.");
            } else if (fromCurrency == 4) {
                if (toCurrency == 1)
                    result = amount * 7.46;
                else if (toCurrency == 2)
                    result = amount * 11.88;
                else if (toCurrency == 3)
                    result = amount * 11.44;
                else if (toCurrency == 5)
                    result = amount * 143.71;
                else
                    System.out.println("Ugyldig valuta valgt.");
            } else if (fromCurrency == 5) {
                if (toCurrency == 1)
                    result = amount * 0.052;
                else if (toCurrency == 2)
                    result = amount * 0.083;
                else if (toCurrency == 3)
                    result = amount * 0.080;
                else if (toCurrency == 4)
                    result = amount * 0.007;
                else
                    System.out.println("Ugyldig valuta valgt.");
            } else {
                System.out.println("Ugyldig valuta valgt.");
            }

            if (result != 0) {
                System.out.println("Du har valgt at konvertere fra valuta " + fromCurrency + " til valuta " + toCurrency);
                System.out.println(amount + " Valuta " + fromCurrency + " = " + f.format(result) + " Valuta " + toCurrency);
            }

            System.out.println();
        }
        System.out.println("Programmet lukkes");
    }
}
