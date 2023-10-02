package XVI_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Lav et program, hvor brugeren skal gætte dit navn:
Programmet skal blive ved med at bede om et navn, indtil dit navn er gættet.
Når der gættes forkert, skal programmet hjælpe ved at fortælle, om dit navn kommer alfabetisk før eller efter det forkerte navn.
 */

import java.util.Scanner;

public class GuessMyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myName = "GPT"; // Dit navn her (ændre dette)

        while (true) {
            System.out.print("Gæt mit navn: ");
            String guessedName = scanner.nextLine();

            if (guessedName.equalsIgnoreCase(myName)) {
                System.out.println("Tillykke! Du har gættet mit navn korrekt: " + myName);
                break; // Afslut løkken, når navnet er gættet korrekt
            } else {
                int comparison = guessedName.compareToIgnoreCase(myName);
                if (comparison < 0) {
                    System.out.println("Mit navn kommer efter " + guessedName + " alfabetisk.");
                } else {
                    System.out.println("Mit navn kommer før " + guessedName + " alfabetisk.");
                }
            }
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en while-løkke til at blive ved med at bede om gæt, indtil det korrekte navn er gættet.
    Hvis det gættede navn er korrekt, udskrives en tillykkebesked, og løkken afsluttes med break.
    Hvis det gættede navn er forkert, bruger vi compareToIgnoreCase()-metoden til at sammenligne det gættede navn med mit navn. Dette giver os information om, om mit navn kommer før eller efter det forkerte navn i alfabetisk rækkefølge.
    Vi udskriver en passende besked baseret på sammenligningen og fortsætter med at bede om flere gæt.
 */