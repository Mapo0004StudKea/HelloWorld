package V_Metoder.SecondGo;

import java.util.Random;
import java.util.Scanner;

public class CopenhagenMarathonOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please write how many will be participating.");
        int deltagere = scanner.nextInt();
        scanner.nextLine();

        for (int i=1;i<deltagere;i++) {
            System.out.println("Please write down the participants names: ");
            String navn = scanner.nextLine();

            int nummer = random.nextInt(2000)+1;
            char gruppe = (char) (random.nextInt(4)+'A');
            bekræftelse(navn, nummer, gruppe);
        }

    }

    public static void bekræftelse (String navn, int nummer, char gruppe) {
        System.out.println("Dear "+navn);
        System.out.println("We are happy to receive your registration");
        System.out.println("Your start number is: "+nummer);
        System.out.println("You start in group: "+gruppe);
        System.out.println("Please check in 10 minutes before start.");
    }
}


