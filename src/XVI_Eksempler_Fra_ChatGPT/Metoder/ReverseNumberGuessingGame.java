package XVI_Eksempler_Fra_ChatGPT.Metoder;

import java.util.Scanner;

/*
now reverse the game so the user thinks of a number and the program must guess it.
Try to use as few guesses as possible. What is the maximum number of guesses required?
 */

public class ReverseNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it.");
        System.out.println("Please enter 'h' if my guess is too high, 'l' if it's too low, and 'c' if it's correct.");

        int lowerBound = 1;
        int upperBound = 100;
        int attempts = 0;

        while (lowerBound <= upperBound) {
            int guess = (lowerBound + upperBound) / 2;
            System.out.println("Is it " + guess + "? (h/l/c)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("c")) {
                System.out.println("Great! I guessed your number in " + attempts + " attempts.");
                break;
            } else if (response.equalsIgnoreCase("h")) {
                upperBound = guess - 1;
            } else if (response.equalsIgnoreCase("l")) {
                lowerBound = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }

            attempts++;
        }
        scanner.close();
    }
}
