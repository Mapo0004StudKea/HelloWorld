package II_Datatyper_og_Variabler.Live_Programming;

public class BankApp1 {
    public static void main(String[] args) {
        double konto_1 = 50.25;
        int kontonr_1 = 1;
        String navn_1 = "Ole Hansen";

        double konto_2;
        int kontonr_2;
        String navn_2;

        konto_2 = 100;
        kontonr_2 = 2;
        navn_2 = "Pia Nielsen";

        System.out.println("\nFør: ");
        System.out.println("Konto "+kontonr_1+": "+navn_1 + " "+konto_1);
        System.out.println("Konto "+kontonr_2+": "+navn_2 + " "+konto_2);

        konto_1 = konto_1 + 100; //indsæt 100 kr.
        konto_1 = konto_1 * 1.05; //renter 5%.

        System.out.println("\nEfter: ");
        System.out.println("Konto "+kontonr_1+": "+navn_1 + " "+konto_1);
        System.out.println("Konto "+kontonr_2+": "+navn_2 + " "+konto_2);

        double samlet_indlån = konto_1+konto_2;
        double gns_indlån=samlet_indlån/2;

        System.out.println("\nSamlet indlån= " + samlet_indlån);
        System.out.println("Gennemsnitligt indlån= "+ gns_indlån);

        System.out.println(5.0/2);
    }
}
