package XX_SCRUM_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class OpskriftApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("************************************************************************************");
            System.out.println("*                                                                                  *");
            System.out.println("************************************************************************************");
            System.out.println("*                     Velkommen til Opskrift                                       *");
            System.out.println("*                     Du har nu 10 muligheder                                      *");
            System.out.println("*                     tast 1: for at gemme opskrifter med titel                    *");
            System.out.println("*                     tast 2: for at gemme ingredienser                            *");
            System.out.println("*                     tast 3: for at gemme fremgangsmåde                           *");
            System.out.println("*                     tast 4: for at søge efter opskrifter                         *");
            System.out.println("*                     tast 5: for at søge efter ingredienser                       *");
            System.out.println("*                     tast 6: for at søge efter kategori                           *");
            System.out.println("*                     tast 7: for at oprette en købsliste                          *");
            System.out.println("*                     tast 8: for at tilgå ratingsystemet                          *");
            System.out.println("*                     tast 9: for at kommentere                                    *");
            System.out.println("*                     tast 0: for at afslutte systemet                             *");
            System.out.println("************************************************************************************");
            System.out.print("Instast operator:");
            choice = scanner.nextInt();
            System.out.println("************************************************************************************");
            if (choice == 0) break;
            System.out.println("\n");

            switch (choice){
                case 1:
                    MadopskriftsApp app = new MadopskriftsApp();
                    app.main(args);
                    break;
                case 2:
                    MadopskriftsApp.main(args);
                    break;
                case 3:
                    MadopskriftsApp.main(args);
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

class Madopskrift {
    private String navn;
    private String ingredienser;
    private String instruktioner;

    public Madopskrift(String navn, String ingredienser, String instruktioner) {
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.instruktioner = instruktioner;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + "\nIngredienser: " + ingredienser + "\nInstruktioner: " + instruktioner + "\n";
    }
    public String getNavn() {
        return navn;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public String getInstruktioner() {
        return instruktioner;
    }
}
class MadopskriftsApp {
    private static final String FILNAVN = "madopskrifter.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Madopskrift> opskrifter = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tilføj ny madopskrift");
            System.out.println("2. Vis alle madopskrifter");
            System.out.println("3. Søg efter opskrift");
            System.out.println("4. Afslut");

            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Navn på opskrift: ");
                    String navn = scanner.nextLine();
                    System.out.print("Ingredienser: ");
                    String ingredienser = scanner.nextLine();
                    System.out.print("Instruktioner: ");
                    String instruktioner = scanner.nextLine();

                    Madopskrift nyOpskrift = new Madopskrift(navn, ingredienser, instruktioner);
                    opskrifter.add(nyOpskrift);
                    break;
                case 2:
                    visOpskrifter(opskrifter);
                    break;
                case 3:
                    System.out.println("Søg efter opskrift:");
                    System.out.println("1. Søg efter navn");
                    System.out.println("2. Søg efter ingredienser");
                    System.out.println("3. Søg efter instruktioner");

                    int søgeValg = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Skriv søgeord: ");
                    String søgeord = scanner.nextLine();

                    List<Madopskrift> resultater = new ArrayList<>();
                    switch (søgeValg) {
                        case 1:
                            resultater = OpskriftsSøger.søgEfterNavn(opskrifter, søgeord);
                            break;
                        case 2:
                            resultater = OpskriftsSøger.søgEfterIngredienser(opskrifter, søgeord);
                            break;
                        case 3:
                            resultater = OpskriftsSøger.søgEfterInstruktioner(opskrifter, søgeord);
                            break;
                        default:
                            System.out.println("Ugyldigt valg.");
                            break;
                    }

                    if (resultater.isEmpty()) {
                        System.out.println("Ingen resultater fundet.");
                    } else {
                        System.out.println("Resultater:");
                        for (Madopskrift resultat : resultater) {
                            System.out.println(resultat);
                        }
                    }
                    break;
                case 4:
                    gemOpskrifter(opskrifter);
                    System.out.println("Programmet afsluttes.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
                    break;
            }
        }
    }

    private static void visOpskrifter(List<Madopskrift> opskrifter) {
        System.out.println("Alle madopskrifter:");
        for (Madopskrift opskrift : opskrifter) {
            System.out.println(opskrift);
        }
    }

    private static void gemOpskrifter(List<Madopskrift> opskrifter) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILNAVN))) {
            for (Madopskrift opskrift : opskrifter) {
                writer.println(opskrift.toString());
            }
            System.out.println("Opskrifter gemt i " + FILNAVN);
        } catch (IOException e) {
            System.out.println("Fejl ved at gemme opskrifter.");
            e.printStackTrace();
        }
    }
}

class OpskriftsSøger {
    public static List<Madopskrift> søgEfterNavn(List<Madopskrift> opskrifter, String søgeord) {
        List<Madopskrift> resultater = new ArrayList<>();
        for (Madopskrift opskrift : opskrifter) {
            if (opskrift.getNavn().toLowerCase().contains(søgeord.toLowerCase())) {
                resultater.add(opskrift);
            }
        }
        return resultater;
    }

    public static List<Madopskrift> søgEfterIngredienser(List<Madopskrift> opskrifter, String søgeord) {
        List<Madopskrift> resultater = new ArrayList<>();
        for (Madopskrift opskrift : opskrifter) {
            if (opskrift.getIngredienser().toLowerCase().contains(søgeord.toLowerCase())) {
                resultater.add(opskrift);
            }
        }
        return resultater;
    }

    public static List<Madopskrift> søgEfterInstruktioner(List<Madopskrift> opskrifter, String søgeord) {
        List<Madopskrift> resultater = new ArrayList<>();
        for (Madopskrift opskrift : opskrifter) {
            if (opskrift.getInstruktioner().toLowerCase().contains(søgeord.toLowerCase())) {
                resultater.add(opskrift);
            }
        }
        return resultater;
    }
}