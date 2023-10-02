package III_Betingelser.II_III_III_Opgaver;

import java.util.Scanner;
public class veksleprogram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast det beløb i dollars du ønsker at få vækslet: ");
        double dollars = scanner.nextDouble();

        double valutakurs = 0.95;
        double kommission = 0.02;
        double minkommission = 0.5;

        double euros = dollars * valutakurs;
        double commission = euros * kommission;

        if (commission < minkommission) {
            commission = minkommission;
        }

        double totalEuros = euros - commission;

        System.out.println(dollars + " dollar bliver til " + totalEuros + " euro efter kommission.");
    }
}
