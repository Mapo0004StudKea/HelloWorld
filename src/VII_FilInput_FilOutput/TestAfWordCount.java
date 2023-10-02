package VII_FilInput_FilOutput;

import java.io.*;
import java.util.ArrayList;

public class TestAfWordCount {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("WordCount.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<String> words = new ArrayList<>();
        String linje = ind.readLine();
        while (linje != null)
        {
            System.out.println(linje);
            linje = ind.readLine();
        }
    }
}
