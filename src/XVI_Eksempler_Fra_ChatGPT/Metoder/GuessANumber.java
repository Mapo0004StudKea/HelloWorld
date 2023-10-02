package XVI_Eksempler_Fra_ChatGPT.Metoder;
/**
 * subject java  beginner programming methods. Make a program that generates a random number in the interval [1,100].
 * The user tries to guess and the program must then tell whether the guess is greater than, less than,
 * or equal to the secret number. This is repeated until the number is guessed. Finally,
 * the program must tell how many guesses the user has used. the code must be made using methods
 */

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static int getUserGuess(Scanner scanner) {
        int userGuess;
        while (true) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess >= 1 && userGuess <= 100) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Consume invalid input
            }
        }
        return userGuess;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");

        Scanner scanner = new Scanner(System.in);

        int userGuess;
        do {
            userGuess = getUserGuess(scanner);
            numberOfGuesses++;

            if (userGuess < secretNumber) {
                System.out.println("The secret number is greater than your guess. Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("The secret number is less than your guess. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the secret number (" + secretNumber + ")!");
                System.out.println("It took you " + numberOfGuesses + " guesses.");
            }
        } while (secretNumber != userGuess);

        scanner.close();
    }
}
/**
 * In this program:
 *
 *     1. We use the Random class to generate a random number between 1 and 100 (inclusive).
 *     2. We use a do-while loop to repeatedly prompt the user for guesses until they guess the correct number.
 *     3. The getUserGuess method is used to validate and retrieve the user's guess, ensuring it is within the specified range.
 *     4. The program provides feedback to the user based on whether their guess is greater than, less than, or equal to the secret number.
 *     5. It keeps track of the number of guesses the user has made and displays the count when they guess correctly.
 *     6. The program also welcomes the user and provides instructions at the beginning.
 */