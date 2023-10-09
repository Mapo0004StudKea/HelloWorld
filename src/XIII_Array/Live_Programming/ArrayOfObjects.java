package XIII_Array.Live_Programming;

public class ArrayOfObjects {
    public static void main(String[] args) {
        //spiller1 er en reference variable der pager på objektet af Spilleren.
        //Spiller spiller1 = new Spiller("Kasper Schmeichel", 1);
        //System.out.println(spiller1);
        /*
        Spiller spiller2 = new Spiller("Henrik Dalsgaard", 14);
        Spiller spiller3 = new Spiller("Simon Kjær", 4);
        Spiller spiller4 = new Spiller("Mathias Jørgensen", 13);
        Spiller spiller5 = new Spiller("Jens Larsen", 17);
        Spiller spiller6 = new Spiller("Thomas Delaney", 8);
        Spiller spiller7 = new Spiller("Andreas Christensen", 6);
        Spiller spiller8 = new Spiller("Christian Eriksen", 10);
        Spiller spiller9 = new Spiller("Martin Braithwaite", 11);
        Spiller spiller10 = new Spiller("Andreas Comelie", 21);
        Spiller spiller11 = new Spiller("Pione Sisto", 23);

         */
        Spiller[] hold = new Spiller[11];
        hold[0] = new Spiller("Kasper Schmeichel", 1);
        hold[1] = new Spiller("Henrik Dalsgaard", 14);
        hold[2] = new Spiller("Simon Kjær", 4);
        hold[3] = new Spiller("Mathias Jørgensen", 13);
        hold[4] = new Spiller("Jens Larsen", 17);
        hold[5] = new Spiller("Thomas Delaney", 8);
        hold[6] = new Spiller("Andreas Christensen", 6);
        hold[7] = new Spiller("Christian Eriksen", 10);
        hold[8] = new Spiller("Martin Braithwaite", 11);;
        hold[9] = new Spiller("Andreas Cornelius", 21);
        hold[10] =  new Spiller("Pione Sisto", 23);
        printSpillerHold(hold);
        System.out.println();
        //udskift af en spiller
        hold[9] = new Spiller("Rasmus Højlund", 18);
        printSpillerHold(hold);
    }
    static void printSpillerHold(Spiller[] team) {
        for (int i=0;i<team.length;i++) {
            System.out.println(team[i]);
        }
    }
}

class Spiller {
    //navn og rygnummer instans-variabler
    String navn;
    int rygnummer;

    //n og ryg er lokal-variabler
    Spiller(String navn, int nummer) {
        //Bruger kun this. hvis der er navnesammenfald
        //this er det objekt man arbejder på nu.
        this.navn = navn;
        rygnummer = nummer;
    }

    @Override
    public String toString() {
        return rygnummer+"."+" "+navn;
    }
}