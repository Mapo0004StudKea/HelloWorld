package XVII_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Lav en klasse TestCar, der opretter nogle Car objekter, sammenligner deres mærker og udskriver oplysninger om dem.
 */
public class TestCar {
    public static void main(String[] args) {
        // Opret nogle Car-objekter
        Car car1 = new Car("SV 27698", "rød", "Citroën");
        Car car2 = new Car("AB 12345", "blå", "Toyota");
        Car car3 = new Car("XY 98765", "rød", "Citroën");

        // Sammenlign mærkerne og udskriv oplysninger
        if (car1.alike(car2)) {
            System.out.println("Car 1 og Car 2 er ens i mærke og farve.");
        } else {
            System.out.println("Car 1 og Car 2 er ikke ens i mærke og farve.");
        }

        if (car1.alike(car3)) {
            System.out.println("Car 1 og Car 3 er ens i mærke og farve.");
        } else {
            System.out.println("Car 1 og Car 3 er ikke ens i mærke og farve.");
        }

        // Udskriv oplysninger om bilerne
        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Car 3: " + car3.toString());
    }
}
/*
I denne klasse oprettes tre Car-objekter, og deres oplysninger sammenlignes ved hjælp af alike-metoden for at se,
om de har samme mærke og farve. Derefter udskrives oplysninger om bilerne.

Du kan tilføje flere Car-objekter og udføre yderligere sammenligninger efter behov.
 */