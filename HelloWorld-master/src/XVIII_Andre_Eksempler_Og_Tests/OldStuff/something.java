package XVIII_Andre_Eksempler_Og_Tests.OldStuff;


public class something {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //int t = 0;
        //double x;
        //while (t < 10) {
        //x = Math.random();
        //t = t + 1;
        //if (x < 0.5) {
        //StdDraw.setPenColor(StdDraw.RED);
        //}
        //if (x > 0.5) {
        //StdDraw.setPenColor(StdDraw.GREEN);
        //}
        //StdDraw.circle(x, 0.5, 0.1);
        //}
        int t = 0;
        double x;
        double c;

        while (t < 10) {
            x = Math.random();
            c = Math.random();
            if (c < 0.5) {
                StdDraw.setPenColor(StdDraw.RED);
            } else {
                StdDraw.setPenColor(StdDraw.GREEN);
            }
            StdDraw.circle(x, 0.5, 0.1);
            t = t + 1;


        }

    }

}

