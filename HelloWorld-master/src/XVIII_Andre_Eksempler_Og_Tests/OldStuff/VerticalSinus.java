package XVIII_Andre_Eksempler_Og_Tests.OldStuff;

public class VerticalSinus {
    final static int STEPS = 30;
    final static double STEPSIZE = Math.PI / 8;
    final static int MULTIPLIER = 20;

    public static void main(String[] args) {
        for (int x = 0; x < STEPS; x++) {
            int y = (int) (Math.sin(x * STEPSIZE) * MULTIPLIER);
            String str = "";
            for (int i = -MULTIPLIER; i < MULTIPLIER; i++) {
                if (i == y) {
                    str += "*";
                } else if (i == 0) {
                    str += "|";
                } else {
                    str += " ";
                }
            }
            System.out.println(str);
        }
    }
}
