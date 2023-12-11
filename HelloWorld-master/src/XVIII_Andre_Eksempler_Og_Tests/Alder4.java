package XVIII_Andre_Eksempler_Og_Tests;

public class Alder4 {
    public static void main(String[] args) {
        int alder;
        alder = 15;
        while (alder < 18)
        {
            System.out.println("Du er "+alder+" år. Vent til du bliver ældre.");
            alder = alder + 1;
            System.out.println("Tillykke med fødselsdagen!");
        }
        System.out.println("Nu er du "+alder+" år og myndig.");
    }
}
