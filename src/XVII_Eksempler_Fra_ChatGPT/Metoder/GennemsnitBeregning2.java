package XVII_Eksempler_Fra_ChatGPT.Metoder;
/*
Skriv nu en metode gennemsnit2(), der også modtager fire heltalsparametre.
Metoden skal kaldes fra main().
I stedet for at udskrive resultatet skal resultatet returneres til main().
Herefter udskriver main() resultatet.
 */

public class GennemsnitBeregning2 {
    public static void main(String[] args) {

        // Kalder gennemsnit2() med fire heltal
        int tal1 = 10;
        int tal2 = 20;
        int tal3 = 30;
        int tal4 = 40;

        double resultat = gennemsnit2(tal1, tal2, tal3, tal4);

        // Udskriv resultatet
        System.out.println("Gennemsnittet af tallene er: " + resultat);
    }
        // Metode til at beregne gennemsnittet af fire heltal og returnere resultatet
        public static double gennemsnit2 ( int tal1, int tal2, int tal3, int tal4){
            // Beregn gennemsnittet
            double gns = (tal1 + tal2 + tal3 + tal4) / 4.0;

            // Returner resultatet
            return gns;
        }

}
