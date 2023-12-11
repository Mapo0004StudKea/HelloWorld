package V_Metoder.SecondGo;

import java.util.Scanner;

public class Gennemsnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int talEt; int talTo; int talTre; int talFire;
        System.out.println("Dette program udregner gennemsnittet ud af fire tal, ved hjælp at en metode.");
        System.out.println("Skriv det første tal");
        talEt = scanner.nextInt();
        System.out.println("Skriv det næste tal");
        talTo = scanner.nextInt();
        System.out.println("Skriv det næste tal");
        talTre = scanner.nextInt();
        System.out.println("Skriv det sidste tal");
        talFire = scanner.nextInt();
        gennemsnit(talEt, talTo, talTre, talFire);

    }
    public static void gennemsnit (int talEt, int talTo, int taltre, int talFire) {
        int gns = talEt+talTo+taltre+talFire/4;
        System.out.println("gennemsnittet af de fire tal er: "+gns);
    }
}
