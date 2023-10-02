package VIII_Klasser_Og_Objekter;

public class UsePyramids {
    public static void main(String[] args) {
    Pyramid pyramid1 = new Pyramid(5.0, 12.75);
    Pyramid pyramid2 = new Pyramid(3.25, 100.95);
    Pyramid pyramid3 = new Pyramid(8.75, 14.25);

    double volume1 = pyramid1.volume();
    double volume2 = pyramid2.volume();
    double volume3 = pyramid3.volume();

     System.out.println(volume1);
     System.out.println(volume2);
     System.out.println(volume3);

     System.out.println("Volumen på den første pyramide er: "+pyramid1.volume());
     System.out.println("Volumen på den anden pyramide er: "+pyramid2.volume());
     System.out.println("volume på den sidste pyramide er: "+pyramid3.volume());
    }
}

class Pyramid {
    private final double side;
    private final double height;

    public Pyramid(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double volume() {
        return (side * side * height) / 4;
    }
    @Override
    public String toString() {
        return "Pyramid [Side: " + side + ", Height: " + height + "]";
    }
}
