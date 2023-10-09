package XVII_Eksempler_Fra_ChatGPT.KEA_Opgaver;
/*
Skriv et program, som for ligningen y=3*x*x+6*x+9 udskriver værdierne af y for x=0, x=1,x= 2, x=3
... x=10. Ret det derefter til at skrive ud for x=0,x=10,x=20,x=30...x=100.
 */
public class LigningUdregning {
    public static void main(String[] args) {
        System.out.println("Ligning: y = 3 * x * x + 6 * x + 9");

        for (int x = 0; x <= 10; x++) {
            double y = 3 * x * x + 6 * x + 9;
            System.out.println("For x = " + x + ", y = " + y);
        }
    }
}
/*
Dette program bruger en for-løkke til at iterere gennem x-værdierne fra 0 til 10 og beregne de
tilsvarende y-værdier for ligningen. Resultaterne udskrives for hver x-værdi.

Hvis du vil ændre programmet til at udskrive for x = 0, 10, 20, 30...100, kan du opdatere løkken som følger:
 */

/*
for (int x = 0; x <= 100; x += 10) {
    double y = 3 * x * x + 6 * x + 9;
    System.out.println("For x = " + x + ", y = " + y);
}
Dette ændrer skridtet mellem x-værdierne til 10 og udskriver resultaterne for x-værdierne 0, 10, 20, 30...100.
 */