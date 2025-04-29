import Interfaces.Shape;
import Models.Circle;
import Models.Square;
import Models.Trapezoid;
import Models.Triangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Factory for creating random geometric shapes.
 * Implements the Factory pattern for creating objects of different shape types.
 */
public class ShapeFactory {
    private static final String[] COLORS = {"red", "blue", "green", "yellow", "black", "white"};
    private static final Random random = new Random();

    /**
     * Generates a list of random shapes within the specified range of quantity.
     *
     * @param minShapes minimum number of shapes to generate
     * @param maxShapes maximum number of shapes to generate
     * @return list of randomly generated shapes
     * @throws IllegalArgumentException if parameters are invalid (minShapes < 0 or maxShapes < minShapes)
     */
    public static List<Shape> generateRandomShapes(int minShapes, int maxShapes) {
        if (minShapes < 0 || maxShapes < minShapes) {
            throw new IllegalArgumentException("Incorrect parameters for the number of shapes");
        }

        List<Shape> shapes = new ArrayList<>();
        int numberOfShapes = random.nextInt(maxShapes - minShapes + 1) + minShapes;

        for (int i = 0; i < numberOfShapes; i++) {
            String color = COLORS[random.nextInt(COLORS.length)];
            Shape shape = createRandomShape(color);
            shapes.add(shape);
        }

        return shapes;
    }

    /**
     * Creates a random shape with the specified color.
     * Used to encapsulate the logic of creating specific types of shapes.
     *
     * @param color color of the shape
     * @return randomly created shape
     */
    private static Shape createRandomShape(String color) {
        int shapeType = random.nextInt(4);

        return switch (shapeType) {
            case 0 -> new Square(random.nextDouble() * 10 + 1, color);
            case 1 -> new Triangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, color);
            case 2 -> new Circle(random.nextDouble() * 5 + 1, color);
            case 3 -> new Trapezoid(
                    random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    color
            );
            default -> new Square(1, color);
        };
    }
} 