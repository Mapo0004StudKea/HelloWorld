package XVI_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

public class PostageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast brevets vægt (gram): ");
        double weight = scanner.nextDouble();

        double basePrice = 11.0; // Grundpris for A-post
        double pricePer10Grams = 4.0; // Pris pr. påbegyndt 10 gram udover grundvægten

        // Beregning af porto
        double postage = basePrice + Math.ceil((weight - 50) / 10) * pricePer10Grams;

        System.out.println("Portoen for at sende brevet som A-post er: " + postage + " kr.");
    }
}
