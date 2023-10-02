package XVIIII_SCRUM_Project;

import java.util.Scanner;

public class OpskriftApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("*****************************************************************************************");
            System.out.println("*                                                                                       *");
            System.out.println("*                    Velkommen til Opskrifts Programmet                                 *");
            System.out.println("*                       Du har nu x antal muligheder                                    *");
            System.out.println("*                             tast 1: for xx                                            *");
            System.out.println("  q for quit");
            System.out.print("Instast operator: ");
            choice = scanner.nextInt();
            if (choice == 0) break;
            System.out.println("\n");

            switch (choice){
                case 1:

                    break;
                default:
                    System.out.println("Ugyldig operator");
                    System.out.println();
                    continue;
            }

            System.out.println();
        }
    }
}

