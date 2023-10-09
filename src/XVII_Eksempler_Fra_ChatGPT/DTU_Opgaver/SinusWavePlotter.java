package XVII_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Lav et program der kan plotte én sinus-periode med 16 "samples" og en amplitude på 20 tegn
                    *                    	//Sin 0
                    |      *             	//Sin 1/16
                    |             *
                    |                 *
                    |                   *
                    |                 *
                    |             *
                    |      *
                    *
             *      |
      *             |
  *                 |
*                   |
  *                 |
      *             |
             *      |

Brug kolonne 0-41 som sin(x) og linjenummer som x (i skridt af 1/16) .
Udvid programmet til at kunne tegne én sinus-periode bestående af et vilkårligt antal samples.
Udvid programmet til at kunne tegne et antal perioder som gives som en input med en int. (CodeJudge)
Udvid programmet til at spørge om antal samples i perioden og gentage kørsel, indtil der svares med 0 eller negative tal.
 */

import java.util.Scanner;

public class SinusWavePlotter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSamples;
        int numPeriods;

        do {
            System.out.print("Indtast antal samples i perioden (0 eller negativt tal for at afslutte): ");
            numSamples = scanner.nextInt();

            if (numSamples <= 0) {
                break;
            }

            System.out.print("Indtast antal perioder: ");
            numPeriods = scanner.nextInt();

            // Tegn sinusbølgen
            for (int i = 0; i < numSamples; i++) {
                double x = (double) i / numSamples * 2 * Math.PI;
                double sinValue = Math.sin(x);
                int amplitude = (int) (sinValue * 20);

                // Tegn bølgen for hver periode
                for (int j = 0; j < numPeriods; j++) {
                    for (int k = 0; k < 41; k++) {
                        if (k == 20 + amplitude) {
                            System.out.print("*");
                        } else if (k == 20) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        } while (numSamples > 0);

        scanner.close();
    }
}
/*
Her er et Java-program, der tegner en sinus-periode med det ønskede antal samples og perioder som specificeret:

Dette program giver dig mulighed for at indtaste antallet af samples i en periode og antallet af ønskede perioder.
Det tegner sinusbølgen i det ønskede format for det specificerede antal samples og perioder.
Du kan afslutte programmet ved at indtaste 0 eller et negativt tal som antallet af samples.
 */