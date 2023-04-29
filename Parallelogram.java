public class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(double s1, double s2, double h) {
        super(s1, s2, s1, s2);
        height = h;
    }
    

    public double CalculateArea() {
        return side1 * height;
    }

}