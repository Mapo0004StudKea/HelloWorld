package XVIII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class UseInput {

    public static void main(String[] args) {
        System.out.println("Hej! Hvad hedder du?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hej " + name);

        System.out.println("Hvor gammel er du?");
        int alder = input.nextInt();

        if (alder < 15) {
            System.out.println(alder + " år! du er ikke så gammel");
        }
        else if (alder > 25){
            System.out.println(alder + " år! du er virkelig gammel");
        }
        else {
            System.out.println(alder + " år! du er perfect alder");
        }


    }

}

