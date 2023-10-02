package XVI_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Lav en klasse Dato til at repræsentere datoer. Klassen skal have en enkelt konstruktør:
Dato(int year, int month, int =day){ //kode }
således at
Dato(2000,3,9)
opretter et nyt Dato objekt med datoen 9. marts 2000.
Overvej hvilke felter Dato klassen skal have.
Der skal være følgende metoder i Dato klassen (alle public):
String danish()
som returnerer datoen i det normale danske format (f.eks. 9/3 2000).
String danishText()
datoen med måneden som navn i stedet for tal (f.eks. 9. marts 2000)
(ekstra spørgsmål)
String iso()
viser datoen i ISO-format (f.eks. 2000–03–09).
 */

public class Dato {
    private int year;
    private int month;
    private int day;

    public Dato(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String danish() {
        return day + "/" + month + " " + year;
    }

    public String danishText() {
        String[] monthNames = {
                "januar", "februar", "marts", "april",
                "maj", "juni", "juli", "august",
                "september", "oktober", "november", "december"
        };

        return day + ". " + monthNames[month - 1] + " " + year;
    }

    public String iso() {
        String monthStr = (month < 10) ? "0" + month : String.valueOf(month);
        String dayStr = (day < 10) ? "0" + day : String.valueOf(day);

        return year + "-" + monthStr + "-" + dayStr;
    }

    public static void main(String[] args) {
        Dato date = new Dato(2000, 3, 9);

        System.out.println("Danish Format: " + date.danish());
        System.out.println("Danish Text Format: " + date.danishText());
        System.out.println("ISO Format: " + date.iso());
    }
}
/*
I denne klasse er der tre private felter (year, month, day) til at gemme datoinformation.
Konstruktøren initialiserer disse felter, når et nyt Dato-objekt oprettes.

Der er også tre metoder:

    danish(): Returnerer datoen i det danske format (d/m yyyy).
    danishText(): Returnerer datoen med måneden som navn i stedet for tal (d. måned yyyy).
    iso(): Viser datoen i ISO-format (yyyy-mm-dd).

Du kan oprette et Dato-objekt og bruge disse metoder til at formatere datoen efter behov, som vist i main-metoden.
 */