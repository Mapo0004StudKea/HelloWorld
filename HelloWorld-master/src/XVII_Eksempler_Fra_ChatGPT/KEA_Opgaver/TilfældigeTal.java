package XVII_Eksempler_Fra_ChatGPT.KEA_Opgaver;
/*
Skriv et program, som udskriver tre tilfældige tal (lavet med Math.random()), deres sum og
gennemsnittet.
 */
public class TilfældigeTal {
    public static void main(String[] args) {
        // Generer tre tilfældige tal mellem 0 og 1
        double tal1 = Math.random();
        double tal2 = Math.random();
        double tal3 = Math.random();

        // Beregn summen af de tre tilfældige tal
        double sum = tal1 + tal2 + tal3;

        // Beregn gennemsnittet af de tre tilfældige tal
        double gennemsnit = sum / 3;

        // Udskriv de tilfældige tal, summen og gennemsnittet
        System.out.println("Tilfældige tal:");
        System.out.println("Tal 1: " + tal1);
        System.out.println("Tal 2: " + tal2);
        System.out.println("Tal 3: " + tal3);
        System.out.println("Summen: " + sum);
        System.out.println("Gennemsnittet: " + gennemsnit);
    }
}
/*
Dette program genererer tre tilfældige tal mellem 0 og 1 ved hjælp af Math.random().
Derefter beregner det summen af disse tal og gennemsnittet ved at dividere summen med antallet af tal (3)
og udskriver resultatet.
 */