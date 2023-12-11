package V_Metoder.SecondGo;

import java.util.Scanner;

public class Gennemsnit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int talEt; int talTo; int talTre; int talFire;
        System.out.println("Dette er et program der modtager fire tal og udskriver gennemsnittet med en metode.");
        System.out.println("Indtast værdi for det første tal: ");
        talEt = scanner.nextInt();
        System.out.println("Indtast værdi for det andet tal: ");
        talTo = scanner.nextInt();
        System.out.println("Indtast værdi for the tredje taæ; ");
        talTre = scanner.nextInt();
        System.out.println("Indtast værdi for the sidste tal");
        talFire = scanner.nextInt();
        double resultat = gennemsnit(talEt, talTo, talTre, talFire);
        double gns = resultat;
        System.out.println("Gennemsnittet af tallen er: "+gns);


    }
    public static double gennemsnit (int talEt, int talTo, int talTre, int talFire) {
        int gns = (talEt+talTo+talTre+talFire)/4;
        double resultat = gns;
        return resultat;
    }
}
