package XVI_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Hver bil i et register har følgende data:
1. mærke, f.eks. ‘Citroën’
2. nummerplade, f.eks. ‘SV 27698’
3. farve, f.eks. ‘rød’

Hvis man har en bil i registret, skal kan man kunne:
1. Formaterer oplysningerne som en tegnstreng. (Lav en toString() metode.)
2. Undersøge om den er af samme mærke som en anden given bil.
 */
public class Bil {
    private String mærke;
    private String nummerplade;
    private String farve;

    public Bil(String mærke, String nummerplade, String farve) {
        this.mærke = mærke;
        this.nummerplade = nummerplade;
        this.farve = farve;
    }

    public String toString() {
        return "Mærke: " + mærke + ", Nummerplade: " + nummerplade + ", Farve: " + farve;
    }

    public boolean erSammeMærkeSom(Bil andenBil) {
        return this.mærke.equalsIgnoreCase(andenBil.mærke);
    }

    public static void main(String[] args) {
        Bil bil1 = new Bil("Citroën", "SV 27698", "rød");
        Bil bil2 = new Bil("Toyota", "AB 12345", "blå");

        System.out.println("Bil 1: " + bil1.toString());
        System.out.println("Bil 2: " + bil2.toString());

        if (bil1.erSammeMærkeSom(bil2)) {
            System.out.println("Bil 1 og Bil 2 er af samme mærke.");
        } else {
            System.out.println("Bil 1 og Bil 2 er ikke af samme mærke.");
        }
    }
}
/*
I denne klasse er der tre private felter (mærke, nummerplade, farve), der repræsenterer oplysningerne om bilen.
Konstruktøren initialiserer disse felter, når et nyt Bil-objekt oprettes.

Der er også to metoder:

    toString(): Returnerer oplysningerne om bilen som en streng.
    erSammeMærkeSom(Bil andenBil): Sammenligner mærket på den aktuelle bil med mærket på en anden
    given bil ved at ignorere store og små bogstaver.

I main-metoden oprettes to Bil-objekter, og deres oplysninger udskrives.
Derefter kontrolleres det, om de er af samme mærke ved hjælp af erSammeMærkeSom-metoden.
Du kan ændre oplysningerne om bilerne og foretage yderligere sammenligninger efter behov.
 */