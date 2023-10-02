package XVII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class PasswordTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Indtast dit password:");
            String pass = scan.next();
            if(pass.length() < 4){
                System.out.println("Dit password er for kort! "
                        + "Det skal være mindst 4 tegn og dit er "
                        + pass.length());
            }else if(pass.length() > 9){
                System.out.println("Dit password er for langt! "
                        + "Det skal være højest 9 tegn og dit er "
                        + pass.length());
            }else{
                System.out.println("Dit password er accepteret. " +
                        "Det er " + pass.length() + " tegn langt");
                break;
// return;
// System.exit(0);
            }
        }
    }
}
