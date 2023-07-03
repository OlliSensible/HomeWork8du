package homeWork;
import java.util.Scanner;

public class ShapePrint {
    private Scanner scanner;

    public ShapePrint() {
        scanner = new Scanner(System.in);
    }

    public void printShapeName(Shape shape) {
        System.out.println(shape.getShapeName());
    }

    public void calculateAndPrintArea(Shape shape) {
        double area = 0.0;
        Color color;

        if (shape instanceof Circle) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            area = Math.PI * radius * radius;
        } else if (shape instanceof Rectangle) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            area = length * width;
        } else if (shape instanceof Square) {
            System.out.print("Enter the side length of the square: ");
            double sideLength = scanner.nextDouble();
            area = sideLength * sideLength;
        } else if (shape instanceof Oval) {
            System.out.print("Enter the major radius of the oval: ");
            double majorRadius = scanner.nextDouble();
            System.out.print("Enter the minor radius of the oval: ");
            double minorRadius = scanner.nextDouble();
            area = Math.PI * majorRadius * minorRadius;
        } else if (shape instanceof Rhombus) {
            System.out.print("Enter the diagonal 1 length of the rhombus: ");
            double diagonal1 = scanner.nextDouble();
            System.out.print("Enter the diagonal 2 length of the rhombus: ");
            double diagonal2 = scanner.nextDouble();
            area = (diagonal1 * diagonal2) / 2;
        }

        area = Math.round(area * 100.0) / 100.0;

        if (area < 20) {
            color = Color.RED;
        } else if (area >= 20 && area <= 50) {
            color = Color.YELLOW;
        } else {
            color = Color.BLUE;
        }

        System.out.println("Area of the shape: " + area);
        System.out.println("Color: " + color);
    }
}
