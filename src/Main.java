import java.util.List;
import java.util.Scanner;
import Interfaces.Shape;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minimum number of shapes: ");
        int minShapes = scanner.nextInt();

        System.out.print("Enter maximum number of shapes: ");
        int maxShapes = scanner.nextInt();

        List<Shape> shapes = ShapeFactory.generateRandomShapes(minShapes, maxShapes);
        printShapes(shapes);

        scanner.close();
    }

    private static void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }
    }
} 