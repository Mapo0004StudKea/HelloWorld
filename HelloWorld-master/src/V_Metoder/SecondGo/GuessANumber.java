package V_Metoder.SecondGo;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100)+1;
        System.out.println("This is a program where you have to guess a number between 1 and 100.");
        GuessANumberGame(secretNumber);

    }
    public static void GuessANumberGame(int secretNumber) {
        int guess; int tries=0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            tries++;
            System.out.println("Please type in your guess.");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations you have guessed the correct number!");
                System.out.println("You have spent "+tries+" tries.");
                break;
            }
            else if (guess < secretNumber) {
                System.out.println("The number i'm trinking og is higher that you guess, try again");
                System.out.println("You have spent "+tries+" tries.");
            }
            else {
                System.out.println("The number i'm thinking of is lower than your guess, try again.");
                System.out.println("You have spent "+tries+" tries.");
            }
        }
    }
}
