package VI_Menu_Program.Opgaver;
//Skriv et program, der fjerner den første forekomst af ordet "måske" fra en tekst.
//Ændr derefter programmet, så det fjerner alle forekomster af ordet (brug en løkke).

import java.util.Scanner;

public class FjernMåske {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast en tekst: ");
        String inputTekst = scanner.nextLine();


        String tekstUdenMåske = inputTekst.replaceFirst("måske", "");

        System.out.println("Tekst uden den første forekomst af 'måske':");
        System.out.println(tekstUdenMåske);
/*
        String[] ord = inputTekst.split(" ");
        StringBuilder tekstUdenAlleOrd = new StringBuilder();
        for (String phrase : ord) {
            if (!phrase.equals("brug en løkke")) {
                tekstUdenAlleOrd.append(phrase).append(" ");
            }
        }

        System.out.println("Tekst uden alle forekomster af 'brug en løkke':");
        System.out.println(tekstUdenAlleOrd.toString().trim());
*/
        scanner.close();
    }
}
