package XVII_Andre_Eksempler_Og_Tests.OldStuff.Robozzle;

public class SolutionIntro3 {
    public static String level =
            "BbbbbbbbbbB\n" +
                    "5 0 r";

    public static void main(String[] args) {
        Robot.loadLevel(level);

        //Indsæt din kode her.
        int t;
        // brug int t; hvis du skal bruge en teller
        t = 0;
        //sætter t til er være 0
        while(t < 5) {
            Robot.move();
            t = t + 1;
        }
        Robot.turnRight();
        Robot.turnRight();
        while(true) {
            Robot.move();
        }
    }
}

