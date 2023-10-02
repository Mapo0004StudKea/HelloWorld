package XVII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class Andengradsligning {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("skriv det første tal");
        int a = input.nextInt();
        System.out.println("skriv det andet tal");
        int b = input.nextInt();
        System.out.println("skriv det tredje tal");
        int c = input.nextInt();
        int d = b*b-4*a*c;
        double x, x2;
        if (d < 0) {
            System.out.println("ligningen har ingen løsninger");
        }
        if (d == 0) {
            System.out.println("ligningen har en løsninger");
            x = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("løsningen er: "+x);
        }
        if (d > 0) {
            System.out.println("ligningen har to løsninger");
            x = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("løsningerne er: "+x+" eller "+x2 );
        }


    }

}

