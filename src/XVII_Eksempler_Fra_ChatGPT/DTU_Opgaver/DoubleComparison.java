package XVII_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Start med at definere to doubles d1 og d2;
Lav et stykke kode som udskriver true hvis de 2 double er ens og false hvis de 2 double er forskellige.
Sørg for at der udskrives true hvis de 2 double er næsten ens. Det vil sige at tæt ved hinanden i talsystemet som gemmer double.
Find passende testdata. Vi skal have meget store tal, meget små tal, samt nogen som ligge tæt på hinanden og som skal udskrive true.
 */

public class DoubleComparison {
    public static void main(String[] args) {
        double d1 = 5.1;
        double d2 = 5.0; // Ændr disse værdier efter behov

        // Toleranceværdi for at vurdere, om de er "næsten ens"
        double tolerance = 1e-9; // Dette er et eksempel på en lille tolerance

        // Sammenlign de to double-værdier med tolerance
        boolean areEqual = Math.abs(d1 - d2) < tolerance;

        // Udskriv resultatet
        System.out.println("Er de to double-værdier ens (eller næsten ens)? " + areEqual);
    }
}
/*
Dette program bruger Math.abs(d1 - d2) til at finde forskellen mellem de to double-værdier og sammenligner derefter
denne forskel med en toleranceværdi (her sat til 1e-9). Hvis forskellen er mindre end toleranceværdien,
betragtes de som "næsten ens," og areEqual er sat til true. Ellers er den sat til false.

Du kan ændre værdierne af d1 og d2 efter behov og køre programmet med forskellige kombinationer af store tal,
små tal og tæt på hinanden liggende tal for at teste sammenligningen. Toleranceværdien kan også justeres,
hvis nødvendigt, afhængigt af dine præcisionskrav.
 */