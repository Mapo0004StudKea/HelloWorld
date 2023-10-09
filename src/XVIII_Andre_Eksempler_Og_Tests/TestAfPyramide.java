package XVIII_Andre_Eksempler_Og_Tests;

public class TestAfPyramide {
    public static void main(String[] args) {
        Pyramide pyramide1 = new Pyramide(5.25, 50.75);
        Pyramide pyramide2 = new Pyramide(3.5, 6.25);
        Pyramide pyramide3 = new Pyramide(8.5, 9.1);

        double volumen1 = pyramide1.volumen();
        double volumen2 = pyramide2.volumen();
        double volumen3 = pyramide3.volumen();

        System.out.println(pyramide1);
        System.out.println(pyramide2);
        System.out.println(pyramide3);
        System.out.println("volument på den første pyramide er : "+volumen1);
        System.out.println("volumen på den anden pyramide er: "+volumen2);
        System.out.println("volumen på den sidste pyramide er : "+volumen3);
    }
}

class Pyramide {
    private double side;
    private  double height;

    Pyramide (double te, double st) {
        side=te;
        height=st;;
    }

    public double volumen() {
        return (side * side * height) / 4;
    }

    @Override
    public String toString() {
        return "Pyramid [Side: " + side + ", Height: " + height + "]";
    }
}