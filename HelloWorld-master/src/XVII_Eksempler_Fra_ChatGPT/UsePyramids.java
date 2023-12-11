package XVII_Eksempler_Fra_ChatGPT;

class Pyramid {
    private double side;
    private double height;

    public Pyramid(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double calculateVolume() {
        return (side * side * height) / 4.0;
    }

    @Override
    public String toString() {
        return "Pyramid [Side: " + side + ", Height: " + height + "]";
    }
}

public class UsePyramids {
    public static void main(String[] args) {
        Pyramid pyramid1 = new Pyramid(5.0, 8.0);
        Pyramid pyramid2 = new Pyramid(7.0, 12.0);
        Pyramid pyramid3 = new Pyramid(3.0, 6.0);

        double volume1 = pyramid1.calculateVolume();
        double volume2 = pyramid2.calculateVolume();
        double volume3 = pyramid3.calculateVolume();

        System.out.println(pyramid1);
        System.out.println(pyramid2);
        System.out.println(pyramid3);

        System.out.println("Volume of Pyramid 1: " + volume1);
        System.out.println("Volume of Pyramid 2: " + volume2);
        System.out.println("Volume of Pyramid 3: " + volume3);
    }

}
