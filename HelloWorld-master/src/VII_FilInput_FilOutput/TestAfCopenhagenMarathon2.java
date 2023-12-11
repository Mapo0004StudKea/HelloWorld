package VII_FilInput_FilOutput;

import java.io.*;


public class TestAfCopenhagenMarathon2 {
    public static void main(String[] args) throws IOException {

        FileReader fil = new FileReader("Copenhagen Marathon.txt");
        BufferedReader ind = new BufferedReader(fil);

        String linje = ind.readLine();
        while (linje != null)
        {
            System.out.println(linje);
            linje = ind.readLine();
        }
    }
    public static void bekræftelse(String deltarensNavn, int startnummer, char startgruppe) {
        System.out.println("Dear "+deltarensNavn+"!");
        System.out.println("We are happy to receive your registration.");
        System.out.println("Your start number is: "+startnummer);
        System.out.println("You start in group: "+startgruppe);
        System.out.println("Please check in 10 minutes before start.");

    }
}
