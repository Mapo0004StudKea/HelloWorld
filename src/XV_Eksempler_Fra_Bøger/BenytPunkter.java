package XV_Eksempler_Fra_Bøger;

import java.awt.Point;

public class BenytPunkter {
    public static void main(String[] args) {
        Point p;
        p = new Point();

        int a;

        a=p.x;
        System.out.println("a: "+a);

        System.out.println("1 x-koordinat: "+p.x);
        System.out.println("1 y-koordinat: "+p.y);

        p.x = 110;
        p.y = 210;

        System.out.println("2 x-koordinat: "+p.x);
        System.out.println("2 y-koordinat: "+p.y);

        p.move(200, 300);
        System.out.println("3 x-koordinat: "+p.x);
        System.out.println("3 y-koordinat: "+p.y);

        p.x = p.x + 5;
        System.out.println("4 koordinater: "+p.toString());

        p.translate(-10,20);
        System.out.println("5 koordinater: "+p);
    }
}
