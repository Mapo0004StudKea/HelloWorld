package XIII_Array.Opgaver;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private List<Points> vertices;

    public Polygon() {
        vertices = new ArrayList<>();
    }

    public void addVertex(Points point) {
        vertices.add(point);
    }

    public List<Points> getVertices() {
        return vertices;
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;
        int numVertices = vertices.size();

        if (numVertices < 2) {
            return perimeter; // Perimeter is 0 for less than 2 vertices
        }

        for (int i = 0; i < numVertices; i++) {
            Points current = vertices.get(i);
            Points next = vertices.get((i + 1) % numVertices); // Wrap around to the first vertex for the last iteration

            perimeter += current.beregnAfstand(next);
        }

        return perimeter;
    }

    public double calculateArea() {
        double area = 0.0;
        int numVertices = vertices.size();

        if (numVertices < 3) {
            return area; // Area is 0 for less than 3 vertices (not a polygon)
        }

        for (int i = 0; i < numVertices; i++) {
            Points current = vertices.get(i);
            Points next = vertices.get((i + 1) % numVertices); // Wrap around to the first vertex for the last iteration

            area += (current.x * next.y - next.x * current.y);
        }

        area = Math.abs(area) / 2.0;

        return area;
    }

    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.addVertex(new Points(0, 0));
        polygon.addVertex(new Points(4, 0));
        polygon.addVertex(new Points(4, 3));
        polygon.addVertex(new Points(2, 5));
        polygon.addVertex(new Points(0, 3));

        double perimeter = polygon.calculatePerimeter();
        double area = polygon.calculateArea();

        System.out.println("Vertices of the polygon:");
        for (Points point : polygon.getVertices()) {
            System.out.println(point);
        }

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}