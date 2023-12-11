package VII_FilInput_FilOutput.Live_Programering;

import java.io.*;
import java.util.ArrayList;

public class MyVersionStudentList {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("StudentFile2.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<String> list = new ArrayList<>();
        String linje = ind.readLine();
        while (linje != null)
        {

            String[] bidder = linje.split(",");
            //System.out.println(linje);
            //System.out.println(bidder[0]);
            //System.out.println(bidder[1]);
            //System.out.println(bidder[2]);
            String navn = bidder[0];
            //System.out.println(navn);
            list.add(navn);
            linje = ind.readLine();
        }
        fil.close();
        list.sort(null);
        for (String s: list) {
            System.out.println(s);
        }
        saveList(list);
    }

    static void saveList(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s: l) {
            ud.println(s);
        }
        fil.close();
    }
}
