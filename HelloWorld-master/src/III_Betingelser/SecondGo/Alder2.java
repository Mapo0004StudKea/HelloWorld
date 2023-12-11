package III_Betingelser.SecondGo;

import java.util.Scanner;

public class Alder2 {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        int alder;
        System.out.println("Indtast din alder: ");
        alder = scanner.nextInt();
        System.out.println("Du er " + alder + " år.");
        if (alder <= 5) System.out.println("Du er kun et spædbarn og derfor ikke myndig");
        else if (alder <=12 && alder >=6) System.out.println("Du er stadig kun et barn og ikke myndig");
        else if (alder <=17 && alder >=13) System.out.println("Du er kun en teenager og ikke myndig");
        else if (alder == 18) System.out.println("Og er derfor myndig");
        else if (alder <= 25 && alder >=19) System.out.println("Du er et ungt voksen menneske");
        else if (alder <= 39 && alder >=26) System.out.println("Du er i dine prime ");
        else if (alder <= 50 && alder >=40) System.out.println("du er ved at være oppe i årende");
        else if (alder <= 75 && alder >= 51) System.out.println("du er ved at være gammel");
        else if (alder <= 85 && alder >=76) System.out.println("Hey gamle");
        else if (alder <= 99 && alder >= 86) System.out.println("Du er godt nok gammel");
        else if (alder >=100) System.out.println("Hvorfor er du ikke død endnu?");
        else System.out.println("moo");


    }
}
