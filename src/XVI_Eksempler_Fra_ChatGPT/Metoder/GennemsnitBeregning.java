package XVI_Eksempler_Fra_ChatGPT.Metoder;
/*
Skriv en metode gennemsnit() der modtager fire heltalsparametre. Metoden skal kaldes fra main().
Metoden beregner gennemsnittet og udskriver resultatet.
 */

public class GennemsnitBeregning {
    public static void main(String[] args) {
        // Kalder gennemsnit() med fire heltal
        int tal1 = 10;
        int tal2 = 20;
        int tal3 = 30;
        int tal4 = 40;

        gennemsnit(tal1, tal2, tal3, tal4);
    }
    // Metode til at beregne og udskrive gennemsnittet af fire heltal
    public static void gennemsnit(int tal1, int tal2, int tal3, int tal4) {
        // Beregn gennemsnittet
        double gns = (tal1 + tal2 + tal3 + tal4) / 4.0;

        // Udskriv resultatet
        System.out.println("Gennemsnittet af tallene er: " + gns);
    }
}
