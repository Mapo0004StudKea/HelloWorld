package XIII_Array.Opgaver;

public class DiceArray extends Dice{
    public static void main(String[] args) {
        Dice dice = new Dice();
        int[] resultatAfKast = new int[100];

        for (int i=0; i<100;i++) {
            int kastResultat = dice.roll();
            resultatAfKast[i] = kastResultat;
        }

        System.out.println("Resultater af terningekast:");
        int antalSeksere = 0;
        for (int i = 0; i<100; i++) {
            System.out.print(resultatAfKast[i]+" ");
            if (resultatAfKast[i] == 6) {
                antalSeksere++;
            }
        }
        int s = sum(resultatAfKast);
        System.out.println("\nSum = "+s);
        System.out.println("\nAntal gange 6 blev kastet: "+antalSeksere);
    }
//testtest
    static int sum(int[] arr) {
        int result = 0;
        for (int i=0;i<arr.length;i++) result=result+arr[i];
        return result;
    }
}
