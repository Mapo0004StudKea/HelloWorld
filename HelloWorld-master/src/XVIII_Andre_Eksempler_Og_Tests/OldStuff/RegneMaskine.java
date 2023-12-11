package XVIII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class RegneMaskine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("det er regenmasking der kan ligge tal sammen");
        System.out.println("indsætte the first tal");
        int number1 = input.nextInt();
        System.out.println("indsætte scand nummer");
        int number2 = input.nextInt();
        int summen = number1 + number2 ;
        System.out.println("result = "+ summen);

    }
}
