package XI_Nedarvning_II.Opgaver;

import java.util.Scanner;

public class PolynomiumApp {
    public static void main(String[] args) {
        System.out.println("Et forstegradspolynomium bliver udregnet med følgende formel: "+"f(x)=a*x+b\n");
        Polynomium poly1 = new forsteGradsPolynomium(0,0);
        System.out.println(poly1);
        System.out.println("f(x)="+poly1.f(0));

        System.out.println("Et andengradspolynomium bliver udregnet med følgende formel: "+"f(x)=a*x^2+b*x+c\n");
        Polynomium poly2 = new andenGradsPolynomium(0, 0, 0);
        System.out.println(poly2);
        System.out.println("f(x)="+poly2.f(0));

        System.out.println("Et tredjegradspolynomium bliver udregnet med følgende formel: "+"f(x)=a*x^3+b*x^2+c*x+d\n");
        Polynomium poly3 = new trejdeGradsPolynomium(0, 0, 0, 0);
        System.out.println(poly3);
        System.out.println("f(x)="+poly3.f(0));
    }
}

abstract class Polynomium {
    abstract double f(double x);
}

class forsteGradsPolynomium extends Polynomium {
    int a; int b;
    forsteGradsPolynomium(int A, int B) {
        a = A;
        b = B;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for a: ");
        a = scanner.nextInt();
        System.out.println("Indtast værdi for b: ");
        b = scanner.nextInt();
    }
    double f(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for x: ");
        x = scanner.nextInt();
        return a*x+b;
    }
    @Override
    public String toString() {
        return "a værdi: "+a+" b værdi: "+b;
    }
}

class andenGradsPolynomium extends Polynomium {
    int a; int b; int c;
    andenGradsPolynomium(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for a: ");
        a = scanner.nextInt();
        System.out.println("Indtast værdi for b: ");
        b = scanner.nextInt();
        System.out.println("Indtast værdi for c: ");
        c = scanner.nextInt();
    }
    double f(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for x: ");
        x = scanner.nextInt();
        return a*(x*x)+b*x+c;
    }
    @Override
    public String toString() {
        return "a værdi: "+a+" b værdi: "+b+" c værdi: "+c;
    }
}

class trejdeGradsPolynomium extends Polynomium {
    int a; int b; int c; int d;
    trejdeGradsPolynomium (int A, int B, int C, int D) {
        a=A;b=B;c=C;d=D;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for a: ");
        a = scanner.nextInt();
        System.out.println("Indtast værdi for b: ");
        b = scanner.nextInt();
        System.out.println("Indtast værdi for c: ");
        c = scanner.nextInt();
        System.out.println("Indtast værdi for d: ");
        d = scanner.nextInt();
    }
    double f(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast værdi for x: ");
        x = scanner.nextInt();
        return a*(x*x*x)+b*(x*x)+c*x+d;
    }
    @Override
    public String toString() {
        return "a værdi: "+a+" b værdi: "+b+" c værdi: "+c+" d værdi "+d;
    }
}