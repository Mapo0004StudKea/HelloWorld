package XVII_Eksempler_Fra_ChatGPT.KEA_Opgaver;
/*
Lav et program, der udskriver 2-tabellen, 3-tabellen, .. op til 10-tabellen.
 */
public class Multiplikationstabeller {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.println("Multiplikationstabel for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultat = i * j;
                System.out.println(i + " * " + j + " = " + resultat);
            }
            System.out.println(); // Tom linje mellem tabellerne
        }
    }
}
/*
Dette program bruger to for-løkker. Den ydre løkke itererer fra 2 til 10 for at generere
multiplikationstabellerne for tallene fra 2 til 10.
Den indre løkke itererer fra 1 til 10 og udskriver resultatet af multiplikationen mellem det
aktuelle tal og tallet fra den ydre løkke. Der er en tom linje mellem hver tabel for bedre læselighed.
 */