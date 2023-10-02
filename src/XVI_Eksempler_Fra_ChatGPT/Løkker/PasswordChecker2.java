package XVI_Eksempler_Fra_ChatGPT.Løkker;
/*
ændre password koden fra tidligere så programmet bliver ved med at bede om et password,
indtil brugeren har indtastet et korrekt et.
 */

import java.util.Scanner;

public class PasswordChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Det korrekte password
        String korrektPassword = "hemmelig";

        while (true) {
            // Indtast et password
            System.out.print("Indtast password: ");
            String indtastetPassword = scanner.nextLine();

            // Check om indtastet password er korrekt
            if (indtastetPassword.equals(korrektPassword)) {
                System.out.println("Adgang godkendt. Velkommen!");
                break; // Stop løkken, da det korrekte password er indtastet
            } else {
                System.out.println("Adgang nægtet. Prøv igen.");
            }
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en while-løkke til at fortsætte med at bede om et password, indtil det korrekte password er indtastet.
    Vi sammenligner det indtastede password med det korrekte password ved hjælp af equals-metoden.
    Hvis det indtastede password er korrekt, udskriver vi "Adgang godkendt. Velkommen!" og bryder ud af løkken med break.
    Hvis det indtastede password ikke er korrekt, udskriver vi "Adgang nægtet. Prøv igen." og fortsætter med at bede om et nyt password.
 */