package XVI_Eksempler_Fra_Bøger;
//int indexOf (String str)
//returnerer indekset på den første forekomst af str som delstreng. Hvis str ikke er en delstreng, returneres -1.

//int lastIndexOf (String str)
//returnerer indekset på den sidste forekomst af str som delstreng. Hvis str ikke er en delstreng, returneres -1.

//int indexOf( objekt )
//returnerer indekset på første forekomst af objekt i listen. Hvis den ikke findes, returneres -1.

//int indexOf (String str) "hvor er delstrengen x?"
//giver indeks på første forekomst af str som delstreng. Er str ikke er en delstreng, returneres -1.
public class BenytStrenge {
    public static void main(String[] arg)
    {
        String s = "Ude godt";
        System.out.println("Strengen s indeholder: "+s);
        System.out.println("s er "+s.length()+" tegn lang");
        System.out.println("s med store bogstaver: "+s.toUpperCase());
        System.out.println("Tekst på plads nummer 4 og frem: "+s.substring(4));
        System.out.println("Det første g er på plads nummer: "+s.indexOf("g"));
    }
}
