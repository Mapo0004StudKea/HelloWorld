package XVII_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Lav en klasse Car, der repræsenterer oplysninger om en bil og har metoder til ovenstående.
Klassen skal have navnet Car og metoderne:

toString()
Returnerer en String på formen: "[SV 27698] rød Citroën"

equals(Car otherCar)
Returnerer en boolean der er true hvis nummerpladen er den samme - ellers false

alike(Car otherCar)
Returnerer en boolean der er true hvis mærket og farven er den samme - ellers false
 */
public class Car {
    private String nummerplade;
    private String farve;
    private String mærke;

    public Car(String nummerplade, String farve, String mærke) {
        this.nummerplade = nummerplade;
        this.farve = farve;
        this.mærke = mærke;
    }

    public String toString() {
        return "[" + nummerplade + "] " + farve + " " + mærke;
    }

    public boolean equals(Car otherCar) {
        return this.nummerplade.equals(otherCar.nummerplade);
    }

    public boolean alike(Car otherCar) {
        return this.mærke.equalsIgnoreCase(otherCar.mærke) && this.farve.equalsIgnoreCase(otherCar.farve);
    }

    public static void main(String[] args) {
        Car car1 = new Car("SV 27698", "rød", "Citroën");
        Car car2 = new Car("AB 12345", "blå", "Toyota");
        Car car3 = new Car("SV 27698", "rød", "Citroën");

        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Car 3: " + car3.toString());

        System.out.println("Car 1 og Car 2 har samme nummerplade: " + car1.equals(car2));
        System.out.println("Car 1 og Car 3 har samme nummerplade: " + car1.equals(car3));
        System.out.println("Car 1 og Car 3 er ens i mærke og farve: " + car1.alike(car3));
    }
}
/*
I denne klasse er der tre private felter (nummerplade, farve, mærke), der repræsenterer oplysningerne om bilen.
Konstruktøren initialiserer disse felter, når et nyt Car-objekt oprettes.

Der er tre metoder:

    toString(): Returnerer oplysningerne om bilen som en streng i det ønskede format.
    equals(Car otherCar): Sammenligner nummerpladerne på den aktuelle bil og en anden given bil.
    alike(Car otherCar): Sammenligner mærket og farven på den aktuelle bil og en anden given bil.

I main-metoden oprettes tre Car-objekter med forskellige oplysninger, og deres oplysninger udskrives.
Derefter kontrolleres det, om de har samme nummerplade og om de er ens i mærke og farve ved hjælp af de respektive metoder.
Du kan ændre oplysningerne om bilerne og foretage yderligere sammenligninger efter behov.
 */