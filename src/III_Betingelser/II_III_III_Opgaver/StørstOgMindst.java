package III_Betingelser.II_III_III_Opgaver;

import java.util.Scanner;

public class StørstOgMindst {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Indtast tre tal: \n");
        System.out.println("Indtast det første tal");
        int tal1 = keyboardInput.nextInt();
        System.out.println("Indtast det næste tal");
        int tal2 = keyboardInput.nextInt();
        System.out.println("Indtast det sidste tal");
        int tal3 = keyboardInput.nextInt();
        System.out.println("De tre tal er: "+tal1+", "+tal2+" og "+tal3);
        if (tal1 > tal2 && tal1 > tal3 && tal2 < tal3) {
            System.out.println(tal1 +" Er det største tal");
            System.out.println(tal2 + " og er det mindste");
        }
        else if (tal1 > tal2 && tal1 > tal3 && tal3 < tal2) {
            System.out.println(tal1 +" Er det største tal");
            System.out.println(tal3 + " og er det mindste");
        }
        else if (tal2 > tal1 && tal2 > tal3 && tal1 < tal3) {
            System.out.println(tal2+" Er største tal");
            System.out.println(tal1+" Er det mindste tal");
        }
        else if (tal2 > tal1 && tal2 > tal3 && tal3 < tal1) {
            System.out.println(tal2+" Er største tal");
            System.out.println(tal3+" Er det mindste tal");
        }
        else if (tal3 > tal1 && tal3 > tal2 && tal1 < tal2) {
            System.out.println(tal3+" Er det største tal");
            System.out.println(tal1+" Er det mindste tal");
        }
        else if (tal3 > tal1 && tal3 > tal2 && tal2 < tal1) {
            System.out.println(tal3+" Er det største tal");
            System.out.println(tal2+" Er det mindste tal");
        }
        System.out.println("This program will exit after this message.");
        System.exit(0); // Exit with status code 0 (normal exit)
    }
}
