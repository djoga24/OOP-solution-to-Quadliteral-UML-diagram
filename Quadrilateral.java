public abstract class Quadrilateral {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    public Quadrilateral(double s1, double s2, double s3, double s4) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        side4 = s4;
    }

    public abstract double CalculateArea();

    public double CalculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }
}




