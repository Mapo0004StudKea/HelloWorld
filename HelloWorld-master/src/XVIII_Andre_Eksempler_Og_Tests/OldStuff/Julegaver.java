package XVIII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class Julegaver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast antal gaver Anne får.");
        int AnneGaver = input.nextInt();
        System.out.println("Indtast antal gaver Laura får.");
        int LauraGaver = input.nextInt();
        System.out.println("Indtast antal gaver Oscar får.");
        int OscarGaver = input.nextInt();

        //bruger boolean for del 2 hvis ingen bliver sure.
        boolean IngenSure = true;

        if (LauraGaver > AnneGaver && OscarGaver > AnneGaver) {
            System.out.println(" Anne bliver sur!");
            IngenSure = false;
        }
        if (AnneGaver > LauraGaver){
            System.out.println("Laura bliver sur!");
            IngenSure = false;
        }
        if (OscarGaver < AnneGaver || OscarGaver < LauraGaver) {
            System.out.println("Oscar bliver sur!");
            IngenSure = false;
        }
        if (IngenSure == true) {
            System.out.println("Alle er glade");
        }
    }

}

