package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

/*
Skriv et program, der indlæser en dato (tre heltal) og udskriver den næste dags dato.
Eksempel på kørsel:
Indtast år: 2001
Indtast måned: 9
Indtast dag: 30
Dagen efter 30/9 2001 er 1/10 2001
Hvis datoen er ugyldig udskrives
Ugyldig dato
 */
public class NextDayDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast år: ");
        int år = scanner.nextInt();

        System.out.print("Indtast måned: ");
        int måned = scanner.nextInt();

        System.out.print("Indtast dag: ");
        int dag = scanner.nextInt();

        boolean erSkudår = (år % 4 == 0 && år % 100 != 0) || (år % 400 == 0);
        int maxDageIMåneden;

        switch (måned) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxDageIMåneden = 31;
                break;
            case 4, 6, 9, 11:
                maxDageIMåneden = 30;
                break;
            case 2:
                maxDageIMåneden = erSkudår ? 29 : 28;
                break;
            default:
                maxDageIMåneden = 0;
        }

        if (måned >= 1 && måned <= 12 && dag >= 1 && dag <= maxDageIMåneden) {
            // Beregn næste dags dato
            if (dag < maxDageIMåneden) {
                dag++;
            } else {
                dag = 1;
                if (måned < 12) {
                    måned++;
                } else {
                    måned = 1;
                    år++;
                }
            }

            System.out.println("Dagen efter " + dag + "/" + måned + " " + år + " er " + dag + "/" + måned + " " + år);
        } else {
            System.out.println("Ugyldig dato");
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en Scanner til at indlæse år, måned og dag fra brugeren.
    Vi bruger en switch-sats til at bestemme det maksimale antal dage i den indtastede måned.
    Vi kontrollerer også, om året er et skudår for februar.
    Hvis datoen er gyldig, beregner vi næste dags dato, inklusive årsskifte, hvis nødvendigt.
    Hvis datoen er ugyldig, udskrives "Ugyldig dato".
 */