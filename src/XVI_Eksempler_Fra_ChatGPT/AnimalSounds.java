package XVI_Eksempler_Fra_ChatGPT;

import java.util.Scanner;
/*
Benyt en while-løkke til at indlæse dyrenavne fra terminalen.
Når et navn er læst ind benyttes en switch til at printes den korrekte lyd som dyret siger.
De forventede lyde er:
  Dog -> Woof
  Cat -> Meow
  Fish -> Blob
  Cow -> Muh
  Lion -> Roar
  Sheep -> Bah
  Duck -> Quack
Hvis dyret ikke findes printes et spørgsmålstegn.
 */
public class AnimalSounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Indtast et dyrenavn (eller 'exit' for at afslutte): ");
            String dyreNavn = scanner.nextLine().toLowerCase(); // Konverter til små bogstaver

            if (dyreNavn.equals("exit")) {
                break; // Afslut programmet, hvis 'exit' indtastes
            }

            String lyd;

            switch (dyreNavn) {
                case "dog":
                    lyd = "Woof";
                    break;
                case "cat":
                    lyd = "Meow";
                    break;
                case "fish":
                    lyd = "Blob";
                    break;
                case "cow":
                    lyd = "Muh";
                    break;
                case "lion":
                    lyd = "Roar";
                    break;
                case "sheep":
                    lyd = "Bah";
                    break;
                case "duck":
                    lyd = "Quack";
                    break;
                default:
                    lyd = "?"; // Hvis dyret ikke findes
                    break;
            }

            System.out.println("Dyret siger: " + lyd);
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en while-løkke til at indlæse dyrenavne fra terminalen.
    Vi konverterer det indtastede dyrenavn til små bogstaver ved hjælp af toLowerCase()
    for at gøre sammenligningen i switch-satsen case-insensitiv.
    Vi bruger en switch-sats til at finde den korrekte lyd baseret på dyrenavnet.
    Hvis dyret ikke findes i listen, udskrives et spørgsmålstegn.
    Brugeren kan afslutte programmet ved at indtaste 'exit'.
 */