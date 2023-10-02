package III_Betingelser.II_III_III_Opgaver;

import java.util.Scanner;

public class Portoberegning {
    public static void main(String[] args) {
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Indtast brevets vægt i gram: ");
        double vægt = keyboardinput.nextDouble();

        double grundpris = 11.0;
        double prisPr100gram = 4.0;

        double postage = grundpris + Math.ceil((vægt - 50) / 10) * prisPr100gram;

        System.out.println("Portoen for at sende brevet som A-post er: " + postage + " kr,");
    }
}
