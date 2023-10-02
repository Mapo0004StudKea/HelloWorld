package III_Betingelser.Live_Programming;

import java.util.Random;

public class Diceman {
    public static void main(String[] args) {
        Random gen = new Random();
        int dice = gen.nextInt(6)+1; //intervallet [1, 6]
        String activity = "";
        System.out.println("Dicemann 1");
        if (dice == 1) {
            activity = "Breakfast";
        }
        if (dice == 2) {
            activity = "Study";
        }
        if (dice == 3) {
            activity = "Go swimming";
        }
        if (dice == 4) {
            activity = "Go out fishing";
        }
        if (dice == 5) {
            activity = "Call your mother";
        }
        if (dice == 6) {
            activity = "Back to sleep";
        }
        System.out.println(activity);
        System.out.println("Goodbye");
    }
}
