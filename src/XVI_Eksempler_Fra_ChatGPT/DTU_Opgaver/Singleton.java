package XVI_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Skriv en Singleton klasse. En singleton klasse garanterer at der aldrig er mere end ét instans af klassen.
Dette opnås ved at konstruktøren gøres utilgængelig fra andre klasser og at der i stedet skrives en getInstance() metode,
der returnerer det unikke instance.
Denne singleton skal hedde Singleton og have en getString() og en setString() metode.
Er Singleton klassen skrevet rigtigt, vil getString() returnere den samme string,
selv om man har to referencer der er hentet med getInstance() metoden og man har modificeret den ene med setString().
 */
public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton() {
        // Privat konstruktør forhindrer instansiering af klassen udefra
        data = "Default Data";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getString() {
        return data;
    }

    public void setString(String newData) {
        data = newData;
    }

    public static void main(String[] args) {
        // Opret to referencer til Singleton-objektet
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Udskriv data fra begge instanser
        System.out.println("Instance 1 data: " + instance1.getString());
        System.out.println("Instance 2 data: " + instance2.getString());

        // Ændr data på den ene instans
        instance1.setString("New Data");

        // Udskriv data igen
        System.out.println("Instance 1 data efter ændring: " + instance1.getString());
        System.out.println("Instance 2 data efter ændring: " + instance2.getString());
    }
}
/*
I denne Singleton-klasse er konstruktøren gjort privat, så den ikke kan kaldes udefra.
Den eneste måde at få en instans af Singleton-klassen er at bruge getInstance() metoden.
Denne metode opretter kun en enkelt instans af Singleton-klassen og returnerer den, hvis den ikke allerede er blevet oprettet.

Når setString() metoden kaldes på en instans, vil ændringen påvirke alle andre referencer, da de deler den samme instans.
Derfor vil getString() metoden returnere den samme string, uanset hvilken reference der bruges.

I main-metoden er der vist et eksempel på at oprette to referencer til Singleton-objektet,
ændre data på en af dem og se, hvordan ændringen påvirker begge referencer.
 */