package XV_2DArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Rainfall {
    static final int MAPALANA=0;
    static final int RATNAPURA=1;
    static final int SITA_ELIYA=2;
    static final int BADULLA=3;
    static final int MATALE=4;
    static final int ANURADHAPURA=5;
    static final int AMPARA=6;
    static final int HAMBEGAMUWA=7;
    static final int AMBALANTOTA=8;
    static final int KIRAMA=9;
    static final int A_PALESSA=10;

    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, OCT,  NOV, DEC}

    public static void main(String[] args) throws IOException {
        int[][] data = new int[11][12];
        FileReader fil = new FileReader("C:\\Users\\Alexander\\Documents\\Kea\\Fag\\IntelliJ Projects\\Prog1 DAT23b\\src\\XV_2DArray\\RainfallData.txt");
        BufferedReader ind = new BufferedReader(fil);
        String linje = ind.readLine();
        int r = 0;
        while (linje != null) {
            String[] bidder = linje.split(" ");
            for (int c = 0; c <= 11; c++) {
                data[r][c] = Integer.parseInt(bidder[c]);
            }
            linje = ind.readLine();
            r++;
        }
        fil.close();

        System.out.println(data[AMPARA][Month.APR.ordinal()]);
        System.out.println(data[MAPALANA][Month.MAY.ordinal()]);
        System.out.println(data[RATNAPURA][Month.JUL.ordinal()]);
        System.out.println(data[A_PALESSA][Month.DEC.ordinal()]);

        for (int by=MAPALANA;by<=A_PALESSA;by++) {
            System.out.println(data[by][Month.MAY.ordinal()]);
        }
        for (Month m: Month.values()) {
            System.out.print(data[AMPARA][m.ordinal()]+" ");
        }
    }
}
