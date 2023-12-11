package III_Betingelser.SecondGo;

import java.util.Scanner;

public class StørstOgMindst {
    public static void main(String[] args) {
        double tal1;
        double tal2;
        double tal3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for tre tal.");
        System.out.println("Indtast det første tal");
        tal1 = scanner.nextInt();
        System.out.println("Indtast det andet tal");
        tal2 = scanner.nextInt();
        System.out.println("Indtast det sidste tal");
        tal3 = scanner.nextInt();

        System.out.println("De tre tal er: "+tal1+", "+tal2+" og "+tal3);

        if (tal1 > tal2 && tal1 > tal3 && tal2>tal3) {
            System.out.println("Det første til at størst, og det sidste tal er mindst");
        }
        else if (tal1 > tal2 && tal1 >tal3 &&  tal3>tal2) {
            System.out.println("Det første til at størst, og det andet tal er mindst");
        }
        else if (tal2 > tal1 && tal2 > tal3 && tal3>tal1) {
            System.out.println("Det andet tal er det største, og det første tal er mindst");
        }
        else if (tal2 > tal1 && tal2 > tal3 && tal1>tal3) {
            System.out.println("Det andet tal er det største, og det sidste tal er mindst");
        }
        else if (tal3 > tal1 && tal3 > tal2 && tal2>tal1) {
            System.out.println("Det sidste tal er det største, og det første tal er mindst");
        }
        else if (tal3 > tal1 && tal3 > tal2 && tal1>tal2) {
            System.out.println("Det sidste tal er det største, og det andet tal er mindst");
        }
        else  System.out.println("Der er ingen at tallene der er største eller mindst");
    }
}
