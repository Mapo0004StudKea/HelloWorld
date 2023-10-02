package XVII_Andre_Eksempler_Og_Tests.OldStuff.Robozzle;

public class Solution2 {
    public static String level =
            "......bB\n" +
                    ".....bb.\n" +
                    "....bb..\n" +
                    "...bb...\n" +
                    "..bb....\n" +
                    ".bb.....\n" +
                    "bb......\n" +
                    "0 0 r";

    public static void main(String[] args) {
        Robot.loadLevel(level);

        // Indsæt din kode her.
        while(true){
            Robot.move();
        }
    }
}

