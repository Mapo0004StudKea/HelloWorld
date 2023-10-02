package VIII_Klasser_Og_Objekter;

public class MinEgenKlasse {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);
        Car car3 = new Car("Ford", "Mustang", 2023);

        String carInfo1 = car1.toString();
        String carInfo2 = car2.toString();
        String carInfo3 = car3.toString();

        System.out.println(carInfo1);
        System.out.println(carInfo2);
        System.out.println(carInfo3);

        System.out.println("Information about the first car: " + carInfo1);
        System.out.println("Information about the second car: " + carInfo2);
        System.out.println("Information about the third car: " + carInfo3);
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [Make: " + make + ", Model: " + model + ", Year: " + year + "]";
    }
}