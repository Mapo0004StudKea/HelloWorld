package XVI_Eksempler_Fra_ChatGPT;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        String inputText = "Dette er måske en tekst, hvor måske ordet 'måske' forekommer flere gange.";
        String wordToRemove = "måske";

        StringBuilder newText = new StringBuilder();
        int startIndex = 0;

        while (true) {
            int indexOfOccurrence = inputText.indexOf(wordToRemove, startIndex);

            if (indexOfOccurrence == -1) {
                break; // Stop løkken, hvis ordet ikke findes igen.
            }

            newText.append(inputText.substring(startIndex, indexOfOccurrence));
            startIndex = indexOfOccurrence + wordToRemove.length();
        }

        newText.append(inputText.substring(startIndex));

        System.out.println("Tekst efter fjernelse af alle forekomster af 'måske':");
        System.out.println(newText.toString());
    }
}
