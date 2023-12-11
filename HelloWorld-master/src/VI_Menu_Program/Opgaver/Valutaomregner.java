package VI_Menu_Program.Opgaver;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Valutaomregner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        double SEK, NOK, EUR, ISK;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        while (true) {
            System.out.println("Velkommen til Valuta omregner.");
            System.out.println("Her kan du veksle fra danske kroner til svenske, norske, finske eller islandske kroner.");

            System.out.println("\nIndtast beløb i danske kroner (Tast 0 for at afslutte programmet): ");
            System.out.println("Tast 1 for svenske kroner");
            System.out.println("Tast 2 for norske kroner");
            System.out.println("Tast 3 for finske mark");
            System.out.println("Tast 4 for islandske kroner");
            System.out.println("Tast  0 for for at afslutte");
            System.out.print("\nVælg en af mulighederne: ");
            choice = scanner.nextInt();
            if (choice == 0) break;
            System.out.println("\nIndtast beløb i danske kroner (Tast 0 for at afslutte programmet): ");
            amount = scanner.nextFloat();

            switch (choice) {
                case 1: //svenske kroner
                    SEK = amount*1.6;
                    System.out.println("Du har valgt at konvertere fra danske kroner til svenske kroner");
                    System.out.println(amount + " Danske kroner = " + f.format(SEK) + " Svenske kroner");;
                    break;
                case 2: //norske kroner
                    NOK = amount*1.53;
                    System.out.println("Du har valgt at konvertere fra danske kroner til norske kroner");
                    System.out.println(amount + " Danske kroner = " + f.format(NOK) + " Norske kroner");;
                    break;
                case 3: //i Finland anvendes euro
                    EUR = amount*0.13;
                    System.out.println("Du har valgt at konvertere fra danske kroner til euro");
                    System.out.println(amount + " Danske kroner = " + f.format(EUR) + " Euro");;
                    break;
                case 4: // islanske kroner
                    ISK = amount*19.27;
                    System.out.println("Du har valgt at konvertere fra danske kroner til islandske kroner");
                    System.out.println(amount + " Danske kroner = " + f.format(ISK) + " islandske kroner");;
                    break;
                default:
                    System.out.println("Ugyldig valg");
                    System.out.println();
                    continue;
            }
            //System.out.println("Til udbetaling: "+amount);
            System.out.println();
        }
        System.out.println("\nProgrammet lukkes");
    }
}
