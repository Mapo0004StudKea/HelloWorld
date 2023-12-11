package XVII_Eksempler_Fra_ChatGPT;
/*
Skriv et program som beder brugerne om at indtaste et tegn.
Programmet skal herefter udskrive:

"Tegnet er et stort bogstav"	for A-Z
"Tegnet er et lille bogstav"	for a-z
"Tegnet er et tal"	for 0-9
"Tegnet er et af de 4 specialtegn"	(#, !, +, \)

Hvis tegnet ikke er indenfor de 4 ovennævnte grupper skrives
"Tegnet er ikke kendt af dette program".
 */

import java.util.Scanner;

public class CharacterTypeIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast et tegn: ");
        char tegn = scanner.next().charAt(0);

        if (tegn >= 'A' && tegn <= 'Z') {
            System.out.println("Tegnet er et stort bogstav");
        } else if (tegn >= 'a' && tegn <= 'z') {
            System.out.println("Tegnet er et lille bogstav");
        } else if (tegn >= '0' && tegn <= '9') {
            System.out.println("Tegnet er et tal");
        } else if (tegn == '#' || tegn == '!' || tegn == '+' || tegn == '\\') {
            System.out.println("Tegnet er et af de 4 specialtegn");
        } else {
            System.out.println("Tegnet er ikke kendt af dette program");
        }

        scanner.close();
    }
}
/*
I dette program:

    Vi bruger en Scanner til at indlæse brugerens indtastede tegn.
    Derefter bruger vi en række if-else if-betingelser til at identificere tegnets type baseret på tegnets karakterinterval.
    Hvis tegnet er inden for et af de definerede intervaller, udskrives den tilsvarende besked.
    Hvis tegnet ikke er inden for de kendte kategorier, udskrives "Tegnet er ikke kendt af dette program".
 */