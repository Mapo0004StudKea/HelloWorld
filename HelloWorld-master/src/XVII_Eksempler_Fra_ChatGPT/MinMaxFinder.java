package XVII_Eksempler_Fra_ChatGPT;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast det første tal: ");
        double num1 = scanner.nextDouble();

        System.out.print("Indtast det andet tal: ");
        double num2 = scanner.nextDouble();

        System.out.print("Indtast det tredje tal: ");
        double num3 = scanner.nextDouble();

        double min = Math.min(Math.min(num1, num2), num3);
        double max = Math.max(Math.max(num1, num2), num3);

        System.out.println("Det mindste tal er: " + min);
        System.out.println("Det største tal er: " + max);
    }
}
