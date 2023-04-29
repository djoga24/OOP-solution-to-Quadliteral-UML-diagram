public class Main {
    public static void main(String[] args) {
        // create instances of the different quadrilateral classes
        Parallelogram parallelogram = new Parallelogram(6, 7, 3);
        Rhombus rhombus = new Rhombus(6, 8);
        Rectangle rectangle = new Rectangle(4, 9);
        Square square = new Square(6);

        System.out.println();

        // calculate and print the areas and perimeters of each shape
        System.out.println("Parallelogram:");
        System.out.println("Area: " + parallelogram.CalculateArea());
        System.out.println("Perimeter: " + parallelogram.CalculatePerimeter());
        System.out.println();

        System.out.println("Rhombus:");
        System.out.println("Area: " + rhombus.CalculateArea());
        System.out.println("Perimeter: " + rhombus.CalculatePerimeter());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.CalculateArea());
        System.out.println("Perimeter: " + rectangle.CalculatePerimeter());
        System.out.println();

        System.out.println("Square:");
        System.out.println("Area: " + square.CalculateArea());
        System.out.println("Perimeter: " + square.CalculatePerimeter());
        System.out.println();
    }
}