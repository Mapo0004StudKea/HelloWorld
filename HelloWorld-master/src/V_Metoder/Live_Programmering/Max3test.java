package V_Metoder.Live_Programmering;

import java.util.Scanner;

public class Max3test {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("indtast de tre værdier: ");
        System.out.println("Indtast det først tal: ");
        a = scanner.nextInt();
        System.out.println("Indtast det andet tal: ");
        b = scanner.nextInt();
        System.out.println("Indtast det sidste tal: ");
        c = scanner.nextInt();
        int d = max(a, b, c);
        int e = min(a, c, c);
        System.out.println("Det største tal er: "+d);
        System.out.println("Det mindste tal er: "+e);
        scanner.close();
    }

    static int max(int x, int y, int z) {
        if (x>y && x>z) {
            return x;
        } else if (y>z && y>x) {
            return y;
        } else if (z>x && z>y) {
            return z;
        } else return 0;
    }
    static int min(int x, int y, int z) {
        if (x<y && x<z) {
            return x;
        } else if (y<z && y<x) {
            return y;
        } else if (z<x && z<y) {
            return z;
        } else return 0;
    }
}
