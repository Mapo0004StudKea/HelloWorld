package XVII_Andre_Eksempler_Og_Tests;

public class SumAfTreTalIMetodetest {
    public static void main(String[] args) {
        int a=10; int b=30; int c=70; int sum; int sum2; int x = 10;
        sum = sum(a, b, c, x);
        sum2 = sum2(a, b);
        System.out.println("Summen af de tre tal er: "+sum);
        System.out.println("Summen af de to tal er: "+sum2);

    }

    static int sum(int a, int b, int c, int x){
        int result = a+b+c;
        System.out.println("x = "+x);
        return result;
    }

    static int sum2(int a, int b) {
        return a+b;
    }
}
