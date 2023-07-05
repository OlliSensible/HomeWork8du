package homeWork;
import java.util.Scanner;

public class ShapeTestInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape;

        boolean validShape = false;
        do {
            System.out.println("Enter the shape name (Circle, Rectangle, Square, Oval, Rhombus):");
            String shapeName = scanner.nextLine().toLowerCase();

            switch (shapeName) {
                case "circle":
                    shape = new Circle();
                    validShape = true;
                    break;
                case "rectangle":
                    shape = new Rectangle();
                    validShape = true;
                    break;
                case "square":
                    shape = new Square();
                    validShape = true;
                    break;
                case "oval":
                    shape = new Oval();
                    validShape = true;
                    break;
                case "rhombus":
                    shape = new Rhombus();
                    validShape = true;
                    break;
                default:
                    System.out.println("I do not work with this figure. Enter again.");
                    shape = null;
            }
        } while (!validShape);

        ScannerMathAreaForShape scannerHelp = new ScannerMathAreaForShape();
        scannerHelp.calculateAndPrintArea(shape);
    }
}
