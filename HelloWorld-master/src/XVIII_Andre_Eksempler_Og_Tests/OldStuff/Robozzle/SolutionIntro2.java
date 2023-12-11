package XVIII_Andre_Eksempler_Og_Tests.OldStuff.Robozzle;

public class SolutionIntro2 {
    public static String level =
            "bbbBbR\n" +
                    ".....B\n" +
                    "0 1 r";

    public static void main(String[] args) {
        Robot.loadLevel(level);

        // Indsæt din kode her.
        while(true){
            Robot.move();
            if(Robot.isRed()) {
                Robot.turnRight();
            }
        }
    }
}
