package XVI_Eksempler_Fra_ChatGPT.DTU_Opgaver;
/*
Lav en klasse Point, der repræsenterer punkter i et koordinatsystem (x,y).
Klassen skal have en konstruktør med følgende signatur: Point(int, int) samt følgende metoder:

public String toString() // returnerer en streng repræsentation af punktet
public boolean equals(Point point) // undersøger om to punkter er ens
public void move(int dx, int dy)  // flytter punktet med dx, dy

Metoden toString() skal formatere punktet som en streng på formen "(x,y)".
 */
/*
public class Point {
    public String y;
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public boolean equals(Point point) {
        return this.x == point.x && this.y == point.y;
    }
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        System.out.println("Point 1: " + point1.toString());
        System.out.println("Point 2: " + point2.toString());

        if (point1.equals(point2)) {
            System.out.println("Point 1 og Point 2 er ens.");
        } else {
            System.out.println("Point 1 og Point 2 er ikke ens.");
        }

        point1.move(2, 3);
        System.out.println("Efter flytning af Point 1: " + point1.toString());
    }
}

 */
/*
I denne klasse er der to private felter (x og y), der repræsenterer koordinaterne for punktet.
Konstruktøren initialiserer disse felter, når et nyt Point-objekt oprettes.

Der er også tre metoder:

    toString(): Returnerer punktet som en streng på formen "(x,y)".
    equals(Point point): Sammenligner to punkter for lighed ved at sammenligne deres x- og y-koordinater.
    move(int dx, int dy): Flytter punktet med det specificerede dx og dy.

I main-

 */