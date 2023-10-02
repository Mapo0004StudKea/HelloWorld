package XVI_Eksempler_Fra_ChatGPT.Løkker;

import java.util.Scanner;
/*
Lav et program der:
1. Indlæser et password fra konsollen.
2. Checker, at længden af passwordet er større end 4 og mindre end 9.
3. Udskriver "Password for kort" hvis under 5, "Password for langt" hvis over 8 eller "Password tilpas".
 */

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Indlæs et password fra konsollen
        System.out.print("Indtast et password: ");
        String password = scanner.nextLine();

        // Check passwordlængden
        int passwordLength = password.length();

        if (passwordLength < 5) {
            System.out.println("Password for kort");
        } else if (passwordLength > 8) {
            System.out.println("Password for langt");
        } else {
            System.out.println("Password tilpas");
        }

        scanner.close();
    }
}
/*
 dette program:

    Vi bruger en Scanner til at indlæse passwordet som en streng.
    Vi beregner længden af passwordet ved hjælp af length()-metoden.
    Vi bruger en if-else-if-else-struktur til at kontrollere længden af passwordet og udskrive den relevante besked baseret på dine krav.

Kørsel af programmet vil udskrive enten "Password for kort", "Password for langt" eller "Password tilpas", afhængigt af længden af det indtastede password.
 */