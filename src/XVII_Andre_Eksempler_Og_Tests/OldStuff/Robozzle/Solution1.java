package XVII_Andre_Eksempler_Og_Tests.OldStuff.Robozzle;

public class Solution1 {
    public static String level =
            "BbbbbbbbbbR\n" +
                    "5 0 r";

    public static void main(String[] args) {
        Robot.loadLevel(level);

        // Indsæt din kode her.
        while(true){
            Robot.move();
            if(Robot.isRed()) {
                Robot.turnRight();
                Robot.turnRight();
            }
        }

    }
}

