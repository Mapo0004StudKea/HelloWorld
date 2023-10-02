package VI_Menu_Program.Live_Programering;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegnemaskineMyVersion {
    public static void main(String[] args) {
        double num1=0; double num2=0; char op; double result;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(" Velkommen til regnemaskinen");
            System.out.println("+ for addition");
            System.out.println("- for subtraktion");
            System.out.println("* for multiplikation");
            System.out.println("/ for division");
            System.out.println("q for quit");
            System.out.println("Indtast operator: ");
            op = input.next().charAt(0);
            if (op == 'q') break;

            num1 = inputDouble("indtast det første tal: ");
            num2 = inputDouble("Indtast det andet tal: ");

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                System.out.println("Ugyldig operator");
                System.out.println();
                continue;
            }
            System.out.println("Resultat: "+result);
            System.out.println();
        } // while
        System.out.println("Tak for i dag.");
    } //main

    static double inputDouble(String prompt) {
        boolean OK = false;
        double num=0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println(prompt);
                num = scanner.nextDouble();
                OK = true;
            } catch (InputMismatchException e) {
                System.out.println("Ulovligt input, prøv igen.");
                scanner.nextLine();
            }
        } while (!OK);
        return num;
    }

}
