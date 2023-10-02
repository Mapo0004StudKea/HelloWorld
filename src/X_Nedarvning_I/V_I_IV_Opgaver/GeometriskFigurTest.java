package X_Nedarvning_I.V_I_IV_Opgaver;

public class GeometriskFigurTest {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(2.0, 3.0);
        Linje linje = new Linje(5.0);
        Cirkel cirkel = new Cirkel(4.0);
        Rektangel rektangel = new Rektangel(3.0, 6.0);

        System.out.println("Punkt - Areal: " + punkt.beregnAreal() + ", Omkreds: " + punkt.beregnOmkreds());
        System.out.println("Linje - Areal: " + linje.beregnAreal() + ", Omkreds: " + linje.beregnOmkreds());
        System.out.println("Cirkel - Areal: " + cirkel.beregnAreal() + ", Omkreds: " + cirkel.beregnOmkreds());
        System.out.println("Rektangel - Areal: " + rektangel.beregnAreal() + ", Omkreds: " + rektangel.beregnOmkreds());
    }
}
abstract class Figur {
    public abstract double beregnAreal();
    public abstract double beregnOmkreds();
}

class Punkt extends Figur {
    private final double x;
    private final double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double beregnAreal() {
        return 0.0;
    }

    @Override
    public double beregnOmkreds() {
        return 0.0;
    }
}

class Linje extends Figur {
    private final double length;

    public Linje(double length) {
        this.length = length;
    }

    @Override
    public double beregnAreal() {
        return 0.0;
    }

    @Override
    public double beregnOmkreds() {
        return length;
    }
}

class Cirkel extends Figur {
    private final double radius;

    public Cirkel(double radius) {
        this.radius = radius;
    }

    @Override
    public double beregnAreal() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double beregnOmkreds() {
        return 2 * Math.PI * radius;
    }
}

class Rektangel extends Figur {
    private final double height;
    private final double width;

    public Rektangel(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double beregnAreal() {
        return height * width;
    }

    @Override
    public double beregnOmkreds() {
        return 2 * (height + width);
    }
}