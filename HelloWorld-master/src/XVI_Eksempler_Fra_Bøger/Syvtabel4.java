package XVI_Eksempler_Fra_Bøger;

/**
 * Man kan lave løkker i løkker. Herunder udregner vi n*7 ved at lægge 7 sammen n gange:
 */
public class Syvtabel4 {
    public static void main(String[] arg)
    {
        for (int n=1; n<=10; n=n+1)
        {
            int sum = 0;
            for (int j=0; j<n; j++) {
                sum = sum + 7;
                System.out.print(sum+"..");  // print = println, men uden linjeskift
            }

            System.out.println(" syv gange "+n+" giver: "+ sum);
        }
    }
}
