package XV_Eksempler_Fra_Bøger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LaesTekstfil2 {
    public static void main(String[] args) throws IOException {
        BufferedReader ind = new BufferedReader(new FileReader("skrevet fil.txt"));
        String linje = ind.readLine();
        int alderssum = 0;
        while (linje != null)
        {
            String[] bidder = linje.split(" "); // opdel i bidder efter mellemrum
            alderssum = alderssum + Integer.parseInt( bidder[2] ); // brug tredje bid
            linje = ind.readLine();
        }
        System.out.println("Summen af aldrene er: "+alderssum);
    }
}
