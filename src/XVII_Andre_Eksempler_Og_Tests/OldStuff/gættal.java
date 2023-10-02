package XVII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;
public class gættal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Tal = (int) (Math.random()*100+1);
        System.out.println("Mit tilfældige tal er: " + Tal);
        // 1) Tag input fra brugeren som et gæt
        // 2) Printe ud om det er rigtigt, for hæjt eller for lavt.
        // 3) lav det tilfældige tal mellem 1 og 25
        // 3) brugeren får 5 gæt

        while (true) {
            System.out.println("gæt et tal.");
            int t;
            t = 0;
            int gæt = input.nextInt();
            t = t + 1;
            if (gæt < Tal) {
                System.out.println("tallet er for lavt");
            }
            if (gæt > Tal) {
                System.out.println("tallet er for højt");
            }
            if (gæt == Tal) {
                System.out.println("Du har gættet rigtigt");
                break;
            }

        }

    }

}

