package XVII_Eksempler_Fra_ChatGPT;

public class RemoveFirstOccurrence {
    public static void main(String[] args) {
        String inputText = "Dette er måske en tekst, hvor måske ordet 'måske' forekommer flere gange.";
        String wordToRemove = "måske";

        int indexOfFirstOccurrence = inputText.indexOf(wordToRemove);

        if (indexOfFirstOccurrence != -1) {
            String newText = inputText.substring(0, indexOfFirstOccurrence) +
                    inputText.substring(indexOfFirstOccurrence + wordToRemove.length());

            System.out.println("Tekst efter fjernelse af første forekomst af 'måske':");
            System.out.println(newText);
        } else {
            System.out.println("Ordet 'måske' blev ikke fundet i teksten.");
        }
    }
}
