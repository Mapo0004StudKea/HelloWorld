package VI_Menu_Program.Opgaver;

//Skriv et program, der finder positionen af det første mellemrum i en streng.
//(vink: Brug metoden indexOf(" "))

public class FindMellemrum {
        public static void main(String[] args) {
            String Phrase = "Dette program er for at finde det første mellemrum i teksten.";

            System.out.println("Det her er hvad teksten siger: "+Phrase);
            System.out.println("Det første mellemrum i teksten er: : "+Phrase.indexOf(" "));
        }

}
