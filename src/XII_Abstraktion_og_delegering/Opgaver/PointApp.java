package XII_Abstraktion_og_delegering.Opgaver;

import java.text.DecimalFormat;

public class PointApp {
    public static void main(String[] args) {
        Points A = new Points(10, 2);
        Points B = new Points(4, 7);
        Points C = new Points(1, -3);

        System.out.println("Punkt A = " + A);
        System.out.println("Punkt B = " + B);
        System.out.println("Punkt C = " + C);

        double distanceAB = A.beregnAfstand(B);
        double distanceAC = A.beregnAfstand(C);
        double distanceBC = B.beregnAfstand(C);

        double minDistance = Math.min(Math.min(distanceAB, distanceAC), distanceBC);
        //double AfstandAB = Math.

        if (minDistance == distanceAB) {
            System.out.println("Den korteste afstand er mellem A og B: " + minDistance);
        } else if (minDistance == distanceAC) {
            System.out.println("Den korteste afstand er mellem A og C: " + minDistance);
        } else {
            System.out.println("Den korteste afstand er mellem B og C: " + minDistance);
        }
    }

}


class Points {
    double y;
    double x;

    Points (double x, double y) {
        this.y = y;
        this.x = x;
    }
    public double beregnAfstand(Points other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public String toString() {
        //DecimalFormat df = new DecimalFormat("#.##");
        //return "(" + df.format(x) + ", " + df.format(y) + ")";
        return "(" + x + ", " + y + ")";
    }
}