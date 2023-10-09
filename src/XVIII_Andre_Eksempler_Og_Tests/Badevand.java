package XVIII_Andre_Eksempler_Og_Tests;

public class Badevand {
    public static void main(String[] args)
    {
     //   int[] badetemp = new int[args.length];
       // for (int i = 0; i < args.length; i++) {
         //   badetemp[i] = Integer.parseInt(args[i]);
        //}
        int[] badetemp = { 12, 10, 12, 14, 15, 16, 18, 18, 15, 100, 12, 55, 3 };
        System.out.println("Maksimum: " + maks(badetemp));
        System.out.println("Antal fald: " + antalfald(badetemp));

    }

    public static int maks(int[] badetemp){
        int makstemp = 0;
        for (int i = 0; i < badetemp.length; i++) {
            if (badetemp[i] > makstemp){
                makstemp = badetemp[i];
            }
        }
        return makstemp;
    }

    public static int antalfald(int[] badetemp){
        int fald = 0;
        for (int i = 1; i < badetemp.length; i++) {
            if (badetemp[i] < badetemp[i-1]){
                fald++;
            }
        }
        return fald;
    }
}
