package XVI_Eksempler_Fra_Bøger;

/**
 * 2.5.3 Indlejrede løkker
 *
 * En betingelse eller en løkke kan stå ethvert sted i en metode og altså også inden i en anden løkke eller betingelse.
 *
 * Herunder har vi syvtabellen igen, men denne gang "brokker" programmet sig, når det når op på 6.
 * Efter 8 skriver det "ved ikke", i stedet for at regne resultatet ud.
 */
public class Syvtabel3 {
    public static void main(String[] arg)
    {
        for (int n=1; n<=10; n++)  // n++ gør det samme som n=n+1
        {
            if (n == 6) System.out.println("puha, nu bliver det svært.");

            if (n < 8) System.out.println(n+" : "+ 7*n);
            else System.out.println(n+" : (ved ikke)");
        }
    }
}
