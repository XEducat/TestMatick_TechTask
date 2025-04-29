import java.util.List;
import Interfaces.Shape;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = ShapeFactory.generateRandomShapes(5, 15);
        printShapes(shapes);
    }

    private static void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }
    }
} 