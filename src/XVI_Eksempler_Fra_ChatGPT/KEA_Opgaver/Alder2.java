package XVI_Eksempler_Fra_ChatGPT.KEA_Opgaver;
/*
public class Alder2
{
public static void main(String[] arg)
{
int alder;
alder = 15;
if (alder >= 18)
System.out.println("Du er myndig.");
else
System.out.println("Du er ikke myndig.");
System.out.println("Du er " + alder + " år.");
}
}
Skriv Alder2 om til at indeholde flere aldergrænser.
 */
public class Alder2 {
    public static void main(String[] arg) {
        int alder;
        alder = 15;

        if (alder >= 18) {
            System.out.println("Du er myndig.");
        } else if (alder >= 16) {
            System.out.println("Du må køre knallert.");
        } else if (alder >= 13) {
            System.out.println("Du er teenager.");
        } else {
            System.out.println("Du er ikke myndig.");
        }

        System.out.println("Du er " + alder + " år.");
    }
}
/*
I dette program er der flere aldergrænser og tilsvarende beskeder, der udskrives baseret på alderen.
Hvis alderen er 15, vil programmet udskrive "Du er teenager." før det viser "Du er 15 år.".
Du kan tilføje eller ændre aldergrænser og meddelelser efter behov.
 */
