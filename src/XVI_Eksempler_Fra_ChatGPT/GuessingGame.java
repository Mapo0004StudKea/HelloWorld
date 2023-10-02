package XVI_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 42; // Change this to your desired secret number
        int guess;

        while (true) {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed correctly.");
                break; // Exit the loop when the guess is correct
            } else if (guess > secretNumber) {
                System.out.println("The secret number is lower. Try again.");
            } else {
                System.out.println("The secret number is higher. Try again.");
            }
        }

        scanner.close();
    }
}
