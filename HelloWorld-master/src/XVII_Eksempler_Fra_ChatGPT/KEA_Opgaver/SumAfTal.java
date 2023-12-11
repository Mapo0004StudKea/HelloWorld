package XVII_Eksempler_Fra_ChatGPT.KEA_Opgaver;
/*
Lav et program, der udregner værdien af 1+2+3+ ... +20 med en løkke.
 */
public class SumAfTal {
    public static void main(String[] args) {
        int n = 20; // Antallet af tal at summere

        int sum = 0; // Initialiser summen til 0

        for (int i = 1; i <= n; i++) {
            sum += i; // Læg det aktuelle tal til summen
        }

        System.out.println("Summen af talene fra 1 til " + n + " er: " + sum);
    }
}
/*
Dette program bruger en for-løkke til at iterere fra 1 til 20 og lægger hvert tal til sum-variablen.
Til sidst udskrives resultatet, som er summen af tallene fra 1 til 20.
 */