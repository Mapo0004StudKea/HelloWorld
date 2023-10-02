package XV_Eksempler_Fra_Bøger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LaesTekstfil {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("skrevet fil.txt");
        BufferedReader ind = new BufferedReader(fil);
        String linje = ind.readLine();
        while (linje != null)
        {
            System.out.println("Læst: "+linje);
            linje = ind.readLine();
        }
    }
}
