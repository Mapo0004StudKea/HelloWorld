package XVII_Eksempler_Fra_ChatGPT.Løkker;
/*
1. Lav en while, for og do løkke der printer alle tal fra 0 til 100 (inklusiv 0 og 100)
2. Lav en løkke der printer alle tal der er delige med 2 (Hint: Brug modulo operator)
3. Lav en løkke der ligger alle tal sammen fra 0 til 100 og printer den totale sum (Hint: prøv at bruge x++)
 */

public class Løkker {
    private static void main(String[] args) {

        /*
         * Løkke, der printer alle tal fra 0 til 100:
         */
/**
        // While-løkke
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
 */
/**
        // For-løkke
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
*/
/**
        // Do-while-løkke
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
*/
        /*
         * Løkke, der printer alle tal, der er delelige med 2 (lige tal):
         */
/**
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
*/
        /*
         * Løkke, der summerer alle tal fra 0 til 100 og udskriver den totale sum ved hjælp af x++:
         */
/**
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Den totale sum er: " + sum);
*/
        //Disse tre kodesekvenser viser forskellige typer løkker og hvordan de kan bruges til at opnå de ønskede opgaver.
    }
}
