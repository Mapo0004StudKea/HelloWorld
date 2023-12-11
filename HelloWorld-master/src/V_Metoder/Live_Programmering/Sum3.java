package V_Metoder.Live_Programmering;

public class Sum3 {
    public static void main(String[] args) {
        int a=3; int b=5; int c=18; int sum;

        sum=plus(a,b,c);
        System.out.println("Summen af: "+sum);

    }
    static int plus (int a, int b, int c) {
        int result = a+b+c;
        return result;
    }
}
