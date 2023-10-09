package XVII_Eksempler_Fra_ChatGPT;

import java.util.Random;
import java.util.Scanner;
/*
subject java beginner programming methods.
Make a program that generates a random number in the interval [1,100].
The user tries to guess and the program must then tell whether the guess is greater than, less than, or equal to the secret number.
This is repeated until the number is guessed. Finally, the program must tell how many guesses the user has used.
 */

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a secret number between 1 and 100. Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < secretNumber) {
                System.out.println("The secret number is greater than your guess.");
            } else if (userGuess > secretNumber) {
                System.out.println("The secret number is less than your guess.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the secret number: " + secretNumber);
                System.out.println("You took " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
