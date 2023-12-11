package XVIII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast temperaturen i fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double Celcius = (Fahrenheit - 32) / 1.8;
        System.out.println("Temperaturen i celsius er: " + Celcius);
    }

}

