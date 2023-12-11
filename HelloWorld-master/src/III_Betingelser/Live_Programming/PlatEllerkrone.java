package III_Betingelser.Live_Programming;

import java.util.Random;

public class PlatEllerkrone {
    public static void main(String[] args) {
        Random gen = new Random(); //Random classe der er blevet kaldt gen
        int tal = gen.nextInt(2); //gen er et tal mellem 0 eller 1
        System.out.println("tal = " + tal); //udskriver hvad tallet er
        if (tal == 0) {
            System.out.println("Plat"); //if sætning hvor 0 == plat
            System.out.println("Tillykke du vandt!");
        }
        else {
            System.out.println("Krone"); // else sætning hvor 1 == krone
            System.out.println("Desværre du tabte");
        }
        System.out.println("Tak for i dag");
    }
}
