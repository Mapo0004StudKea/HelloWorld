package III_Betingelser.II_III_III_Opgaver;

public class Alder2 {
    public static void main(String args[]) {
        int alder;
        System.out.println("Indtast din alder: ");
        java.util.Scanner keyboardinput = new java.util.Scanner(System.in);
        alder = keyboardinput.nextInt();
        if (alder >= 18 && alder <= 24) System.out.println("Du er myndig");
        else if (alder >= 13 && alder <= 17) System.out.println("Du er teenager og ikke myndig");
        else if (alder >= 2 && alder <= 12) System.out.println("Du er et barn og ikke myndig");
        else if (alder >= 25 && alder <= 35) System.out.println("Du er en person i din prime og myndig");
        else if (alder >= 36 && alder <= 50) System.out.println("du er ved at være en ældre person");
        else if (alder >= 51 && alder <=75) System.out.println("du er ved at være gammel");
        else if (alder >= 76 && alder <= 99) System.out.println("Du er meget gammel");
        else if (alder >= 100 && alder <=150) System.out.println("Hvorfor er du ikke død endnu?!?!");
        else System.out.println("Du er et spedbarn!");
    }
}
