package IV_Løkker.SecondGo;

public class PlusMedLøkker {
    public static void main(String[] args) {
        int sum = 0;

        for (int i=1; i<=20; i++) {
            sum += i;
            System.out.println(i+" + sum er: "+sum);
        }
        System.out.println("summmen at regnestykket 1+2+3+...+20 = "+sum);
    }
}
