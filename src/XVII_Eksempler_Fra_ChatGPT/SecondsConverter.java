package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;
/*
Lav et program, der (1) læser et antal sekunder ind og
(2) skriver hvor mange dage, timer, minutter og sekunder det angivne antal sekunder svarer til, for eksempel:
Enter an amount of seconds: 238577
238577 seconds equals 2 days, 18 hours, 16 minutes and 17 seconds.
 */

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Indlæs antal sekunder
        System.out.print("Indtast et antal sekunder: ");
        long totalSeconds = scanner.nextLong();

        // Beregn dage, timer, minutter og resterende sekunder
        long days = totalSeconds / 86400; // Antal sekunder pr. dag
        long remainingSeconds = totalSeconds % 86400;
        long hours = remainingSeconds / 3600; // Antal sekunder pr. time
        remainingSeconds %= 3600;
        long minutes = remainingSeconds / 60; // Antal sekunder pr. minut
        remainingSeconds %= 60;

        // Udskriv resultatet
        System.out.println(totalSeconds + " sekunder svarer til " + days + " dage, " + hours + " timer, " + minutes + " minutter og " + remainingSeconds + " sekunder.");

        scanner.close();
    }
}
