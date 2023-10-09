package II_Datatyper_og_Variabler.SecondGo;

import java.util.Random;

public class TilfældigeTal {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        int Tal1 = (int) (Math.random()*(max - min) +min);
        int Tal2 = (int) (Math.random()*(max - min) +min);
        int Tal3 = (int) (Math.random()*(max - min) +min);

        double Sum = Tal1+Tal2+Tal3;
        double Gennemsnit = Sum / 3;

        System.out.println("De tre tilfældige tal er: "+Tal1+", "+Tal2+" og "+Tal3);
        System.out.println("Summen af de tre tal er: "+Sum);
        System.out.println("Gennemsnittet af de tre tal er: "+Gennemsnit);
    }
}
