public class Rhombus extends Quadrilateral {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double d1, double d2) {
        super(Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2)) * 2, 
              Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2)) * 2, 
              Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2)) * 2, 
              Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2)) * 2);
        diagonal1 = d1;
        diagonal2 = d2;
    }

    public double CalculateArea() {
        return diagonal1 * diagonal2 / 2;
    }
}