package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

public class DollarToEuroConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast beløb i dollars: ");
        double dollars = scanner.nextDouble();

        double exchangeRate = 0.85; // Aktuel vekselkurs: 1 dollar = 0,85 euro
        double commissionPercentage = 0.02; // 2% kommission
        double minimumCommission = 0.5; // Minimum 0,5 euro i kommission

        double euros = dollars * exchangeRate;
        double commission = euros * commissionPercentage;

        if (commission < minimumCommission) {
            commission = minimumCommission;
        }

        double totalEuros = euros - commission;

        System.out.println(dollars + " dollar svarer til " + totalEuros + " euro efter kommission.");
    }
}
