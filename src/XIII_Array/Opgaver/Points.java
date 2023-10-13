package XIII_Array.Opgaver;

public class Points {
    double y;
    double x;

    public Points(double x, double y) {
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