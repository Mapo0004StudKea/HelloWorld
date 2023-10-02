package XVII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class Afstand {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double afstand;
        System.out.println("indtast en værdi for a: ");

        int a = scan.nextInt();
        System.out.println("Indtast en værdi for b: ");
        int b = scan.nextInt();
        System.out.println("indtast en værdi for punkt x0: ");
        int x0 = scan.nextInt();
        System.out.println("Indtast en værdi for punkt y0: ");
        int y0 = scan.nextInt();

        afstand = Math.abs(a*x0-y0+b)/Math.sqrt(1+a*a);
        System.out.println(afstand);
        scan.close();





    }
}
