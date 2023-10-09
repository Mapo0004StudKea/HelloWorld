package IV_Løkker.SecondGo;

import java.util.Scanner;

public class GætEtTal {
    public static void main(String[] args) {
        System.out.println("Jeg tænker på et tilfældig tal mellem 1-20, prøv at gætte dette tal.");
        int min = 1;
        int max = 20;
        int gæt;

        int Tal = (int) (Math.random()*(max - min) +min);
        //System.out.println(Tal);
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Indtast et tal mellem 1 og 20");
            gæt = scanner.nextInt();
            if (gæt == Tal) {
                System.out.println("Tillykke du har gættet rigtigt, godt gået!");
                break;
            }
            else if (gæt < Tal) {

                System.out.println("Dit gæt er for lavt, prøv igen.");
            }
            else  System.out.println("Dit gæt er for højt, prøv igen.");
        }

    }
}
