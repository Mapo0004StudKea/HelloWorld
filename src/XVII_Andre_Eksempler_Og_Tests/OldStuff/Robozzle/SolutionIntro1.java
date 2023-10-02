package XVII_Andre_Eksempler_Og_Tests.OldStuff.Robozzle;

public class SolutionIntro1 {
    public static String level =
            "bbbBbBBBb\n" +
                    "0 0 r";

    public static void main(String[] args) {
        Robot.loadLevel(level);

        // Indsæt din kode her.
        while(true){
            Robot.move();
        }
    }
}
