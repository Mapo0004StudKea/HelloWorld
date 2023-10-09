package XVII_Eksempler_Fra_ChatGPT.DTU_Opgaver;

import java.util.Scanner;

/*
Fibonacci-tal
Skriv et program der skriver de n første fibonacci tal. Antallet af fibonacci-tal der skal udskrives (n) skal indlæses fra konsollen.
Eksempel:
Der indtastes 5, og outputtet skal se ud som følger:
1
1
2
3
5
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast antal Fibonacci-tal, der skal udskrives: ");
        int n = scanner.nextInt();

        printFibonacciNumbers(n);

        scanner.close();
    }
    public static void printFibonacciNumbers(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
/*
I dette program:

   Vi bruger en metode kaldet printFibonacciNumbers, der tager antallet af Fibonacci-tal (n) som input og
   udskriver de første n Fibonacci-tal.
   Vi initialiserer to variable, first og second, til de første to Fibonacci-tal (1 og 1).
   Derefter bruger vi en for-løkke til at beregne og udskrive de næste Fibonacci-tal ved at tilføje de to tidligere tal.
   Vi opdaterer first og second i hver iteration for at beregne de efterfølgende tal.

Når du kører programmet og indtaster f.eks. 5 som antallet af Fibonacci-tal, vil det udskrive de første 5 Fibonacci-tal,
som vist i dit eksempel. Du kan ændre værdien af n efter behov.
 */