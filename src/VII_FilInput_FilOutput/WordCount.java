package VII_FilInput_FilOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordCount {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("WordCount.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split(" ");

                for (String word : lineWords) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        int wordCount = words.size();
        System.out.println("Total number of words: " + wordCount);

        int moneyCount = compareToIgnoreCase(words, "money");
        System.out.println("Occurrences of 'money': " + moneyCount);
    }

    public static int compareToIgnoreCase(ArrayList<String> words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.compareToIgnoreCase(target) == 0) {
                count++;
            }
        }
        return count;
    }
}
