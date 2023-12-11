package VII_FilInput_FilOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopenhagenMarathon2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Reading participant information from CopenhagenMarathon.txt...");
        Scanner fileScanner = new Scanner(new File("Copenhagen Marathon.txt"));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(",");
            String deltagerensNavn = parts[0].trim();
            int startnummer = Integer.parseInt(parts[1].trim());
            char startGruppe = parts[2].trim().charAt(0);

            Confermation(deltagerensNavn, startnummer, startGruppe);

            // Create a text file for each participant
            createRegistrationFile(deltagerensNavn, startnummer, startGruppe);
        }

        fileScanner.close();
        scanner.close();
    }

    public static void Confermation(String deltarensNavn, int startnummer, char startgruppe) {
        System.out.println("Dear " + deltarensNavn + "!");
        System.out.println("We are happy to receive your registration.");
        System.out.println("Your start number is: " + startnummer);
        System.out.println("You start in group: " + startgruppe);
        System.out.println("Please check in 10 minutes before start.");
    }

    public static void createRegistrationFile(String deltagerensNavn, int startnummer, char startgruppe) throws IOException {
        String fileName = deltagerensNavn + ".txt";
        FileWriter writer = new FileWriter(fileName);

        writer.write("Dear " + deltagerensNavn + "!\n");
        writer.write("We are happy to receive your registration.\n");
        writer.write("Your start number is: " + startnummer + "\n");
        writer.write("You start in group: " + startgruppe + "\n");
        writer.write("Please check in 10 minutes before start.\n");

        writer.close();
        System.out.println("Registration details for " + deltagerensNavn + " saved in " + fileName);
    }
}
