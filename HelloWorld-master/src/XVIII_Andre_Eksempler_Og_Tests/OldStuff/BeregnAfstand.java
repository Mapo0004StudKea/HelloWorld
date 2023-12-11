package XVIII_Andre_Eksempler_Og_Tests.OldStuff;

import java.util.Scanner;

public class BeregnAfstand {

    public static void main(String[] args) {
        System.out.println("indtast fire tal for to koordinator.");
        Scanner input = new Scanner(System.in);
        //forkortet udgave med specifikke tal
        //int x1, x2, y1, y2;
        //x1=5;y1=3;x2=2;y2=3;
        double dis;
        System.out.println("skriv det første tal");
        int x1 = input.nextInt();
        System.out.println("skriv det andet tal");
        int x2 = input.nextInt();
        System.out.println("skriv det tredje tal");
        int y1 = input.nextInt();
        System.out.println("skriv det fjerde tal");
        int y2 = input.nextInt();

        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("afstanden mellem de to punkter er:"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }

}

