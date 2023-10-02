package XVII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;
public class Gætettal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        int Etage = (int) (Math.random()*100+1);
        //System.out.println("Mit tilfældige tal er: " + Tal);
        // 1) Tag input fra brugeren som et gæt
        // 2) Printe ud om det er rigtigt, for hæjt eller for lavt.
        // 3) lav det tilfældige tal mellem 1 og 25
        // 3) brugeren får 5 gæt

        int æg;
        æg = 2;
        æg = æg - 1;

        while (true) {
            System.out.println("gæt et tal.");


            int t;
            t = 0;
            int gæt = input.nextInt();
            t = t + 1;
            if (gæt < Etage && æg > 1) {
                System.out.println("forkert etage og du har et forsøg igen");
            }
            if (gæt < Etage && æg < 1) {
                System.out.println("fandt ikke den rigtig etage og æggene er i stykker");
                break;
            }
            if (gæt < Etage && æg == 2) {
                System.out.println("forkert etage og prøv igen");
            }
            if (gæt > Etage) {
                System.out.println("Det er for højt, ægget går i stukker!");
            }
            if (gæt == Etage) {
                System.out.println("");
                break;
            }

        }

    }

}

