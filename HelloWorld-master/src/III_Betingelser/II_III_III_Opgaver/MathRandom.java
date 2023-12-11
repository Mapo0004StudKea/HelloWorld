package III_Betingelser.II_III_III_Opgaver;

import java.lang.Math;

public class MathRandom {
    public static void main(String args[]) {
        int max = 100;
        int min = 1;
        double range = max - min + 1;


        double rand = (int) (Math.random() * range);
        double rand2 = (int) (Math.random() * range);
        double rand3 = (int) (Math.random() * range);
        System.out.println(rand);
        System.out.println(rand2);
        System.out.println(rand3);

        double sum = rand+rand2+rand3;
        double gns = (rand+rand2+rand3)/3;

        System.out.println("Summen af de tre tal er: " + sum);
        System.out.println("Gennemsnittet af de tre tal er: " + gns);

    }
}
