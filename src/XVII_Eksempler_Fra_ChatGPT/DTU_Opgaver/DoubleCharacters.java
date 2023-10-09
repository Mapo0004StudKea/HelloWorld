package XVII_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Skriv et program der indlæser en String og en int fra konsollen, eks:
"Hej dtu 3"
og skriver en tilsvarende streng, hvor alle karakterer er fordoblet det antal gange som int'en angiver - eks:

"HHHeeejjj   dddtttuuu"
 */

import java.util.Scanner;

public class DoubleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast en streng: ");
        String inputString = scanner.nextLine();

        System.out.print("Indtast et heltal (antal gange karaktererne skal fordobles): ");
        int duplicationFactor = scanner.nextInt();

        String doubledString = doubleCharacters(inputString, duplicationFactor);

        System.out.println("Fordoblet streng: " + doubledString);

        scanner.close();

    }
    public static String doubleCharacters(String input, int factor) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            for (int i = 0; i < factor; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
/*
I dette program bruger vi en separat metode doubleCharacters, der tager den indtastede streng og faktor som input.
Metoden bruger en StringBuilder til at opbygge den fordoblede streng ved at gentage hver karakter i inputstrengen
det angivne antal gange.

Når du kører programmet og indtaster en streng som "Hej dtu 3" og et heltal som 3,
vil programmet udskrive den fordoblede streng som "HHHeejjj dddtttuuu", hvor karaktererne er fordoblet 3 gange.
Du kan ændre strengen og faktoren efter behov.
 */