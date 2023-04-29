
public class Rectangle extends Quadrilateral {
    public Rectangle(double l, double w) {
        super(l, w, l, w);
    }

    public double CalculateArea() {
        return side1 * side2;
    }
}